package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import models.*;
import play.data.Form;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

import org.json.JSONObject;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import play.db.ebean.Model;
import static play.libs.Json.*;



public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    //dodaje osobu iz forme u bazu - ne koristi se jer nema forme
    public static Result addPerson() 
    {
    	Person person = Form.form(Person.class).bindFromRequest().get();
    	person.save();
    	return redirect(routes.Application.index());
    }

    //izlistava sve osobe - ne koristi se
    public static Result getPersons() 
    {
    	List<Person> persons = new Model.Finder(String.class, Person.class).all();
    	return ok(toJson(persons));
    }
    
    // dodaje novi event sa forme, serializuje ga u JSON objekat
    public static Result addEvent() throws IOException 
    {
    	CalendarEvent event = Form.form(CalendarEvent.class).bindFromRequest().get();
    	event.save();
    	
    	JSONObject json = new JSONObject(event);
    	
    	
    	//deo za deserializaciju 
    	//	GsonBuilder gson = new GsonBuilder();
    	//CalendarEvent event1=	gson.create().fromJson(json.toString(), CalendarEvent.class);
    	//return ok("asdfasdf" + event1);	
    	
    	try 
    	{
    		//pravi sliku (niz bajtova) tako sto poziva QRCodeGenerator
    		byte[] imageInByte = createImage(json.toString());
			
    		//pravi objekat u bazi QRCode
			QRCode qrCode = new QRCode(event.getTitle(), imageInByte);
	    	qrCode.save();
		} 
    	catch (IOException e) 
    	{
			e.printStackTrace();
		}
    	
    	return redirect(routes.Application.index());
    }
    
    //poziva QRCodeGenerator i pravi BufferedImage koji pretvara u niz bajtova
    private static byte[] createImage(String qrString) throws IOException
    {
    	BufferedImage image = QRCodeGenerator.generateQR(qrString);
    	
    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
    	ImageIO.write( image, "png", baos );
    	baos.flush();
    	byte[] imageInByte = baos.toByteArray();
    	baos.close();
    	return imageInByte;
    }
    
    //izlistava sve eventove
    public static Result getEvents() 
    {
    	List<CalendarEvent> events = new Model.Finder(String.class, CalendarEvent.class).all();
    	return ok(toJson(events));
    }

}
