/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dew;

import java.util.Scanner;

/**
 *
 * @author INT105
 */
public class Devide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MyException{
        // TODO code application logic here
        try{
            exp("INT102");
            exp("INT105");
        }catch(MyException my){
            System.out.println(my);
        }
        finally{
            System.out.print("Result: ");
            exp("INT105");
            exp("INT107");
        }
        
        
//        
//        Scanner sc = new Scanner(System.in);
//        int x = 0, y = 0;
//        while (y != -999) {
//            System.out.print("X: ");
//            x = sc.nextInt();
//            System.out.print("Y: ");
//            y = sc.nextInt();
//        try {
//            System.out.println("1. x/y = " + devideMe(x, y));
//        } catch (ArithmeticException ex) {
//            System.out.println("!!!! y cannot be 0");
//        }
//            System.out.println("2. x/y = " + devideMe2(x, y));
//        }

    }

    public static double devideMe(int x, int y) {
        return x / y;

    }

    public static double devideMe2(int x, int y) {
        int result=0;
        try {
            result=x/y;
            System.out.println("x/y = " + devideMe(x, y));
        } catch (ArithmeticException ex) {
            result=0;
        }
        return result;

    }
     public static void exp(String subject) throws MyException{
        if(subject.equals("INT102")){
            throw new MyException("Exception: I have got \"A\" ");
        }
        System.out.println("I will get \"A\"");
            
        }
   
}
