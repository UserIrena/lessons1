/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compositel;

import CollectTest.JavaDeveloper;

/**
 *
 * @author user
 */
public class Project {
    public static void main(String[] args) {
        Team team = new Team();
        
        Developer javaDeveloper = new JavaDeveloper();
        Developer phpDeveloper = new PhpDeveloper();
         Developer CppDeveloper = new CppDeveloper();
         Developer PythonDeveloper = new PythonDeveloper();
        
        team.addDeveloper(javaDeveloper);
        team.addDeveloper(phpDeveloper);
        team.addDeveloper(CppDeveloper);
        team.addDeveloper(PythonDeveloper);
        
        team.createProject();
    }
    
}
