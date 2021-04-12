package com.skindow.consumer;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author shaoyongchang
 */
@Slf4j
@SpringBootApplication
@EnableSwagger2
@MapperScan("com.skindow.consumer.mapper")
@EnableFeignClients(basePackages="com.skindow.common.fiegn")
@EnableDiscoveryClient
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
		log.info("###### 服务consumer 启动成功 ###### !!");
	}
}
