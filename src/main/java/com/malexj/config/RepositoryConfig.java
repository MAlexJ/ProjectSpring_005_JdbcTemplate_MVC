package com.malexj.config;

import com.malexj.repository.PostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@ComponentScan("com.malexj.repository")
@PropertySource("classpath:dp.properties")
public class RepositoryConfig {

    @Resource
    private Environment env;

    @Bean
    public DataSource dataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName(env.getRequiredProperty("db.driver"));
//        dataSource.setUrl(env.getRequiredProperty("db.url"));
//        dataSource.setUsername(env.getRequiredProperty("db.username"));
//        dataSource.setPassword(env.getRequiredProperty("db.password"));
//      //  dataSource.setRemoveAbandonedOnBorrow(Boolean.parseBoolean(env.getRequiredProperty("db.removeAbandoned")));
//        dataSource.setInitialSize(Integer.parseInt(env.getRequiredProperty("db.initialSize")));
//        dataSource.setMaxIdle(Integer.parseInt(env.getRequiredProperty("db.maxActive")));
//        return dataSource;
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/db_site");
        dataSource.setUsername("postgres");
        dataSource.setPassword("2687484a");
        return dataSource;
    }

    @Autowired
    @Qualifier(value = "postgresRepositoryImpl")
    public PostgresRepository repository;
}
