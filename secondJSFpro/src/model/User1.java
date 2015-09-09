package model;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;


/**
 * The persistent class for the USER1 database table.
 * 
 */
@Entity
@Table(name="USER1",schema="TESTDB")
@NamedQuery(name="User1.findAll", query="SELECT u FROM User1 u")
public class User1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "USER1_SEQ", catalog = "",schema="TESTDB",allocationSize = 1,initialValue = 1)
	@GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="USER1_SEQ")
	@Column(name="USER_ID")
	private long userId;

	private int birthyear;  

	private String email;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	public User1() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getBirthyear() {
		return this.birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}