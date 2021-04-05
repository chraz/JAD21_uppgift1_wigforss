package com.example.demo;

import java.util.Comparator;

public class IDSorter implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getId() - o2.getId();
    
    }

}
