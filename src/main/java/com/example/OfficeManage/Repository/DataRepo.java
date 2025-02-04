package com.example.OfficeManage.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.OfficeManage.POJO.DataSkm;
@Repository
public interface DataRepo extends MongoRepository<DataSkm, String> {

}
