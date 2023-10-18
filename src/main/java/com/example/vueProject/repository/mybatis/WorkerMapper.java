package com.example.vueProject.repository.mybatis;

import com.example.vueProject.domain.Item;
import com.example.vueProject.domain.Worker;
import com.example.vueProject.repository.ItemSearchCond;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface WorkerMapper {
    void save(Worker worker);

    void update(@Param("officeId") int id, @Param("officeName") String name);

    Worker findById(@Param("officeId") int id);
    List<Worker> findAll();


}
