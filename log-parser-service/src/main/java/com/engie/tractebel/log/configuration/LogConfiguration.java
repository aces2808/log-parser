package com.engie.tractebel.log.configuration;

import com.engie.tractebel.log.constants.LogParserContants;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = LogParserContants.BASE_PACKAGE)
public class LogConfiguration {
}
