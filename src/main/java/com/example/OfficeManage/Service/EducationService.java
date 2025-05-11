package com.example.OfficeManage.Service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.OfficeManage.POJO.DataSkm;
import com.example.OfficeManage.POJO.Education;
import com.example.OfficeManage.Repository.EducationRepo;
import com.example.OfficeManage.Repository.ServiceNeed;

@Service
public class EducationService implements ServiceNeed<Education> {
	private EducationRepo education;

	@Override
	public ResponseEntity<Education> save(Education data) {
		// TODO Auto-generated method stub
		return new ResponseEntity<Education>(education.save(data),HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<Education> delete(Education data) {
		// TODO Auto-generated method stub
		education.delete(data);
		return  new ResponseEntity<Education>(data,HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<List<Education>> getAll() {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<Education>>(education.findAll(),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Education> getById(String id) {
		// TODO Auto-generated method stub
		return new ResponseEntity<Education>(education.findById(id).get(),HttpStatus.OK);
	}
	
}
