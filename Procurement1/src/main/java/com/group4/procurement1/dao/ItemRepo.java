package com.group4.procurement1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.group4.procurement1.model.Item;

@RepositoryRestResource(collectionResourceRel = "item", path = "item")
public interface ItemRepo extends JpaRepository<Item, Integer> {

}
