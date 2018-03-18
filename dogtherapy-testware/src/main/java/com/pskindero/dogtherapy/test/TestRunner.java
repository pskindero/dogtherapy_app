package com.pskindero.dogtherapy.test;

import java.util.List;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.pskindero.dogtherapy.test.suite.AllTests;

public class TestRunner {

	public static void main(String[] args) {
		JUnitCore junitCore = new JUnitCore();
		junitCore.addListener(new TextListener(System.out));

		Result result = junitCore.run(AllTests.class);

		System.out.println("\n===== TEST CAMPAIGN RAPORT =====");
		List<Failure> failures = result.getFailures();
		if (failures.size() > 0) {
			System.out.println("FAILED: ");
			for (Failure failure : failures) {
				System.out.println("-" + failure.toString());
			}
		}

		System.out.println("\nTEST CAMPAIGN RESULT: " + (result.wasSuccessful() ? "PASSED" : "FAILED"));
		System.out.println("\n================================");
		System.exit(result.wasSuccessful()? 0 : 1);
	}

}
