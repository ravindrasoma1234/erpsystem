package com.erp.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.erp.store.model.Item;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "item",path="item")
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
