package com.example.server;

import com.example.server.enumeration.Status;
import com.example.server.model.Server;
import com.example.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverrepo) {
		return args -> {
			serverrepo.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB", "Personal PC",
					"http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverrepo.save(new Server(null, "192.168.1.58", "Fedora Linux", "16 GB", "DELL PC",
					"http://localhost:8080/server/image/server2.png", Status.SERVER_UP));
			serverrepo.save(new Server(null, "192.168.1.21", "MS 2008", "16 GB", "Web Server ",
					"http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
			serverrepo.save(new Server(null, "192.168.1.160", "Red Hat Linux", "64 GB", "Mail Server ",
					"http://localhost:8080/server/image/server4.png", Status.SERVER_UP));
		};

	}
}
