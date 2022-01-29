/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1_multiplier;


/**
 *
 * @author Travi_groes869
 */
public class Multiplier {
    
    
    public Multiplier(){
        
    }
    
    public void calculate(int num,int loopNum){
        while(loopNum<=10){
            System.out.println(num+"*"+loopNum+"="+loopNum*num);
            loopNum++;
        }
    }
    
    
}
