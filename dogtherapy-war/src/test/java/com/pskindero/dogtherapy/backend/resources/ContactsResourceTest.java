//package com.pskindero.dogtherapy.backend.resources;
//
//import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(ContactsResource.class)
//@AutoConfigureRestDocs(outputDir = "target/snippets")
//public class ContactsResourceTest {
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Test
//	public void shouldReturnDefaultMessage() throws Exception {
//		this.mockMvc.perform(get("https://172.168.0.101:8443/contact"))
//					.andExpect(status().isOk())
//					.andDo(document("contacts"));
//					.andExpect(content().string(containsString("Hello World")));
//	}
//}
