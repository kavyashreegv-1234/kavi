package com.mpokket_assesment.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class Fileutility {
	/**
	 * readdatafrompropfile
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readdatafrompropfile(String key) throws Throwable
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(Pathconstants.propfilepath);
		prop.load(fis);
		return prop.getProperty(key);

}}
