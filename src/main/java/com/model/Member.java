package com.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Member")
public class Member implements Serializable{
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "Firstname")
	private String Firstname;
	
	@Column(name = "Lastname")
	private String Lastname;
	
	@Column(name = "Username")
	private String Username;
	
	@Column(name = "Password")
	private String Password;
	
	@Column(name = "Phone")
	private String Phone;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Description")
	private String Description;
	
	@Column(name = "CreatedDate")
	@Temporal(TemporalType.DATE)
	private Date CreatedDate = new Date();
	
	@Column(name = "UpdateTime")
	@Temporal(TemporalType.DATE)
	private Date UpdateTime = new Date();
	
	@Column(name = "DeleteAt")
	private Boolean DeleteAt;
	
	@OneToMany(mappedBy = "member")
	private List<Content> content;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date CreatedDate) {
		CreatedDate = CreatedDate;
	}

	public Date getUpdateTime() {
		return UpdateTime;
	}

	public void setUpdateTime(Date updateTime) {
		UpdateTime = updateTime;
	}

	public Boolean getDeleteAt() {
		return DeleteAt;
	}

	public void setDeleteAt(Boolean deleteAt) {
		DeleteAt = deleteAt;
	}

	public List<Content> getContent() {
		return content;
	}

	public void setContent(List<Content> content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Member [Id=" + Id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Username=" + Username
				+ ", Password=" + Password + ", Phone=" + Phone + ", Email=" + Email + ", Description=" + Description
				+ ", CreatedDate=" + CreatedDate + ", UpdateTime=" + UpdateTime + ", DeleteAt=" + DeleteAt + ", content="
				+ content + "]";
	}
	
	
	
	
}
