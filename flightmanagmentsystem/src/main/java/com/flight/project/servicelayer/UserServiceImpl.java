package com.flight.project.servicelayer;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.project.dto.User;
import com.flight.project.exception.DataNotFound;
import com.flight.project.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository userDao;
    public UserServiceImpl(UserRepository userDao) {
       super();
       this.userDao = userDao;
   }
	@Override
	public User createUser(User nuser) {
		// TODO Auto-generated method stub
		return userDao.save(nuser);
	}
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return userDao.findById(id).orElseThrow(() ->
		new DataNotFound("User","ID",id));
	}
	@Override
	public User updateUser(User user,long id) {
		        
		        User existingUser = userDao.findById(id).orElseThrow(()->
		        new DataNotFound("User","Id",id));
		        
		        existingUser.setUserType(user.getUserType());
		       // existingUser.setUserId(user.getUserId());
		        existingUser.setUserName(user.getUserName());
		        existingUser.setUserPassword(user.getUserPassword());
		        existingUser.setUserPhone(user.getUserPhone());
		        existingUser.setUserEmail(user.getUserEmail());
		        userDao.save(existingUser);
		        return existingUser;
	}
	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		userDao.findById(id).orElseThrow(() ->
		new DataNotFound("User","ID",id));
		userDao.deleteById(id);
		
		
	}
	
	
}
