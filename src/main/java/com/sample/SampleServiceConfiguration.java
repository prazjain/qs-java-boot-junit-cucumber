package com.sample;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.sample.common.ICommandLineParser;
import com.sample.common.impl.CommandLineParserImpl;
import com.sample.service.SampleService;
import com.sample.service.impl.SampleServiceImpl;

@Configuration
public class SampleServiceConfiguration {
	
	@Bean(name="modelMapper")
	public ModelMapper getModelMapper() { 
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}
	
	
	@Bean
	public ICommandLineParser getCommandLineParser() { 
		return new CommandLineParserImpl();
	}
	
	@Bean
	@Primary
	public SampleService getSampleService() { 
		return new SampleServiceImpl();
	}

}
