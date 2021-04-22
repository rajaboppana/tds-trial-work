/**
 * 
 */
package com.tdstrial.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tdstrial.demo.entities.User;
import com.tdstrial.demo.repo.UserRepository;

/**
 * @author Raja
 *
 * TDSoftware trial
 * 
 * Service class to manipulate user data
 */
@Service
public class UserService implements IUserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers(Integer pageNo, Integer pageSize, String sortBy)
    {
        PageRequest paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
 
        Page<User> pagedResult = userRepository.findAll(paging);
         
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<User>();
        }
    }

}
