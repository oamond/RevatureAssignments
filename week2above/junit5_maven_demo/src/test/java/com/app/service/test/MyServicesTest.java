package com.app.service.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.service.MyServices;


class MyServicesTest {

private static MyServices services;
	
	@BeforeAll
	public static void setupMyServices() {
		services = new MyServices();
		
	}
	
	@Test
	public void testSayHelloByName() {
		String output = "Hello Oscar";
		assertEquals(output, services.sayHello("Oscar"));
	}
	
	@Test
	public void testSayHelloForNull() {
		assertNull(services.sayHello(null));
	}

}