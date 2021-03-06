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

import com.tdstrial.demo.entities.Device;
import com.tdstrial.demo.service.IDeviceService;

/**
 * @author Raja
 *
 * TDSoftware trial
 * 
 * Device Controller REST Provider
 */

@RestController
@RequestMapping("/device")
public class DeviceController {
	
	@Autowired
	IDeviceService deviceService;
	
	@GetMapping
	@RequestMapping(value = "/getAllDevices", method = RequestMethod.GET)
	public ResponseEntity<List<Device>> findDevices( @RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy){
		
		List<Device> list = deviceService.getAllDevices(pageNo, pageSize, sortBy);
		 
        return new ResponseEntity<List<Device>>(list, new HttpHeaders(), HttpStatus.OK); 
		
	}

}
