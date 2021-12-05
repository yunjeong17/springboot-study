package com.study.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController //@RestController는 Rest 방식으로 오는 요청을 처리하기 위한 어노테이션
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
	
//	@GetMapping("/")
//	//@RequestMapping("/")
//	public String helloWorld() {
//		return "hello, world!";
//	}
}
