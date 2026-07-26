package com.app.domain;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Programmer {
	@Id
	private int pid;
	private String pName;
	private long salary;
	@ManyToMany(targetEntity=Project.class,cascade= CascadeType.ALL,fetch= FetchType.LAZY)
	@JoinTable(name="project_Programmer",
	joinColumns=@JoinColumn(name="programmer_id", referencedColumnName ="pid"),
	inverseJoinColumns=@JoinColumn(name="project_id",referencedColumnName="id"))
	private  Set<Project> projects= new HashSet<Project>();
	public Programmer() {
		System.out.println("Programmer:0 parameter consturctor");
		
	}
	public Programmer(int pid, String pName, long salary) {
		System.out.println("Programmer:3 parameter constructor");
		this.pid = pid;
		this.pName = pName;
		this.salary = salary;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Programmer [pid=" + pid + ", pName=" + pName + ", salary=" + salary + ", projects=" + projects + "]";
	}
	
	
}
