package io.github.benxincaomu.gitserver.config.datasource;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidDatasourceConfig {

    
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource datasource() {
        DruidDataSource datasource=new DruidDataSource();
        return datasource;
    }
}
