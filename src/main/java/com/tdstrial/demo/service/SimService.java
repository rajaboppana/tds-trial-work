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

import com.tdstrial.demo.entities.ESim;
import com.tdstrial.demo.repo.ESimRepository;

/**
 * @author Raja
 *
 * TDsoftware test
 * 
 * Service class to manipulate SIM Data
 */
@Service
public class SimService implements ISimService{
	
	@Autowired
	ESimRepository eSimRepository;

	@Override
	public List<ESim> getSims(Integer pageNo, Integer pageSize, String sortBy) {
		
		 PageRequest paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
		 
	        Page<ESim> pagedResult = eSimRepository.findAll(paging);
	         
	        if(pagedResult.hasContent()) {
	            return pagedResult.getContent();
	        } else {
	            return new ArrayList<ESim>();
	        }
	}

}
