package com.example.vueProject;

import com.example.vueProject.domain.Worker;
import com.example.vueProject.repository.mybatis.MyBatisItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class VueController {

    @Autowired
    MyBatisItemRepository myBatisItemRepository;

    @RequestMapping("/vue/api")
    public String getSearch(String search){
        Worker worker = new Worker();
        worker.setOfficeName(search);
        worker.setOfficeAddress("오산2");
        myBatisItemRepository.save(worker);
        log.info(search);

        return search;
    }
}
