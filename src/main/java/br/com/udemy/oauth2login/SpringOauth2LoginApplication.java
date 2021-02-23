package br.com.udemy.oauth2login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringOauth2LoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOauth2LoginApplication.class, args);
    }

}
