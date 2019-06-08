package com.sample.controller;

import org.junit.Before;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.sample.service.impl.SampleServiceImpl;

@ExtendWith(SpringExtension.class)
//@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class SampleControllerTest {

	@Mock
	private SampleServiceImpl accountService;	
		
	@InjectMocks
	private SampleController controller;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Mock
	private ModelMapper modelMapper;
	
	
	@Before
	public void before() { 
		MockitoAnnotations.initMocks(this) ;
		this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
}
