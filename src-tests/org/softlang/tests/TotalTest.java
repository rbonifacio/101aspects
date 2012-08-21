package org.softlang.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TotalTest extends CompanyTest {

	@Test
	public void test() {
		assertEquals(1100, company.total(), 0.0);
	}

}
