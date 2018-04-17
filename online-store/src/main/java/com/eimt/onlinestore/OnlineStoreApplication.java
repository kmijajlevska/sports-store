package com.eimt.onlinestore;

import com.eimt.onlinestore.configuration.ThymeleafLayoutInterceptorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
public class OnlineStoreApplication {


	@Configuration
	@Import({ThymeleafLayoutInterceptorConfig.class})
	public static class MainConfiguration extends WebMvcConfigurationSupport {


	}

	public static void main(String[] args) {
		SpringApplication.run(OnlineStoreApplication.class, args);
	}
}
