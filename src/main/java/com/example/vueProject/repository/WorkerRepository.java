package com.example.vueProject.repository;

import com.example.vueProject.domain.Worker;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository {
    void save(Worker worker);
}
