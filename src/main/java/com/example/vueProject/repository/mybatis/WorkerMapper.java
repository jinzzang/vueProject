package com.example.vueProject.repository.mybatis;

import com.example.vueProject.domain.Item;
import com.example.vueProject.domain.Worker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface WorkerMapper {
    void save(Worker worker);

    Optional<Worker> findById(Long id);

    List<Item> findAll(Worker worker);
}
