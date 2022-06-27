package com.example.server.repo;
import com.example.server.model.Server;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Array;
@Configuration
public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);

}