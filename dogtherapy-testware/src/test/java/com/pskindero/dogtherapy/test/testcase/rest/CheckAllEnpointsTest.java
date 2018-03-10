package com.pskindero.dogtherapy.test.testcase.rest;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.pskindero.dogtherapy.test.utils.EndpointsDefinitions;
import com.pskindero.dogtherapy.test.utils.EndpointsDefinitions.EndpointDefinition;

public class CheckAllEnpointsTest {

	private static Set<EndpointDefinition> endpoints;

	@BeforeClass
	public static void findAllGetEndpoints() {
		HttpsURLConnection.setDefaultHostnameVerifier(
			    SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
		
		EndpointsDefinitions def = new EndpointsDefinitions();
		endpoints = def.getAllEndpointsFilteredByMethod(RequestMethod.GET);
	}
	
	@Test
	public void testAllGetMethods() {
		for (EndpointDefinition endpoint : endpoints) {
			RestTemplate r = new RestTemplate();
			ResponseEntity<String> res = r.getForEntity(endpoint.getUrl(), String.class);
			
			assertEquals("Incorrect HTTP Status from endpoint: " + endpoint.getUrl(), 
					HttpStatus.OK, res.getStatusCode());
		}
	}
}
