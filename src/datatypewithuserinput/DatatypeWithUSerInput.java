/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypewithuserinput;

import java.util.Scanner;

/**
 *
 * @author NAVTTC07
 */
public class DatatypeWithUSerInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ENter 1st number");
        if (scan.hasNextInt()) {

            int number7 = scan.nextInt();

            System.out.println("ENter 2nd number");
            int number8 = scan.nextInt();

            int answer = number7 + number8;

            System.out.println("sum int " + answer);

        }
        else if(scan.hasNextFloat()) {

            float number7 = scan.nextFloat();

            System.out.println("ENter 2nd number");
            float number8 = scan.nextFloat();

            float answer = number7 + number8;

            System.out.println("sum float " + answer);

        }

    }

}
