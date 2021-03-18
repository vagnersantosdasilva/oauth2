package com.vss.oauth2.repository;

import com.vss.oauth2.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository  extends JpaRepository<Resource, Integer> {

    @Query(nativeQuery = true,value = "select * from resource where id =?1")
    Resource findResourceById(Integer id);
}
