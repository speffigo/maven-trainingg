package com.javatpoint.application1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ApplicationTest {
	Application ap = new Application();

	@Test
	public void test() {

		assertEquals(2, ap.cw("Hello there!!"));

	}

}
