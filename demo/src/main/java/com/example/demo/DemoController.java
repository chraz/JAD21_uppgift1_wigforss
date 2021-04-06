package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//http-anrop 127:0:0:1:8080/player
@RestController
public class DemoController {

    @Autowired
	private PlayerRepository playerRepository;

    @GetMapping(path ="/player")
    List<Player> getAll(){
        var l = new ArrayList<Player>();

        for(Player p : playerRepository.findAll() ){

            l.add(p);
        }
        return l;
        
    }
    @GetMapping(path ="/player/{id}")
    Player getSinglePlayer(@PathVariable Integer id){
        return playerRepository.findById(id).get();
    }
}
