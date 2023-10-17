package com.example.vueProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VueController {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("/vue/api")
    public String getSearch(String search){

        logger.info(search);

        return search;
    }
}
