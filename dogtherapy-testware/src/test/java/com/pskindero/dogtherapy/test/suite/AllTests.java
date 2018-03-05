package com.pskindero.dogtherapy.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	BackendSuite.class,
	UISuite.class
})
public class AllTests {

}
