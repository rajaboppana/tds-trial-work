/**
 * 
 */
package com.tdstrial.demo.service;

import java.util.List;

import com.tdstrial.demo.entities.User;

/**
 * @author Raja
 *
 * TDSoftware trial
 */
public interface IUserService {
	
	public List<User> getAllUsers(Integer pageNo, Integer pageSize, String sortBy);

}
