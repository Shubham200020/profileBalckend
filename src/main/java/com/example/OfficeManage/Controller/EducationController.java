package com.example.OfficeManage.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OfficeManage.POJO.Education;
import com.example.OfficeManage.Service.EducationService;

@RestController
@CrossOrigin("https://skmprofile.netlify.app")
@RequestMapping("/education")
public class EducationController extends EducationService{
	@PostMapping
	@Override
	public ResponseEntity<Education> save(@RequestBody Education data) {
		// TODO Auto-generated method stub
		return super.save(data);
	}
	@PostMapping("/delete")
	@Override
	public ResponseEntity<Education> delete(@RequestBody Education data) {
		// TODO Auto-generated method stub
		return super.delete(data);
	}
	@GetMapping
	@Override
	public ResponseEntity<List<Education>> getAll() {
		// TODO Auto-generated method stub
		return super.getAll();
	}
	
	@Override
	public ResponseEntity<Education> getById(String id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}
	
	
}
