package com.org.entity;

public class Employee {
 private String name;
 private int id;
 private String sex;
 private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Employee(String name, int id, String sex, int age) {
	this.name = name;
	this.id = id;
	this.sex = sex;
	this.age = age;
}
public Employee(){
	
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", sex=" + sex + ", age="
			+ age + "]";
}

}
