package com.example.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.example.beans.User;


//this class is acting as a repository bz we are using array list not any database so @Component will work as @repository
@Component
public class UserService {

	private static ArrayList<User> users = new ArrayList<User>();
	static {
		users.add(new User(1, "Amir"));
		users.add(new User(2, "Shahid"));
		users.add(new User(3, "Amitab"));
		users.add(new User(4, "SRK"));
		users.add(new User(5, "Sallu"));
	}
	public static int userCount =5;//already 5 will be there from satic
	public ArrayList<User> findall(){
		return users;
	}
	
	public User saveUser(User user){
		if(user.getId()==null)
		{
		 user.setId(++userCount);
		 users.add(user);
		}
		return user;
	}
	
	public User findOneUser(int id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
			{
				return user;
			}
				
		}
		return null;
	}
}
