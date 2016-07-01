package com.javaone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by rodrigo on 6/30/16.
 */
@RestResource
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByNameLike(@Param("name") String name);

}
