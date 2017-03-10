package uk.co.leafdevelopment.events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(org.springframework.cloud.stream.app.log.sink.LogSinkConfiguration.class)
public class EventLogSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventLogSinkApplication.class, args);
	}

}
