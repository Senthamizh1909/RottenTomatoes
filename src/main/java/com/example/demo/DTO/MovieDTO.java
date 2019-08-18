package com.example.demo.DTO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.example.demo.ENTITY.Actor;

public class MovieDTO implements Serializable {
	
	private Long movieid;
	private String moviename;
	private String yor;
	private String plot;
	private Date createddate;
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
		return "MovieDTO [movieid=" + movieid + ", moviename=" + moviename + ", yor=" + yor + ", plot=" + plot
				+ ", createddate=" + createddate + ", updateddate=" + updateddate + ", actor1=" + actor1 + ", actor2="
				+ actor2 + ", actorid=" + actorid + "]";
	}


	private Actor actor1=null;
	private List<Actor> actor2=null;


	public Actor getActor1() {
		return actor1;
	}
	public void setActor1(Actor actor1) {
		this.actor1 = actor1;
	}
	public List<Actor> getActor2() {
		return actor2;
	}
	public void setActor2(List<Actor> actor2) {
		this.actor2 = actor2;
	}

	private Long actorid;


	public Long getActorid() {
		return actorid;
	}
	public void setActorid(Long actorid) {
		this.actorid = actorid;
	}

	

}
