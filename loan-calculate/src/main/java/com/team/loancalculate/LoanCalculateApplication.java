package com.team.loancalculate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuzhi
 */
@SpringBootApplication
@MapperScan("com.team.loancalculate.mapper")
public class LoanCalculateApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoanCalculateApplication.class, args);
    }

}
