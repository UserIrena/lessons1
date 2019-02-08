/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public class Massiv2 {
     public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        
       measureTime(arrayList);
        
        List<Integer> linkedList = new LinkedList<>();
         measureTime(linkedList);
     }

    private static void measureTime(List<Integer> list) {
       
       for (int i = 0; i<100000; i++){
           list.add(0,i);
       }
       long start = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++){
            list.get(i);
        }
       long end = System.currentTimeMillis();
        System.err.println("diff " + (end - start));
        System.err.println("");
    }
     
    
}
