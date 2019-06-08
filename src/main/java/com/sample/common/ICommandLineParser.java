package com.sample.common;

import java.util.List;

public interface ICommandLineParser {
	public boolean isValid();
	public void setData(List<String> args);
}
