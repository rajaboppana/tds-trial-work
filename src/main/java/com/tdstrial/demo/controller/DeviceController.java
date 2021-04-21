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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tdstrial.demo.entities.Device;
import com.tdstrial.demo.service.IDeviceService;

/**
 * @author Raja
 *
 * TDSoftware trial
 */

@RestController
public class DeviceController {
	
	public static final String ROOT_PATH = "/devices";
	
	@Autowired
	IDeviceService deviceService;
	
	@GetMapping
	@RequestMapping("/devices")
	public ResponseEntity<List<Device>> findDevices( @RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy){
		
		List<Device> list = deviceService.getAllDevices(pageNo, pageSize, sortBy);
		 
        return new ResponseEntity<List<Device>>(list, new HttpHeaders(), HttpStatus.OK); 
		
	}

}
