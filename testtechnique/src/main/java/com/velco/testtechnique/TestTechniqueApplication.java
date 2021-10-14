package com.velco.testtechnique;

import com.velco.testtechnique.model.Reference;
import com.velco.testtechnique.repository.TestTechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class TestTechniqueApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TestTechniqueApplication.class, args);
	}


}
