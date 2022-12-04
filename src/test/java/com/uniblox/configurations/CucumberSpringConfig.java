package com.uniblox.configurations;

import io.cucumber.spring.CucumberContextConfiguration;
import com.uniblox.SpringBootBasicApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringBootBasicApplication.class)
public class CucumberSpringConfig {
}
