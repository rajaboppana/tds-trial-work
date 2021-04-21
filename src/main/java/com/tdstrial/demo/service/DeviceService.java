/**
 * 
 */
package com.tdstrial.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tdstrial.demo.entities.Device;
import com.tdstrial.demo.entities.User;
import com.tdstrial.demo.repo.DeviceRepository;

/**
 * @author Raja
 *
 * TDSoftware trial
 */

@Service
public class DeviceService implements IDeviceService{
	
	@Autowired
	DeviceRepository deviceRepository;

	@Override
	@Transactional
	public List<Device> getAllDevices(Integer pageNo, Integer pageSize, String sortBy) {
		
		 PageRequest paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
		 
	        Page<Device> pagedResult = deviceRepository.findAll(paging);
	         
	        if(pagedResult.hasContent()) {
	            return pagedResult.getContent();
	        } else {
	            return new ArrayList<Device>();
	        }
	}

}
