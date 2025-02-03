package com.mario.proto.data;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * POJO for User
 */
 
@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Nonnull
	private String email;
	@Nonnull
	private String password;
	@Nonnull
	@Column(name = "username")
	private String username;
	@Nonnull
	@Column(name = "policynum")
	private String policy_num;
	@Nonnull
	@Column(name = "insurance")
	private String insurance;

	public User() {

	}

	public User(Long id, String email, String password, String username, String policy_num, String insurance) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.username = username;
		this.policy_num = policy_num;
		this.insurance = insurance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPolicy_num() {
		return policy_num;
	}

	public void setPolicy_num(String policy_num) {
		this.policy_num = policy_num;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", username=" + username
				+ ", policy_num=" + policy_num + ", insurance=" + insurance + "]";
	}

}
