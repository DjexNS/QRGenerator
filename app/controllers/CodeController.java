package controllers;

import static play.libs.Json.toJson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import models.QRCode;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.qrCode;

public class CodeController extends Controller
{
	public static Result index() 
	{
	    return ok(qrCode.render());
		//return ok("You have successfully d");
	}
	
	//izlistava sve qr kodove
	public static Result qrCodes() 
    {
    	List<QRCode> qrCodes = new Model.Finder(String.class, QRCode.class).all();
    	return ok(toJson(qrCodes));
    }
	
	//izlistava id od qr kodova
	 public static Result qrCodeIds() 
	 {
		 List<Integer> qrCodes = new Model.Finder(String.class, QRCode.class).findIds();
		 return ok(toJson(qrCodes));
	 }
    
	 //prikazuje sliku izgenerisanog qr koda
    public static Result qrCode(String id) 
    {
    	QRCode qrCode = (QRCode) new Model.Finder(String.class, QRCode.class).byId(id);
    	byte[] byteArray = qrCode.getContent();
    	return ok(byteArray).as("image/png");
      //	return redirect(routes.CodeController.index());
    }
    
    //omogucava download qr koda
    public static Result download(String id) throws IOException
    {
    	QRCode qrCode = (QRCode) new Model.Finder(String.class, QRCode.class).byId(id);
	   	FileOutputStream fos = new FileOutputStream(".\\qrCode.png");
	   
		fos.write(qrCode.getContent());
		fos.close();
    	return ok("You have successfully downloaded the qrCode file to destination: " + new File("").getAbsolutePath() + "\\qrCode.png 	");
		
    }
}