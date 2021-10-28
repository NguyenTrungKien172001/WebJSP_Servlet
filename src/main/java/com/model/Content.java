package com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Content implements Serializable{
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "Title")
	private String Title;
	
	@Column(name = "Brief")
	private String Brief;
	
	@Column(name = "Content")
	private String Content;

	@Column(name = "CreatedDate")
	@Temporal(TemporalType.DATE)
	private Date CreatedDate = new Date();
	
	@Column(name = "UpdateTime")
	@Temporal(TemporalType.DATE)
	private Date UpdateTime = new Date();
	
	@Column(name = "Sort")
	private String Sort;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AuthorId", referencedColumnName = "Id")
	private Member member;
	
	@Column(name = "DeleteAt")
	private Boolean DeleteAt;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getBrief() {
		return Brief;
	}

	public void setBrief(String brief) {
		Brief = brief;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
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

	public String getSort() {
		return Sort;
	}

	public void setSort(String sort) {
		Sort = sort;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Boolean getDeleteAt() {
		return DeleteAt;
	}

	public void setDeleteAt(Boolean deleteAt) {
		DeleteAt = deleteAt;
	}

	@Override
	public String toString() {
		return "Content [Id=" + Id + ", Title=" + Title + ", Brief=" + Brief + ", Content=" + Content + ", CreatedDate="
				+ CreatedDate + ", UpdateTime=" + UpdateTime + ", Sort=" + Sort + ", member=" + member + ", DeleteAt="
				+ DeleteAt + "]";
	}
	
	
}
