package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sample.common.ICommandLineParser;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class SampleBootServiceApplication implements CommandLineRunner {
	
	@Autowired
	private ICommandLineParser commandLineParser;

	public static void main(String[] args) {
		SpringApplication.run(SampleBootServiceApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		log.info("Starting application...");		
        List<String> params = Arrays.stream(args).collect(Collectors.toList());
        commandLineParser.setData(params);
        if (commandLineParser.isValid()) { 
        	
        	System.out.println("Hello World");
        	
        } else { 
        	log.warn("Invalid arguments " + params.toString());
        }
        
        System.exit(0);
	}

}
