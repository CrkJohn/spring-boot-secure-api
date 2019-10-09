package ieti.trello.backend.trello;

import ieti.trello.backend.trello.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrelloApplication {

	@Bean
	public FilterRegistrationBean jwtFilter(){
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter( new JwtFilter() );
		registrationBean.addUrlPatterns( "/v1/user/*" );
		registrationBean.addUrlPatterns( "/v1/task/*" );
		return registrationBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(TrelloApplication.class, args);
	}

}
