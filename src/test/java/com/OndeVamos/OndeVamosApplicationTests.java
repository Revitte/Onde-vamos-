package com.OndeVamos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class OndeVamosApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private RestTemplate restTemplate;

	@Test
	void contextoCarregado() {
		assertThat(applicationContext).isNotNull();
	}

	@Test
	void restTemplateBeanCarregado(){
		assertThat(restTemplate).isNotNull();
	}
}
