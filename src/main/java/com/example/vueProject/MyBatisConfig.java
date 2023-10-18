package com.example.vueProject;


import com.example.vueProject.repository.ItemRepository;
import com.example.vueProject.repository.WorkerRepository;
import com.example.vueProject.repository.mybatis.ItemMapper;
import com.example.vueProject.repository.mybatis.MyBatisItemRepository;
import com.example.vueProject.repository.mybatis.WorkerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MyBatisConfig {

    private final WorkerMapper workerMapper;

    @Autowired
    public MyBatisConfig(WorkerMapper workerMapper) {
        this.workerMapper = workerMapper;
    }




    @Bean
    public WorkerRepository workerRepository(){
        return new MyBatisItemRepository(workerMapper);
    }
}
