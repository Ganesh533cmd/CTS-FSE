package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RequestMapping("/")
@RestController
public class HomeController {

private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	@RequestMapping("/")
	public String home() {
		
		return "Hello from Gallery Service running at port: " + env.getProperty("local.server.port");
	}
  

	@RequestMapping("/{id}")
	public Gallery getGallery(@PathVariable final int id) {
		LOGGER.info("Creating gallery object ... ");
		
		// create gallery object
		Gallery gallery = new Gallery();
		gallery.setId(id);

		// get list of available images 
		// @SuppressWarnings("unchecked")    // we'll throw an exception from image service to simulate a failure
		@SuppressWarnings("unchecked")
		List<Object> images = restTemplate.getForObject("http://image-service/images/", List.class);
		gallery.setImages(images);
	
		return gallery;
	}
}
