package com.example.OfficeManage.POJO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DataSkm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	@Column(length = 50)
	public String name;
	@Column(length = 10)
	public String phone;
	@Column(length = 50)
	public String subject;
	public String email;
	@Column(length = 220)
	public String messege;
	
	public DataSkm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataSkm(Integer id, String name, String phone, String subject, String email, String messege) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.subject = subject;
		this.email = email;
		this.messege = messege;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
