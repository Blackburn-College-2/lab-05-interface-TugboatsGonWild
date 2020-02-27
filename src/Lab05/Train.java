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
public class Train implements CanTravel{
double speed = 50;
    @Override
    public double move(double miles) {
        System.out.println("traveling a distance of " +miles+ " will take " 
                +miles/speed+ " hours");
        double time = miles/speed + miles%speed;
        return time;
    }
    
}
