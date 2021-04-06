package com.example.demo;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	//implements CommandLineRunner

	//@Autowired
//	private PlayerRepository playerRepository;

	List<Player> playerList = new ArrayList<Player>();
	//private Player player;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	
}
