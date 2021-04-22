/**
 * 
 */
package com.tdstrial.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tdstrial.demo.entities.User;
import com.tdstrial.demo.service.IUserService;

/**
 * @author Raja
 *
 * TDSoftware Trial
 * 
 * USer Controller REST Provider
 */
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@GetMapping
	@RequestMapping(value = "/getAllUsers", method= RequestMethod.GET)
	public ResponseEntity<List<User>> findUsers( @RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy){
		
		List<User> list = userService.getAllUsers(pageNo, pageSize, sortBy);
		 
        return new ResponseEntity<List<User>>(list, new HttpHeaders(), HttpStatus.OK); 
		
	}

}
