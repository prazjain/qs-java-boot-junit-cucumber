package com.sample.bdd.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.sample.bdd.IntegrationTest;

import cucumber.api.java.Before;

public class IntegrationStepsDefinition  extends IntegrationTest {

	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders
						.webAppContextSetup(this.wac)
						.build();
	}
}
