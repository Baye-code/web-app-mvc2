package com.saraya.form;

import org.springframework.stereotype.Service;

@Service
public class UserValidation {
	public boolean isValid(String username, String password) {
		return username.equalsIgnoreCase("sabarane") && password.equals("passer@1");
	}

}
