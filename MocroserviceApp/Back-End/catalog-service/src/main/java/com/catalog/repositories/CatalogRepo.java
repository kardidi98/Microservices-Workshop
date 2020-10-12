package com.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.catalog.Models.Catalog;

@RepositoryRestResource
public interface CatalogRepo extends JpaRepository<Catalog, Long> {

}
