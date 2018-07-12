/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;
import cit260.pioneertrail.exceptions.GameControlException;
/**
 *
 * @author hughes
 */
public class CharismaControl {
    boolean calculateCharisma(boolean gender, char occupation, double money)throws GameControlException{
    
//If (gender = female) { charisma+ 10 }
//If(gender = male) {charisma + 5}
//If (occupation = lawyer) { charisma + 15 }
//If (occupation = blacksmith {charisma + 10
//If (occupation =  farmer) { charisma + 1 }
//If (money * .10 + charisma)
//    return charisma > 20


//if gender true == female
    double charisma = 0;
        if(gender == true) {
            charisma = charisma + 10.0;
        }
        //male
      if(gender == false) {
           charisma = charisma + 5.0;
        }
      //lawyer
        if (occupation == 'l')
                charisma = charisma + 15.0;
        //blacksmith
         if (occupation == 'b')
                charisma = charisma + 10.0;
         //farmer
          if (occupation == 'f')
                charisma = charisma + 1.0; 
          if (money > 0){
           charisma = money * .1 + charisma;  
          }
           if (money < 0){
             throw new GameControlException("Money cannot be less than 0");
          }
          System.out.println("Charisma is at " + charisma);
          
        return charisma > 20.0;
        
    }

}

