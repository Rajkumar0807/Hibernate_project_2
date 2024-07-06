package com;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="reg_emp")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})
//@DiscriminatorValue(value="regular")
public class RegEmp extends Emp{
	

	float sal;
	String dept;
	public RegEmp(float sal, String dept, String name) {
		super(name);
		this.sal = sal;
		this.dept = dept;
	}
	public float getSal() {
		return sal;
	}
	public String getDept() {
		return dept;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
	
	