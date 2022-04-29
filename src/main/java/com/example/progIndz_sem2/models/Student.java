package com.example.progIndz_sem2.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



	@Table
	@Entity
	@Getter
	@Setter
	@ToString
	@NoArgsConstructor
	public class Student {
		
		@Column(name="ID_st")
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id_st;
		
		@Column(name="Name")
		private String name;
		
		@Column(name="Surname")
		private String surname;
		
		@OneToMany(mappedBy = "student")
		@ToString.Exclude
		private ArrayList<Grade> grades;

		public Student(String name, String surname) {
			setName(name);
			setSurname(surname);
		}
}