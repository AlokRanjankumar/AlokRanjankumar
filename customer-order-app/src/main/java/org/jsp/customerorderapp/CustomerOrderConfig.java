package org.jsp.customerorderapp;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration1
@ComponentScan({ "org.jsp.customerorderapp" })
public class CustomerOrderConfig {
	@Bean
	public EntityManager entityManager2() {
	return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
}
