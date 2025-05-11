package com.example.OfficeManage.POJO;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
public class Education {
	@Id
	private String id;
	private Date startDate;
	private Date endDate;
	private String univercity;
	private String instituteName;
	private String degree;
	private String place;
	private String marks;
	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Education(String id, Date startDate, Date endDate, String univercity, String instituteName, String degree,
			String place, String marks) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.univercity = univercity;
		this.instituteName = instituteName;
		this.degree = degree;
		this.place = place;
		this.marks = marks;
	}



	public String getMarks() {
		return marks;
	}



	public void setMarks(String marks) {
		this.marks = marks;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getUnivercity() {
		return univercity;
	}

	public void setUnivercity(String univercity) {
		this.univercity = univercity;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}
	
	

}
