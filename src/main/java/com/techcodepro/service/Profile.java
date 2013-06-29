package com.techcodepro.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "profile")
public class Profile extends Person {

		private String confirmEmail;
		private String password;
		private String confirmPassword;
		private String questionOne;
		private String answerOne;
		private String questionTwo;
		private String answerTwo;
		private String questionThree;
		private String answerThree;
		
		

		public String getPassword() {
			return password;
		}
		@XmlElement
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConfirmEmail() {
			return confirmEmail;
		}
		@XmlElement
		public void setConfirmEmail(String confirmEmail) {
			this.confirmEmail = confirmEmail;
		}
		public String getConfirmPassword() {
			return confirmPassword;
		}
		@XmlElement
		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}
		
		public String getQuestionOne() {
			return questionOne;
		}
		@XmlElement
		public void setQuestionOne(String questionOne) {
			this.questionOne = questionOne;
		}
		public String getAnswerOne() {
			return answerOne;
		}
		@XmlElement
		public void setAnswerOne(String answerOne) {
			this.answerOne = answerOne;
		}
		public String getQuestionTwo() {
			return questionTwo;
		}
		@XmlElement
		public void setQuestionTwo(String questionTwo) {
			this.questionTwo = questionTwo;
		}
		public String getAnswerTwo() {
			return answerTwo;
		}
		@XmlElement
		public void setAnswerTwo(String answerTwo) {
			this.answerTwo = answerTwo;
		}
		public String getQuestionThree() {
			return questionThree;
		}
		@XmlElement
		public void setQuestionThree(String questionThree) {
			this.questionThree = questionThree;
		}
		public String getAnswerThree() {
			return answerThree;
		}
		@XmlElement
		public void setAnswerThree(String answerThree) {
			this.answerThree = answerThree;
		}
		
		@Override
		public String toString() {
			return "Profile [confirmEmail=" + confirmEmail + ", password="
					+ password + ", confirmPassword=" + confirmPassword
					+ ", questionOne=" + questionOne + ", answerOne="
					+ answerOne + ", questionTwo=" + questionTwo
					+ ", answerTwo=" + answerTwo + ", questionThree="
					+ questionThree + ", answerThree=" + answerThree + "]";
		}
		
		

	
}
