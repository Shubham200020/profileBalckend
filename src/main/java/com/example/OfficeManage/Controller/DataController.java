package com.example.OfficeManage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OfficeManage.POJO.DataSkm;
import com.example.OfficeManage.Service.DataService;

@RestController
@RequestMapping("/data")
@CrossOrigin("**")
public class DataController {
	@Autowired
	private DataService dsr;
	@PostMapping
	public ResponseEntity<DataSkm>savedata(@RequestBody DataSkm ds){
		return dsr.saveData(ds);
		
	}
	@GetMapping
	public ResponseEntity<List<DataSkm>>getAlldata(){
		return dsr.getData();
		
	}
	@PostMapping("/delete")
	public ResponseEntity<DataSkm>deleteData(@RequestBody DataSkm ds){
		return dsr.deleteById(ds);
		
	}
}
