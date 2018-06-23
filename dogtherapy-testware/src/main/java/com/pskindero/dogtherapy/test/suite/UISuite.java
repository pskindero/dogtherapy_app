package com.pskindero.dogtherapy.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.pskindero.dogtherapy.test.model.errorpage.ErrorPage;
import com.pskindero.dogtherapy.test.testcase.ui.HomePageNavigationTest;

@RunWith(Suite.class)
@SuiteClasses({
	HomePageNavigationTest.class,
	ErrorPage.class
})
public class UISuite {

}
