package com.example.OfficeManage.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.OfficeManage.POJO.Education;

@Repository
public interface EducationRepo extends MongoRepository<Education, String>{

}
