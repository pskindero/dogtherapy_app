package com.pskindero.dogtherapy.test.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMethod;

public class EndpointsDefinitions {
	
	public static final String MAIN_PAGE_IP="https://172.168.0.100:8443";
	public static final String BACKEND_IP="https://172.168.0.101:8443";

	public static class EndpointDefinition {
		private String url;
		private Set<RequestMethod> methods;
		
		public EndpointDefinition(String url, RequestMethod...methods) {
			this.url = url;
			this.methods = Collections.unmodifiableSet(
					new HashSet<RequestMethod>(Arrays.asList(methods)));
		}

		public String getUrl() {
			return url;
		}

		public Set<RequestMethod> getMethods() {
			return methods;
		}
	}

	
	
	public static final EndpointDefinition CONTACT_ENDPOINT = 
			new EndpointDefinition(BACKEND_IP + "/contact", RequestMethod.GET);
	
	private Set<EndpointDefinition> allEndpoints;
	
	public EndpointsDefinitions() {
		allEndpoints = Collections.unmodifiableSet( new HashSet<EndpointDefinition>( Arrays.asList(
				CONTACT_ENDPOINT
				)));
	}
	
	public Set<EndpointDefinition> getAllEndpointsFilteredByMethod(RequestMethod method) {
		Set<EndpointDefinition> filtered = new HashSet<EndpointDefinition>();
		for (EndpointDefinition endpoint : allEndpoints) {
			if (endpoint.getMethods().contains(method)) {
				filtered.add(endpoint);
			}
		}
		return filtered;
	}
}
