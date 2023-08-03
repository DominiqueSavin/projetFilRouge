package com.formaclean.projetfilrouge;

import com.formaclean.projetfilrouge.controller.WorkerController;
import com.formaclean.projetfilrouge.entities.Worker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class ProjetFilRougeApplication {


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProjetFilRougeApplication.class, args);
		WorkerController workerController = context.getBean(WorkerController.class);





	}

}
