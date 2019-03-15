/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KRabota;

/**
 *
 * @author user
 */
public class SisterChildrensRunner {
    public static void main(String[] args) {
       SisterChidrens sisterchldrens = new SisterChidrens();
       
       sisterchldrens.setActivity(new Girl());
       sisterchldrens.executeActivity();
       
       sisterchldrens.setActivity(new Boy());
       sisterchldrens.executeActivity();
       
       sisterchldrens.setActivity(new TeenageBoy());
       sisterchldrens.executeActivity();
       
       sisterchldrens.setActivity(new TeenageGirl());
       sisterchldrens.executeActivity();
       
       sisterchldrens.setActivity(new Guy());
       sisterchldrens.executeActivity();
       
       sisterchldrens.setActivity(new AdultGirl());
       sisterchldrens.executeActivity();
       
      

    
}
}
