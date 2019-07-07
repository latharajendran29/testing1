package com.helper;

import java.io.IOException;

public class FileReadermanager {
	private FileReadermanager() {
	
	}
	public static FileReadermanager fm=new FileReadermanager();
	public static FileReadermanager getInstance() {
		return fm;
	}
public ConfigReader cr;
public ConfigReader getCr() throws IOException {
if(cr==null) {
	cr=new ConfigReader();
}
return cr;
}
}
