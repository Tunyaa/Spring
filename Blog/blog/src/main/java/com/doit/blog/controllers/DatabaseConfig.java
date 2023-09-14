
package com.doit.blog.controllers;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

 @Configuration
   public class DatabaseConfig {
   
       @Bean
       public DataSource dataSource() {
           DriverManagerDataSource dataSource = new DriverManagerDataSource();
           dataSource.setDriverClassName("org.postgresql.Driver");
           dataSource.setUrl("jdbc:postgresql://localhost:5432/blog");
           dataSource.setUsername("spring");
           dataSource.setPassword("spring");
           return dataSource;
       }
   }
