package com.hibernate.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
//annotation based
@Entity
@Table(name = "employe_table")
public class Employees {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int employeeId;
	private String name, email;
	
	//scecond table
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address")
	private Addressemp address;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Addressemp getAddress() {
		return address ;
	}

	public void setAddress(Addressemp address) {
		this.address = address;
	}
}
