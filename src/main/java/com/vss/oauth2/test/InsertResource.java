package com.vss.oauth2.test;

import com.vss.oauth2.model.Resource;
import com.vss.oauth2.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class InsertResource {

    @Autowired
    private ResourceRepository repository;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event){
        Resource resource =  new Resource(null , "Ativo 1");
        Resource resource2 =  new Resource(null , "Ativo 2");
        Resource resource3 =  new Resource(null , "Ativo 3");
        repository.save(resource);
        repository.save(resource2);
        repository.save(resource3);

    }

}
