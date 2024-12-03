package com.calendar.repository;

import com.calendar.entity.Client;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
