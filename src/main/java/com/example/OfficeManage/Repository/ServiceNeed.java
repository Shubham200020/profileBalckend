package com.example.OfficeManage.Repository;

import java.util.List;


import org.springframework.http.ResponseEntity;



public interface ServiceNeed<T>{
	public ResponseEntity<T>save(T data);
	public ResponseEntity<T>delete(T data);
	public ResponseEntity<List<T>>getAll();
	public ResponseEntity<T>getById(String id);
}
