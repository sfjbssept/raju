package com.user.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.user.entity.User;

@SpringBootTest
public class UserRepoTest {
	
	@Autowired
	private UserRepo repo;
	
	@Test
	public void isUserExit() {
		User user =new User(123,"Raju@tcs.com","Raju","Male",35);
		
		User id=repo.save(user);
      
        assertThat(123).equals(id);
	}

}
