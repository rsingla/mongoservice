package com.techcodepro.dao;

import org.springframework.stereotype.Component;

import com.techcodepro.pojo.PersonProfile;

@Component
public interface PersonDao {
	
	public String createProfile(PersonProfile personProfile);

}
