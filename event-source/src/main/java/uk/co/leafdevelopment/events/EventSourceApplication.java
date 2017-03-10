package uk.co.leafdevelopment.events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(org.springframework.cloud.stream.app.jdbc.source.JdbcSourceConfiguration.class)
public class EventSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventSourceApplication.class, args);
	}
}
