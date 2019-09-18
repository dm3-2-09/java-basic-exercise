/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Ikasleak;

/**
 *
 * @author DM3-2-09
 */
public class proba {
    public static void main(String[] args) {
        Ikasleak ik1 = new Ikasleak(1, "Sergio","Ferrero","Martinez","dm3-2-09");
        
        ArrayList<Ikasleak> ikasleZerrenda = new ArrayList<Ikasleak>();
        
        ikasleZerrenda.add(ik1);
        ikasleZerrenda.add(new Ikasleak(2,"Bob","Gray","It","@microsoft"));
        
        for (int i=0; i<ikasleZerrenda.size();i++) {
            System.out.println(ikasleZerrenda.get(i));
        }
        ObservableList<Ikasleak> ikObserv = FXCollections.observableArrayList(
                new Ikasleak(3,"Beñat","Bizente","Izagirre","@uni.eus"));
                new Ikasleak(4,"Beñat","Elizondo","Irureta","@uni.eus");
        
        ikasleZerrenda.add(ik1);
        ikasleZerrenda.remove(ik1);
        
        System.out.println("OBSERVABLE LISTA");
        for (int i=0;i<ikObserv.size();i++)
        {
            System.out.println(ikObserv.get(i));
        }
    }
}
