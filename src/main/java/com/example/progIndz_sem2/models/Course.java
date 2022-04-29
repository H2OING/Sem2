package com.example.progIndz_sem2.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

public class Course {

	@Setter(value=AccessLevel.NONE)
	@Column(name="ID_c")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_c;
	@Column(name="Title")
	private String title;
	@Column(name="CP")
	private int creditPoints;
	
	
	@OneToOne
	@JoinColumn(name="ID_p")
	private Professor professor;
	
	@OneToMany(mappedBy = "course")
	@ToString.Exclude
	private ArrayList<Grade> grades;
	
	
	
	public Course(int creditPoints, Professor professor, String title) {
		this.creditPoints = creditPoints;
		this.professor = professor;
		this.title = title;
	}	
}
