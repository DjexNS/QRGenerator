package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class CalendarEvent extends Model implements java.io.Serializable
{

	@Id
	private String id;

	private String title;
	private String description;
	private String startDate;
	private float duration;
//	private int recurrenceType;
//	private int recurrenceCount;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
/*	public int getRecurrenceType() {
		return recurrenceType;
	}
	public void setRecurrenceType(int recurrenceType) {
		this.recurrenceType = recurrenceType;
	}
	public int getRecurrenceCount() {
		return recurrenceCount;
	}
	public void setRecurrenceCount(int recurrenceCount) {
		this.recurrenceCount = recurrenceCount;
	}
*/	
	@Override
	public String toString() {
		return "CalendarEvent [title=" + title + ", description=" + description
				+ ", startDate=" + startDate + ", duration=" + duration
//				+ ", recurrenceType=" + recurrenceType + ", recurrenceCount="
//				+ recurrenceCount + "]";
				+ "]";
	}
	
	
}
