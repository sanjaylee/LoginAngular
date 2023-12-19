package com.example.sanjay.modal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bank")
public class Bank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="account_name")
	private String name;

	@Column(name="account_number")
	private String number;
	
	@Column(name="branch_name")
	private String b_name;
     
	public Bank() {}
	
	public Bank(int i, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.name=string2;
		this.number=string3;
		this.b_name=string4;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", number=" + number + ", b_name=" + b_name + "]";
	}


}
