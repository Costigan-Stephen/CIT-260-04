/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneettrail.exceptions;

import cit260.pioneertrail.control.GameControl;

/**
 *
 * @author Stephen
 */
public class GameControlException extends Exception{

    public GameControlException() {
    }
    
    public GameControlException(String message) {
        super(message);
    }
    
    public GameControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public GameControlException(Throwable cause) {
        super(cause);
    }
    
    public GameControlException(String message, 
                                     Throwable cause, 
                                     boolean enableSuppression, 
                                     boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
