package org.beginner;

import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTest extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.totalbeginner.tutorial");
		//$JUnit-BEGIN$
		suite.addTestSuite(BookTest.class);
		suite.addTestSuite(PersonTest.class);
		//$JUnit-END$
		return suite;
		}

}
