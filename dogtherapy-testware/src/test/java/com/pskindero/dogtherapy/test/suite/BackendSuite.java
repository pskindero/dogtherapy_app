package com.pskindero.dogtherapy.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.pskindero.dogtherapy.test.testcase.rest.CheckAllEnpointsTest;

@RunWith(Suite.class)
@SuiteClasses({
	CheckAllEnpointsTest.class
})
public class BackendSuite {

}
