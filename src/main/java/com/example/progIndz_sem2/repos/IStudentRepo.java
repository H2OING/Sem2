package com.example.progIndz_sem2.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.progIndz_sem2.models.Student;

public interface IStudentRepo extends CrudRepository<Student, Integer> {

}
