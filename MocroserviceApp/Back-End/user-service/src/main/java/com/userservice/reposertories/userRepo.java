package com.userservice.reposertories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.userservice.Models.user;

@RepositoryRestResource
public interface userRepo extends JpaRepository<user, Long> {

}
