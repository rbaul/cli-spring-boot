package com.github.rbaul.devtool.spring.boot.cli;

import com.github.rbaul.devtool.spring.boot.cli.config.CliDevToolConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@AutoConfigurationPackage
@Import(CliDevToolConfiguration.class)
public class CliDevToolAutoConfiguration {
}
