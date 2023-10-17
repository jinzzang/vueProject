package com.example.vueProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VueController {

    @RequestMapping("/vue/api")
    public String getSearch(String search){
        Logger log = LoggerFactory.getLogger(this.getClass());
        System.out.println("213 api 한글");
        log.info(search);
        return search;
    }
}
