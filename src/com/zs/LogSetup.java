package com.zs;

import lombok.Data;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Data
public class LogSetup {
	private static Logger log = LogManager.getLogger(LogSetup.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// configuration for log4j 1.x
		// PropertyConfigurator.configure("log4j.properties");
		// log=Logger.getLogger(LogSetup.class);
		log.debug("BeforeClass");
		print("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		log.info("AfterClass");
		print("AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		log.warn("Before");
		print("Before");
	}

	@After
	public void tearDown() throws Exception {
		log.error("After");
		print("After");
	}

	@Test
	public void test() {
		log.trace("test");
		print("This is test.");
	}

	@Test
	public void test2() {
		Logger log = LogManager.getLogger("com");
		log.warn("This is Test 2");
	}

	private static void print(Object object) {
		System.out.println(object);
	}

}
