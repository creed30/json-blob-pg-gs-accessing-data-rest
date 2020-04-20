package com.example.accessingdatarest.application;

import com.example.accessingdatarest.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "application", path = "application")
public interface ApplicationRepository extends PagingAndSortingRepository<Application, Long> {

	List<Application> findByName(@Param("name") String name);

}
