package com.bugcatcher;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	Logger looger = LoggerFactory.getLogger(this.getclass());
	logger.info("테스트 해보기");

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TestPrApplication.class);
	}

}
