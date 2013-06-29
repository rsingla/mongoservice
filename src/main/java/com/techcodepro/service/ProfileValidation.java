package com.techcodepro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techcodepro.dao.PersonDao;
import com.techcodepro.model.PersonProfile;

@Component
public class ProfileValidation {

	@Autowired
	PersonDao personDao;

	public String homeTechCodePro(Profile profile) throws Exception {
		System.out.println(profile);
		validate(profile);
		PersonProfile personProfile = profileToProfileDao(profile);
		personDao.createProfile(personProfile);
		return "profileCreated";
	}

	private PersonProfile profileToProfileDao(Profile profile)  {
		PersonProfile personProfile = new PersonProfile();
		personProfile.setProfileId(generateProfileId().toString());
		personProfile.setAnswerOne(profile.getAnswerOne());
		personProfile.setAnswerTwo(profile.getAnswerTwo());
		personProfile.setAnswerThree(profile.getAnswerThree());
		personProfile.setQuestionOne(profile.getQuestionOne());
		personProfile.setQuestionTwo(profile.getQuestionTwo());
		personProfile.setQuestionThree(profile.getQuestionThree());
		personProfile.setEmail(profile.getEmail());
		personProfile.setFirstName(profile.getFirstName());
		personProfile.setLastName(profile.getLastName());
		personProfile.setPassword(profile.getPassword());
		return personProfile;

	}

	private void validate(Profile profile) throws Exception {
		if(!profile.getConfirmEmail().equalsIgnoreCase(profile.getEmail())) {
			throw new Exception("Email is not valid");
		}

	}

	private UUID generateProfileId() {
		UUID uuid = new UUID(10000,23455585);
		return uuid.randomUUID();
	}

	public List<Person> getProfile(String key,String value) {

		List<PersonProfile> persprofList = personDao.getProfile(key,value); 
		System.out.println(persprofList);
		System.out.println();

		List<Person> personProfile = new ArrayList<Person>();

		for(PersonProfile persprof: persprofList) {
			Person person = new Person();

			if(persprof != null) {
				person.setEmail(persprof.getEmail());
				person.setFirstName(persprof.getFirstName());
				person.setLastName(persprof.getLastName());
				person.setDateOfBirth(persprof.getDateOfBirth());
				person.setGender(persprof.getGender());
			}
			personProfile.add(person);
		}
		return personProfile;
	}
}
