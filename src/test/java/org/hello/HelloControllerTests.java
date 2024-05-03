package org.hello;

import org.hello.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertSame;

@ExtendWith(MockitoExtension.class)
public class HelloControllerTests {

	@InjectMocks
	private HelloController controller;

	@Test
	public void getHelloTest() throws Exception {
		ResponseEntity<String> response = controller.ping();
		assertSame("Hello, world!", response.getBody());
		assertSame(HttpStatus.OK, response.getStatusCode());
	}

}