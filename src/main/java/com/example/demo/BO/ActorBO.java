package com.example.demo.BO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.ActorDAO;
import com.example.demo.ENTITY.Actor;

@Service
public class ActorBO {

	@Autowired
	ActorDAO dao=null;
	
	public void addActor(Actor a)
	{
		dao.save(a);
	}
	
	public Optional<Actor> findById(int i)
	{
		Optional<Actor> a=dao.findById(1l);
		return a;
	}
	
	public Actor fetchActor(long id) {
		Optional<Actor> l=dao.findById(id);
    	return l.get();
	}
}

