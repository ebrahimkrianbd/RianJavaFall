/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rian
 */
public class HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int save = 0;
        
        System.out.println("How many numbers you want to enter: ");
            int n = scanner.nextInt();
        
        System.out.println("Enter Numbers: \n");
            for(int i=0; i<n; i++){
                 int data = scanner.nextInt();
                 in.add(data);
                 save += data;
            }
            
            double average = (save*1.0) / n;
            
        System.out.printf("Mean = %.3f\n", average);
        
        double sdsave = 0;
        
            for(int i=0; i<n; i++){
                sdsave += (in.get(i)- average) * (in.get(i)- average);
            }
            
        double stdev = Math.sqrt(sdsave/(n-1));
        
        System.out.printf("Standard Deviation = %.3f\n", stdev);
            
    }
    
}
