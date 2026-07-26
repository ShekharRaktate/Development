package com.app.domain;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int id;
	private String projectName;
	@ManyToMany(mappedBy ="projects")
	private Set<Programmer> programmer= new HashSet<Programmer>();
	public Project() {
		System.out.println("Project:0 parameter constructor");
		// TODO Auto-generated constructor stub
	}
	public Project(int id, String projectName) {
		System.out.println("Project:2 parameter constructor");
		this.id = id;
		this.projectName = projectName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Set<Programmer> getProgrammer() {
		return programmer;
	}
	public void setProgrammer(Set<Programmer> programmer) {
		this.programmer = programmer;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", programmer=" + programmer + "]";
	}
	
	
}
