package com.admin.utility;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecuredPasswordGenerator {
	

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	    String rawPassword = "yadav";
	    String encodedPassword = encoder.encode(rawPassword);
	    
	   
	

	
}
