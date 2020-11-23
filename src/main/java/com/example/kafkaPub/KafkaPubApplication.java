package com.example.kafkaPub;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@SpringBootApplication
@RestController
@Slf4j
public class KafkaPubApplication {

	@Autowired
	StreamBridge bridge;

	public static void main(String[] args) {
		SpringApplication.run(KafkaPubApplication.class, args);
	}

	@PostMapping("/{target}")
	public Boolean doIt(@PathVariable("target") String target, @RequestBody Map<String, Object> body) {
		return bridge.send(target, body);
	}
}
