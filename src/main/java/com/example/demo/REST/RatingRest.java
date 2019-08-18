package com.example.demo.REST;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BO.ActorBO;
import com.example.demo.BO.MovieBO;
import com.example.demo.DAO.MovieDAO;
import com.example.demo.DTO.ActorDTO;
import com.example.demo.DTO.MovieDTO;
import com.example.demo.ENTITY.Actor;
import com.example.demo.ENTITY.Movie;




@CrossOrigin
@RestController
public class RatingRest {
	
	@Autowired
	MovieBO mbo=new MovieBO();


	@RequestMapping(value = "/createMovies", method = RequestMethod.POST)
	public @ResponseBody MovieDTO addMovie(@RequestBody MovieDTO msg) {

		System.out.println("Movie:" + msg.getMoviename());
		System.out.println("Year of release:" + msg.getYor());
		Movie m=new Movie();
		Actor a=new Actor();
		m.setMoviename(msg.getMoviename());
		m.setYor(msg.getYor());
		m.setPlot(msg.getPlot());
		a.setActorid(msg.getActorid());
		m.setActor1(a);
		mbo.addMovie(m);
		return msg;
	}
	

	
	@Autowired
	ActorBO abo=new ActorBO();
	
	@RequestMapping(value = "/createActor", method = RequestMethod.POST)
	public @ResponseBody ActorDTO addActor(@RequestBody ActorDTO msg) {

		System.out.println("Actor:" + msg.getActorname());
		System.out.println("Sex:" + msg.getSex());
		Actor a=new Actor();
		Movie m=new Movie();
		a.setActorname(msg.getActorname());
		a.setSex(msg.getSex());
		a.setDob(msg.getDob());
		a.setBio(msg.getBio());
		m.setMovieid(msg.getMovieid());
		a.setMovie1(m);
		abo.addActor(a);
		return msg;
	}
	
	@RequestMapping(value = "/fetchActorById", method = RequestMethod.POST)
	public @ResponseBody ActorDTO fetchActor(@RequestBody Long id) {

		System.out.println("ID:" + id);
		Actor a = abo.fetchActor(new Long(id));
		ActorDTO dto = new ActorDTO();
		dto.setActorname(a.getActorname());
		dto.setDob(a.getDob());
		dto.setBio(a.getBio());
	    dto.setSex(a.getSex());
		dto.setMovie1(a.getMovie1());
		return dto;
	}
	
	@RequestMapping(value = "/fetchMoviesById", method = RequestMethod.POST)
	public @ResponseBody MovieDTO fetchMovie(@RequestBody Long id) {

		System.out.println("ID:" + id);
		Movie m = mbo.fetchMovie(new Long(id));
		MovieDTO dto = new MovieDTO();
		dto.setMoviename(m.getMoviename());
		dto.setYor(m.getYor());
		dto.setPlot(m.getPlot());
		dto.setMovieid(m.getMovieid());

		
		return dto;
	}
	
	  @Autowired
      private MovieDAO mdao;
	
	  @RequestMapping(value = "/fetchAllMovies", method = RequestMethod.POST)
	  public @ResponseBody List<Movie> fetchAllMovie() {
	  
		  System.out.println("im here");
	       return mdao.findAll();
	       
	}
	
	
	
	
}
