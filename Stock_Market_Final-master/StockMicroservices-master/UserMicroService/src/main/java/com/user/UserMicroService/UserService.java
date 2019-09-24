package com.user.UserMicroService;

import java.util.List;
import java.util.Optional;



public interface UserService {

	public List<User> getUsers();
	public User createUser(User user);
	public User updateUser(User user);
	 public Optional<User> getUserById(Long userId); 
	 
	 public List<IPO> getIPOs();
}
