package com.group4.procurement1;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.group4.procurement1.controller.FileUploaderController;

@SpringBootApplication
@ComponentScan({"com.group4.procurement1" , "com.group4.procurement1.controller"})
public class Procurement1Application {

	public static void main(String[] args) {
		new File(FileUploaderController.uploadDirectory).mkdir();
		SpringApplication.run(Procurement1Application.class, args);
	}

}
