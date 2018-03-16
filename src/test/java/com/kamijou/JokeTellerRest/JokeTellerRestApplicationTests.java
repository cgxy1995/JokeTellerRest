package com.kamijou.JokeTellerRest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JokeTellerRestApplicationTests {

	@Test
	public void contextLoads() {
		String a = "aa";
		System.out.println(a.equals(null));
	}

}
