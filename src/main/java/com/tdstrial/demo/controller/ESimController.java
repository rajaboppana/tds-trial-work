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

import com.tdstrial.demo.entities.ESim;
import com.tdstrial.demo.service.ISimService;

/**
 * @author Raja
 *
 * TDSoftware trial
 * 
 * ESIM Controller REST Provider
 */

@RestController
@RequestMapping("/esim")
public class ESimController {
	
	@Autowired
	ISimService simService;
	
	@GetMapping
	@RequestMapping(value = "/getAllEsims", method = RequestMethod.GET)
	public ResponseEntity<List<ESim>> findEsims( @RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy){
		
		List<ESim> list = simService.getSims(pageNo, pageSize, sortBy);
		 
        return new ResponseEntity<List<ESim>>(list, new HttpHeaders(), HttpStatus.OK); 
		
	}

}
