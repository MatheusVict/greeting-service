package com.example.greetingservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
/*
This annotation is used to refresh the configuration properties without restarting the application,
but you need to use the actuator endpoint /actuator/refresh
*/
@RefreshScope
@ConfigurationProperties("greeting-service")
public class GreetingConfiguration {
  private String greeting;
  private String defaultValue;

  public GreetingConfiguration() {
  }


  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }
}
