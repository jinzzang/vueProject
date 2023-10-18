package com.example.vueProject.repository.mybatis;

import com.example.vueProject.domain.Item;
import com.example.vueProject.domain.Worker;
import com.example.vueProject.repository.ItemRepository;
import com.example.vueProject.repository.ItemSearchCond;
import com.example.vueProject.repository.ItemUpdateDto;
import com.example.vueProject.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MyBatisItemRepository implements WorkerRepository {

    private final WorkerMapper workerMapper;

    @Override
    public void save(Worker worker) {
        workerMapper.save(worker);
    }

    @Override
    public void update(int id, String name) {
        workerMapper.update(id,name);
    }

    @Override
    public Worker findById(int id) {
        return workerMapper.findById(id);
    }

    @Override
    public List<Worker> findAll() {
        return workerMapper.findAll();
    }
}
