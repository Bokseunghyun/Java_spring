package com.spring.domain;

import lombok.Data;

@Data
public class MemberVO {
	private String userid;
	private String password;
	private String confirm_password;
	private String username;
	private String gender;
	private String email;
	
	public boolean isPasswordEqualToConfirmPassword() {
		return password.equals(confirm_password);
	}
}
