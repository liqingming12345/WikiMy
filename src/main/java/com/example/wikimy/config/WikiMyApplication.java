package com.example.wikimy.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan("com.example")
@SpringBootApplication
@MapperScan("com.example.wikimy.mapper")
public class WikiMyApplication {

    private static final Logger LOG = LoggerFactory.getLogger(WikiMyApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WikiMyApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！123");
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
