package com.example.progIndzTest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.progIndz_sem2.models.Course;
import com.example.progIndz_sem2.models.Grade;
import com.example.progIndz_sem2.models.Professor;
import com.example.progIndz_sem2.models.Student;
import com.example.progIndz_sem2.repos.ICourseRepo;
import com.example.progIndz_sem2.repos.IGradeRepo;
import com.example.progIndz_sem2.repos.IProfessorRepo;
import com.example.progIndz_sem2.repos.IStudentRepo;

@SpringBootApplication
public class ProgIndzSem2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProgIndzSem2Application.class, args);
	}
	
	@Bean
	public CommandLineRunner runner(IProfessorRepo profRepo, 
									IStudentRepo studRepo, 
									ICourseRepo courRepo, 
									IGradeRepo gradeRepo) 
	{
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Professor prof1 = new Professor("Karina", "Skirmante", "Mg.sc.comp");
				Professor prof2 = new Professor("Raita", "Rollande", "Dr.ing");
				profRepo.save(prof1);
				profRepo.save(prof2);
				
				Student st1 = new Student("Markuss", "Karklins");
				Student st2 = new Student("Janis", "Ozols");
				studRepo.save(st1);
				studRepo.save(st2);
				
				Course c1 = new Course(4, prof1, "Java");
				Course c2 = new Course(4, prof1, "ProgIndz");
				courRepo.save(c1);
				courRepo.save(c2);
				
				gradeRepo.save(new Grade(10, c1, st1));
                gradeRepo.save(new Grade(3, c1, st1));
                gradeRepo.save(new Grade(5, c2, st2));
                gradeRepo.save(new Grade(7, c2, st2));
			}
		};
	}

}
