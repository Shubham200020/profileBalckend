package com.example.OfficeManage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OfficeManage.POJO.DataSkm;
import com.example.OfficeManage.Service.DataService;

@RestController
@RequestMapping("/data")
@CrossOrigin("https://skmprofile.netlify.app")
public class DataController {
	@Autowired
	private DataService dsr;
	@PostMapping("/insert")
	public ResponseEntity<DataSkm>savedata(@RequestBody DataSkm ds){
		return dsr.saveData(ds);
		
	}
	@GetMapping
	public ResponseEntity<List<DataSkm>>getAlldata(){
		return dsr.getData();
		
	}
	@GetMapping("/delete")
	public ResponseEntity<DataSkm>deleteData(@RequestBody DataSkm ds){
		return dsr.deleteById(ds);
		
	}
	@GetMapping("/displayData")
	public String Display(){
		return "Hello User";
		
	}
}
