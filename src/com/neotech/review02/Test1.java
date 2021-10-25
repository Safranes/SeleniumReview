package com.neotech.review02;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

public class Test1 {
public static void main(String[] args) {
	
	ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
	
	String url=ConfigsReader.getProperty("url");
	System.out.println("url->"+ url);
	
	System.out.println("browser->"+ConfigsReader.getProperty("browser"));

}
}
