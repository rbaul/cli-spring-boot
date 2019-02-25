package com.github.rbaul.devtool.spring.boot.cli.config;

import com.github.rbaul.devtool.spring.boot.cli.CliDevToolAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CliDevToolAutoConfiguration.class)
public class CliDevToolConfiguration {
}
