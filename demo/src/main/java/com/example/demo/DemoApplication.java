package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PlayerRepository playerRepository;

	List<Player> playerList = new ArrayList<Player>();
	private Player player;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		while (true) {
			System.out.println("*** MENY ***");
			System.out.println("1. Add new player");
			System.out.println("2. List players"); 
			System.out.println("3. Uppdate new player"); 
			System.out.println("4. Remove player"); 
			System.out.println("5. Search player"); 
			System.out.println("100.exit");
			int sel = Integer.parseInt(System.console().readLine());

			if (sel == 100)
				break;
			if (sel == 1){AddPlayer();}

			if (sel == 2){ListPlayers();}

			if(sel== 3){UpdatePlayer();}

			if(sel== 4){RemovePlayer();}

			if(sel== 4){SearchPlayer();}
			
		}
	}

	private void SearchPlayer() {

	
	
		
	}

	private void RemovePlayer() {
		ListPlayers();
		System.out.println("Id of player to remove");
		int removeId = Integer.parseInt(System.console().readLine());

		player = playerRepository.findById(removeId).get();
		System.out.println(player);

		System.out.println("remove? Y/N");
		String readLine = System.console().readLine();

		if(readLine.equals("Y")){
			playerRepository.delete(player);
		}
	}	

	private void UpdatePlayer() {

		ListPlayers();
		System.out.println("Id of player to update");
		int post = Integer.parseInt(System.console().readLine());
	
		player = playerRepository.findById(post).get();
		System.out.println(player);
		UpdatePlayer(player);
	
	}

	private void UpdatePlayer(Player p) {

		System.out.println("*** Update MENY ***");
		System.out.println("1. update name");
		System.out.println("2. update age"); 
     	System.out.println("3. update jersey"); 
		System.out.println("4. update City"); 

		int sel = Integer.parseInt(System.console().readLine());
		
	    if (sel == 1){
			handleName(p);
		}
	    if (sel == 2){
			handleage(p);
		}
	    if(sel== 3){
			handleJersey(p);	
		}
		if(sel== 4){
			handleCity(p);	
		}

		playerRepository.save(p);
		System.out.println(p);
	}

	
	private void ListPlayers() {
		Iterable<Player> findAll = playerRepository.findAll();
		
		for(Player player : findAll) {
			System.out.println(player.toString());
        }		
	}

	private void AddPlayer() {
		Player p = new Player();
		System.out.println("*** Add new player ***");

		handleName(p);
		handleage(p);
		handleJersey(p);
		handleCity(p);

		playerRepository.save(p);
		
	}

	private void handleName(Player p) {
		System.out.println("Name");
		String name = System.console().readLine().toString();	
		p.setName(name);
	}

	private void handleage(Player p) {
		System.out.println("age");
		int age = Integer.parseInt(System.console().readLine());
		p.setAge(age);
	}

	private void handleJersey(Player p) {
		System.out.println("jersey");
		int jersey = Integer.parseInt(System.console().readLine());
		p.setJersey(jersey);
	}

	private void handleCity(Player p) {
		System.out.println("city");
		String city = System.console().readLine();
		p.setCity(city);
	}


	
}
