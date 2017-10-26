package com.winter;

import com.winter.Controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisDemoApplicationTests {

	@Autowired
	private UserController user;
	/*@Test
	public void contextLoads() {
	}*/

	@Test
	public void say(){
		Object obj=new Object();
		obj=user.findAllUser(1,10);
		System.out.println( obj);
	}
}
