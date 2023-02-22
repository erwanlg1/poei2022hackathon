package com.freestack.spring.controllers;

import com.freestack.spring.EntityManagerFactorySingleton;
import com.freestack.spring.models.Video;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

@RestController
@RequestMapping("/test")
public class SimpleController {

	@GetMapping
	public Video test() {
		Video video = new Video();
		video.setTitle("titre de test");
		video.setDescription("description de test");
		return video;
	}
}
