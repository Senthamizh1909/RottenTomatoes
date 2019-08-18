package com.example.demo.DTO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.example.demo.ENTITY.Movie;

public class ActorDTO implements Serializable{
	
	private Long actorid;
	private String actorname;	
	private String dob;
	private String sex;
	private String bio;
	private Date createddate;
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

	 private List<Movie> movie=null;
	 private Movie movie1=null;


	public List<Movie> getMovie() {
		return movie;
	}
	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}
	public Movie getMovie1() {
		return movie1;
	}
	public void setMovie1(Movie movie1) {
		this.movie1 = movie1;
	}

	private Long movieid;


	public Long getMovieid() {
		return movieid;
	}
	public void setMovieid(Long movieid) {
		this.movieid = movieid;
	}
	@Override
	public String toString() {
		return "ActorDTO [actorid=" + actorid + ", actorname=" + actorname + ", dob=" + dob + ", sex=" + sex + ", bio="
				+ bio + ", createddate=" + createddate + ", updateddate=" + updateddate + ", movie=" + movie
				+ ", movie1=" + movie1 + ", movieid=" + movieid + "]";
	}
	
	
	

}
