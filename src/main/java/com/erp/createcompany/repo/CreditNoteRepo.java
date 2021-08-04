package com.erp.createcompany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.erp.createcompany.model.CreditNote;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "credit",path="credit")
public interface CreditNoteRepo extends JpaRepository<CreditNote, Integer> {

}
