package com.spring.microservices.RestfulWebServices.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.microservices.RestfulWebServices.model.User;

@Repository
public class DaoService {

	
	private static List<User> users = new ArrayList<User>();
	private static int userCount = 102;
	static{
		users.add(new User(100,"Shridha", new Date()));

		users.add(new User(101,"Suraj", new Date()));

		users.add(new User(102,"Neeraja", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		
		if(user.getId()==null)
			user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public User findOne(Integer id) {
	return	 users.stream().filter(user->((user.getId()==id))).findFirst().get();
		
		/*
		 * for(User user:users) { if(user.getId().intValue()==id.intValue()) return
		 * user; } return new User();
		 */
	}
}
