package edu.iit.model;

import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;

public class Vacance {
	private Date  startDate;
	private Date endDate;
	public Vacance(){
		
	}
	public Vacance(Date startDate, Date endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		String myStartDate = DateFormatUtils.format(startDate, "E dd/MM/yyyy");
		String myEndDate = DateFormatUtils.format(endDate, "E dd/MM/yyyy");


		return "Vacance [startDate=" + myStartDate+ ", endDate=" +myEndDate + "]";
	}
	

}
