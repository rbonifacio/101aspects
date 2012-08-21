package org.softlang.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CutTest extends CompanyTest {

	@Test
	public void cutTest() {
		assertEquals(1100, company.total(), 0.0);
		company.cut();
		assertEquals(550, company.total(), 0.0);
	}
}
