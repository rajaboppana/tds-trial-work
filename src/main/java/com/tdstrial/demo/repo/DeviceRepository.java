/**
 * 
 */
package com.tdstrial.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdstrial.demo.entities.Device;

/**
 * @author Raja
 *
 * TDSoftware trial
 */
public interface DeviceRepository extends JpaRepository<Device, Long> {

}
