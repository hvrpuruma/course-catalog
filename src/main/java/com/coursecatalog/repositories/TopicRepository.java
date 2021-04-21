package com.coursecatalog.repositories;

import com.coursecatalog.entities.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
