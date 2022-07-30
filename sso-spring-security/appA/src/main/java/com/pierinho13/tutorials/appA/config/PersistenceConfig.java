package com.pierinho13.tutorials.appA.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan("com.pierinho13")
@EnableJpaRepositories("com.pierinho13")
@EnableTransactionManagement
@Configuration
public class PersistenceConfig {

}
