package com.example.progIndz_sem2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
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

public class Grade {

	@Setter(value=AccessLevel.NONE)
	@Column(name="ID_g")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_g;
	
	@Column(name="Value")
	private int value;
	
	@ManyToOne
	@JoinColumn(name="ID_c")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name="ID_st")
	private Student student;

	public Grade(int value, Course course, Student student) {
		this.value = value;
		this.course = course;
		this.student = student;
	}
	
	
	
}