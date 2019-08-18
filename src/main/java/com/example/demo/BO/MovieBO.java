package com.example.demo.BO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.MovieDAO;
import com.example.demo.ENTITY.Movie;

@Service
public class MovieBO {

	@Autowired
	MovieDAO dao=null;
	
	public void addMovie(Movie m)
	{
		dao.save(m);
	}
	
	public Optional<Movie> findById(int i)
	{
		Optional<Movie> m=dao.findById(1l);
		return m;
	}
	
	public List<Movie> findAll()
	{
		List<Movie> l=new ArrayList<Movie>();
		l=dao.findAll();
		return l;
	}

	public Movie fetchMovie(long id) {
		Optional<Movie> l=dao.findById(id);
    	return l.get();
	}
		
}

