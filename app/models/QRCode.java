package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import play.db.ebean.Model;

@Entity
public class QRCode extends Model 
{
	@Id
	private String id;

	private String title;
	
	@Lob
	private byte[] content;

	public QRCode(String title, byte[] content) 
	{
		super();
		this.title = title;
		this.content = content;
	}
	
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public byte[] getContent() 
	{
		return content;
	}
	public void setContent(byte[] content) 
	{
		this.content = content;
	}
}