package com.panhb.dataway;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hongbo.pan
 * @date 2022/12/9
 */
@EnableHasor()
@EnableHasorWeb()
@SpringBootApplication
public class DatawayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatawayApplication.class, args);
	}

}
