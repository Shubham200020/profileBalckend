package com.example.OfficeManage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.OfficeManage.POJO.DataSkm;
import com.example.OfficeManage.Repository.DataRepo;
@Service
public class DataService {
	@Autowired 
	private DataRepo data;
	public ResponseEntity<List<DataSkm>>getData(){
		return new ResponseEntity<List<DataSkm>>(data.findAll(),HttpStatus.OK);
	}
	
	public ResponseEntity<DataSkm>saveData(DataSkm ds){
		return new ResponseEntity<DataSkm>(data.save(ds),HttpStatus.OK);
	}
	
	public ResponseEntity<DataSkm>deleteById(DataSkm ds){
		DataSkm ds1=null;
		try {
			data.delete(ds);
			return new ResponseEntity<DataSkm>(ds,HttpStatus.OK);
		}
		catch (Exception e) {
			// TODO: handle exception
			
				return new ResponseEntity<DataSkm>(ds1,HttpStatus.BAD_GATEWAY);
			
		}
	}
}
