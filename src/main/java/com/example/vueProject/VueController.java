package com.example.vueProject;

import com.example.vueProject.domain.Worker;
import com.example.vueProject.repository.mybatis.MyBatisItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class VueController {

    @Autowired
    MyBatisItemRepository myBatisItemRepository;

    @RequestMapping("/vue/api")
    public String getSearch(String search){
        Worker worker = new Worker();
        worker.setOfficeName(search);
        worker.setOfficeAddress("오산2test");
        myBatisItemRepository.save(worker);
        log.info(search);

        return search;
    }

    @GetMapping("/vue/api/worker/{id}")
    public Worker findById(@PathVariable("id") int id){
        log.info("id : "+id);
        log.info("worker : "+myBatisItemRepository.findById(id));
        return myBatisItemRepository.findById(id);
    }

    @GetMapping("/vue/api/workers")
    public List<Worker> getWorkers(){
        log.info("call /vue/api/workers");

        return myBatisItemRepository.findAll();
    }
}
