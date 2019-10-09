/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrew.wayne
 */
public class creature2 {
    public static void main(String[] args) {
        double spider = 10.0;
        double fly=2.0;
        
        while(spider>fly){
            if(spider %2==0){
                System.out.println(spider);
            }
            spider=spider-1;
        }
        System.out.println("Spider: "+spider);
        System.out.println("Fly: "+fly);
    }
    
}
