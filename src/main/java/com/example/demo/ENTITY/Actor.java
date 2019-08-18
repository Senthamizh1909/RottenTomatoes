package com.example.demo.ENTITY;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Actor")
@EntityListeners(AuditingEntityListener.class)
public class Actor implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long actorid;

	@NotBlank
	@Column(unique = true, name = "ActorName")
	private String actorname;

	@NotBlank
	@Column(name = "DateOfBirth")
	private String dob;

	@Column(name = "Sex")
	private String sex;

	@Column(name = "Biography")
	private String bio;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createddate;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updateddate;

	public Long getActorid() {
		return actorid;
	}

	public void setActorid(Long actorid) {
		this.actorid = actorid;
	}

	public String getActorname() {
		return actorname;
	}

	public void setActorname(String actorname) {
		this.actorname = actorname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Date getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}

	@Override
	public String toString() {
		return "Actor [actorid=" + actorid + ", actorname=" + actorname + ", dob=" + dob + ", sex=" + sex + ", bio="
				+ bio + ", createddate=" + createddate + ", updateddate=" + updateddate + "]";
	}

	
	  @OneToMany(fetch =FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "actor1" ) 
	  private List<Movie> movie=null;
	  
	  public List<Movie> getMovie() 
	  { 
		  return movie; 
	  }
	  
	  public void setMovie(List<Movie> movie) 
	  { 
		  this.movie = movie; 
	  }
	 
	  @OneToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name="Movie_Id",nullable=false,referencedColumnName = "movieid")
	  private Movie movie1=null;

	public Movie getMovie1() {
		return movie1;
	}

	public void setMovie1(Movie movie1) {
		this.movie1 = movie1;
	}

}
