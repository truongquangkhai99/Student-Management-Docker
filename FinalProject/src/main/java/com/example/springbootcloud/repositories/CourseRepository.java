package com.example.springbootcloud.repositories;

import com.example.springbootcloud.entity.Account;
import com.example.springbootcloud.entity.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}