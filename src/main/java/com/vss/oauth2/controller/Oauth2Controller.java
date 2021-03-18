package com.vss.oauth2.controller;

import com.vss.oauth2.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myapp")
public class Oauth2Controller {


    @Autowired
    ResourceRepository repository;

    @GetMapping("/resource/{id}")
    public ResponseEntity<?> getResourceById(@PathVariable("id") Integer id){
        return new ResponseEntity<>(repository.findResourceById(id), HttpStatus.OK);
    }

}
