/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

/**
 *
 * @author paul.kline
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanTravel travel = new Car();
        
    }
    public void roundTrip(CanTravel travel, double distance){
            System.out.println("Round trip!");
            System.out.println("Lets go...");
            System.out.println("Moving by " +travel+ " I see");
            System.out.println("Moving for " +distance+ " miles");
            System.out.println("It takes " +travel.move(distance)+ " hours");
        }
}
