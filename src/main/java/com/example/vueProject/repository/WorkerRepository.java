package com.example.vueProject.repository;

import com.example.vueProject.domain.Item;
import com.example.vueProject.domain.Worker;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WorkerRepository {
    void save(Worker worker);

    void update(@Param("officeId") int id, @Param("officeName") String name);

    Worker findById(int id);
    List<Worker> findAll();
}
