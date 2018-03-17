package com.pskindero.dogtherapy.test.testcase.rest;

import static org.junit.Assert.assertEquals;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Set;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
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
		disableSslVerification();

		EndpointsDefinitions def = new EndpointsDefinitions();
		endpoints = def.getAllEndpointsFilteredByMethod(RequestMethod.GET);
	}

	@Test
	public void testAllGetMethods() {
		for (EndpointDefinition endpoint : endpoints) {
			RestTemplate r = new RestTemplate();
			ResponseEntity<String> res = r.getForEntity(endpoint.getUrl(), String.class);

			assertEquals("Incorrect HTTP Status from endpoint: " + endpoint.getUrl(), HttpStatus.OK,
					res.getStatusCode());
		}
	}

	private static void disableSslVerification() {
		try {
			// Create a trust manager that does not validate certificate chains
			TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkClientTrusted(X509Certificate[] certs, String authType) {
				}

				public void checkServerTrusted(X509Certificate[] certs, String authType) {
				}
			} };

			// Install the all-trusting trust manager
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			// Create all-trusting host name verifier
			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};

			// Install the all-trusting host verifier
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyManagementException e) {
			e.printStackTrace();
		}
	}

}
