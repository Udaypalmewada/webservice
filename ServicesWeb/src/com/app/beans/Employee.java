package com.app.beans;

public class Employee {
private int id;
private String name;
private String technology;
private double experiance;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String technology, double experiance) {
	super();
	this.id = id;
	this.name = name;
	this.technology = technology;
	this.experiance = experiance;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTechnology() {
	return technology;
}
public void setTechnology(String technology) {
	this.technology = technology;
}
public double getExperiance() {
	return experiance;
}
public void setExperiance(double experiance) {
	this.experiance = experiance;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", technology=" + technology + ", experiance=" + experiance + "]";
}

}
