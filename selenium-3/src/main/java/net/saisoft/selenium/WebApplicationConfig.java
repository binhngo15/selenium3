/**
 * 
 */
package net.saisoft.selenium;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Joe Guaneri
 *
 */
@ComponentScan(basePackages={"net.saisoft.selenium"})
@Configuration
@EnableWebMvc
@EnableAutoConfiguration
public class WebApplicationConfig {

	/**
	 * 
	 */
	public WebApplicationConfig() {
	}

	 @Bean
	 public ViewResolver viewResolver() {
	     InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
	     viewResolve.setPrefix("/WEB-INF/jsp/");
	     viewResolve.setSuffix(".jsp");
	     return viewResolve;
	 }
}
