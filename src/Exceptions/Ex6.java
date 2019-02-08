/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author user
 */
public class Ex6 {
    
    //вложенность try+catch
    public static void main(String[] args) {
        try {
            throw new UserException();            
        } catch (UserException userException) {
            System.out.println("Обработка исключения");
            userException.method();
        }
    }
}
