package com.wzj.fzdx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.wzj.fzdx.mapper")
@SpringBootApplication
public class Fzdx250306Application {

    public static void main(String[] args) {
        SpringApplication.run(Fzdx250306Application.class, args);
    }

}
