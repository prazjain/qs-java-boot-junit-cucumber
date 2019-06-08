package com.sample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.entity.SampleEntity;

@Repository
public interface SampleRepository extends CrudRepository<SampleEntity, Long> {

}
