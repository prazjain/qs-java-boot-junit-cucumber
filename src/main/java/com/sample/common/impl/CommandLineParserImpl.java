package com.sample.common.impl;

import java.util.List;

import com.sample.common.ICommandLineParser;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommandLineParserImpl implements ICommandLineParser {

	private List<String> args;

	@Override
	public void setData(List<String> args) {
		setArgs(args);
	}
	
	/**
	 * This valid condition can be further tightened, but for now this will do.
	 */
	@Override
	public boolean isValid() {
		return args != null && verifyArguments(args);
	}

	public boolean verifyArguments(List<String> args) {
		boolean successful = true;
		
		return successful;
	}
}
