package com.example.gatekeeper;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@EnableZuulProxy
@SpringBootApplication
public class GatekeeperApplication {

  public static void main(String[] args) {
    SpringApplication.run(GatekeeperApplication.class, args);
  }
  @Bean
  public SimpleFilter simpleFilter() {
     return new SimpleFilter();
  }
}