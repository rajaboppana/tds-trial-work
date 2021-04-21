/**
 * 
 */
package com.tdstrial.demo.service;

import java.util.List;

import com.tdstrial.demo.entities.Device;

/**
 * @author Raja
 *
 * TDSoftware test
 */
public interface IDeviceService {
	
	public List<Device> getAllDevices(Integer pageNo, Integer pageSize, String sortBy);
}
