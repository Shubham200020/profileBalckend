package com.example.OfficeManage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OfficeManage.POJO.DataSkm;
@Repository
public interface DataRepo extends JpaRepository<DataSkm, Integer> {

}
