package com.group4.procurement1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.group4.procurement1.model.Tender;

@RepositoryRestResource(collectionResourceRel = "tender", path = "tender")
public interface TenderRepo extends JpaRepository<Tender, Integer> {

}
