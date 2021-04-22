/**
 * 
 */
package com.tdstrial.demo.service;

import java.util.List;

import com.tdstrial.demo.entities.ESim;

/**
 * @author Raja
 *
 * Smartrec test
 */
public interface ISimService {
	public List<ESim> getSims(Integer pageNo, Integer pageSize, String sortBy);
}
