/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

/**
 *
 * @author andrew.wayne
 */
public class scopeBasics {
    
    private static String classScopedVar = "All methods can access me";
    
    public static void demonstrateScope() {
        System.out.println("Inside demonstrateScope");
        
        String localScope2 = "I'm local to demonstrateScope";
        
        
        classScopedVar = "I can be changed in any method";
        
        System.out.println(classScopedVar);
        System.out.println(localScope2);
        
    } // closes demonsrate
    
    public static void main(String[] args) {
        System.out.println("Inside main");
        String localScope1 = "I'm local to main";
        System.out.println(localScope1);
        System.out.println(classScopedVar);
        
     
        
    }
    
} //closes class
