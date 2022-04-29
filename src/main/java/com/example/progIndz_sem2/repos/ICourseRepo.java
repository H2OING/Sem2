package com.example.progIndz_sem2.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.progIndz_sem2.models.Course;

public interface ICourseRepo extends CrudRepository<Course, Integer> {

}
