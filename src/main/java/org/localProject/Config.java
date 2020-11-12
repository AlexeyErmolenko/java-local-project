package org.localProject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.localProject")
@PropertySource("classpath:musicPlayer.properties")
public class Config {
}
