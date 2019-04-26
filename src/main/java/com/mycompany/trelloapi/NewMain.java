/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trelloapi;

import java.util.HashMap;
import java.util.Map;
import org.trello4j.Trello;
import org.trello4j.TrelloImpl;
import org.trello4j.model.Board;
import org.trello4j.model.Card;

/**
 *
 * @author avbravo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String API_KEY="e3e8b8df8f62a8649f73f9aecfb2830e";
            String API_TOKEN ="c2b5d926288fb18d8a9479386d34e90e9fd6c04bbda062fec74d4f677a596812";
                    // TODO code application logic here
        // myToken is optional, set to null if you are accessing public data
Trello trello = new TrelloImpl(API_KEY, API_TOKEN);  

//Trello trello = new TrelloImpl("zkjgUvfi", "c2b5d926288fb18d8a9479386d34e90e9fd6c04bbda062fec74d4f677a596812");  

// example: get organization by its name
//Organization org = trello.getOrganization("utica");
Board board = trello.getBoard("Javscaz Empresa");
          //  System.out.println("nombre "+org.getName());
            System.out.println("board organization"+board.getIdOrganization());
            System.out.println("board name "+board.getName());
            System.out.println("board url"+board.getUrl());
            
            
//            Map<String, String> map = new HashMap<String, String>();
//        map.put("desc", "Hola desde Java");
//
//        // WHEN
//    Card card = new TrelloImpl(API_KEY, API_TOKEN).createCard(listId, name, map);

   
  
        } catch (Exception e) {
            System.out.println("Error"+e.getLocalizedMessage());
        }
        


    }
    
    
}
