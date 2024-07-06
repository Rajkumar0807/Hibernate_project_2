package com;
import jakarta.persistence.*;
@Entity
@Table(name="emp_1")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="category",discriminatorType=DiscriminatorType.STRING)
//@DiscriminatorValue(value="general")

public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  int id;
  String name;
public Emp() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public Emp(String name) {
	super();
	this.name = name;
}

}
  