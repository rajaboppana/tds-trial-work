/**
 * 
 */
package com.tdstrial.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdstrial.demo.entities.User;

/**
 * @author Raja
 *
 * TDSoftware trial
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
