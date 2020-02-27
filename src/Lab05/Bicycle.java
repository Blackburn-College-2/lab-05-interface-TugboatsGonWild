/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

/**
 *
 * @author wesley.mcmillen
 */
public class Bicycle implements CanTravel {

    double speed = 15;

    @Override
    public double move(double miles) {
        System.out.println("biking a distance of " + miles + " will take "
                + miles / speed + " hour(s)");
        double broke;
        double time = 0;
        double bike = 0;
        for (int i = 0; i < miles; i++) {
            bike++;
            broke = 100*Math.random()+1;
            if(broke == 100){
            break;    
            }
        }
        if(bike != miles){
            speed = 5.5;
             for (bike = bike; bike < miles; bike++) {
                
            }
        }
        
        time = miles / speed;
        return time;
    }

}
