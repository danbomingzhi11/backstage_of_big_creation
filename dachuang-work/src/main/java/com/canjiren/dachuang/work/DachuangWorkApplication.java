package com.canjiren.dachuang.work;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.canjiren.dachuang.work.mapper")
public class DachuangWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DachuangWorkApplication.class, args);
    }

}
