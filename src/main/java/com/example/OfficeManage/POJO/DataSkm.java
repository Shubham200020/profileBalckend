package com.example.OfficeManage.POJO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document()
public class DataSkm {
	
	public String name;
	
	public String phone;
	
	public String subject;
	public String email;
	
	public String messege;
	
	public DataSkm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataSkm( String name, String phone, String subject, String email, String messege) {
		super();
		
		this.name = name;
		this.phone = phone;
		this.subject = subject;
		this.email = email;
		this.messege = messege;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessege() {
		return messege;
	}
	public void setMessege(String messege) {
		this.messege = messege;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
