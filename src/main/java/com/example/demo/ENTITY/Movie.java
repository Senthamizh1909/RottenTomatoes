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
@Table(name="Movie")
@EntityListeners(AuditingEntityListener.class)
public class Movie implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movieid;
	
	@NotBlank
	@Column(unique = true,name="MovieName")
	private String moviename;
	
	@NotBlank
	@Column(name="YearOfRelease")
	private String yor;
	
	@Column(name="Plot")
	private String plot;
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createddate;
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updateddate;

	public Long getMovieid() {
		return movieid;
	}

	public void setMovieid(Long movieid) {
		this.movieid = movieid;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getYor() {
		return yor;
	}

	public void setYor(String yor) {
		this.yor = yor;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
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
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", yor=" + yor + ", plot=" + plot
				+ ", createddate=" + createddate + ", updateddate=" + updateddate + "]";
	}
    
		
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Actor_Id",nullable=false,referencedColumnName = "actorid")
	private Actor actor1=null;

	public Actor getActor1() {
		return actor1;
	}

	public void setActor1(Actor actor1) {
		this.actor1 = actor1;
	}
	
	 @OneToMany(fetch =FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "movie1" ) 
	private List<Actor> actor2=null;

	public List<Actor> getActor2() {
		return actor2;
	}

	public void setActor2(List<Actor> actor2) {
		this.actor2 = actor2;
	}


	
}
