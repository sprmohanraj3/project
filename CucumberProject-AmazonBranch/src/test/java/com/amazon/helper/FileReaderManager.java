package com.amazon.helper;

public class FileReaderManager {
	
	public static FileReaderManager fr = new FileReaderManager();

	public static ConfigReader cr;
	
	public ConfigReader getConfigReader() throws Throwable {
		if (cr==null) {
			cr = new ConfigReader();
		}
		return cr;
	}
	
	public static FileReaderManager getInstance() {
		return fr;
	}
	
	private FileReaderManager() {
		
	}
}
