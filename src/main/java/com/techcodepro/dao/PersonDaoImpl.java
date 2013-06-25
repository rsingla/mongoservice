package com.techcodepro.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.techcodepro.pojo.PersonProfile;


@Component
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public String createProfile(PersonProfile personProfile) {
		try {
		mongoTemplate.insert(personProfile, "profile");
		} catch(Exception e) {
			e.printStackTrace();
			return "person was not created: see logs";
		}
		return "person created";
	}
	
}
