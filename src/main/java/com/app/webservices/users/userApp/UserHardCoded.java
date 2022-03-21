package com.app.webservices.users.userApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserHardCoded {
	
	public static List<UserBean> users = new ArrayList<>();
	
	public static long counter = 0;
	
	static {
		users.add(new UserBean(++counter, "karthi", "React Developer", new Date(), true));
		users.add(new UserBean(++counter, "sabari", "java Developer", new Date(), true));
		users.add(new UserBean(++counter, "satyan", "Node Developer", new Date(), true));
		users.add(new UserBean(++counter, "venkat", ".Net Developer", new Date(), true));
	}
	
	public List<UserBean> findAll() {
		
		return users;
		
	}
	
	public UserBean deleteById(long id) {
		
		UserBean user = findById(id);
		
		if(user == null) {
			return null;
		}
		
		if(users.remove(user)) {	
		return user;
		}
		
		return null;
		
	}
	
	public UserBean findById(long id) {
		
		for (UserBean user : users) {
			
			if(user.getId() == id) {
				return user;
			}
			
		}
		return null;
	}
	
	
	public UserBean save(UserBean user) {
		
		if(user.getId() == -1 || user.getId() == 0) {
			user.setId(++counter);
			users.add(user);
		}else {
		deleteById(user.getId());
		users.add(user);
		}
		
		return user;
		
	}
	
	
	
	
	
}
