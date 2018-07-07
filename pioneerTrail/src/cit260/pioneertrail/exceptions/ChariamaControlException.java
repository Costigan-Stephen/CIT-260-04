/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.exceptions;

import cit260.pioneertrail.control.CharismaControl;

/**
 *
 * @author Stephen
 */
public class ChariamaControlException extends Exception{
    
    public ChariamaControlException() {
    }
    
    public ChariamaControlException(String message) {
        super(message);
    }
    
    public ChariamaControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ChariamaControlException(Throwable cause) {
        super(cause);
    }
    
    public ChariamaControlException(String message, 
                                     Throwable cause, 
                                     boolean enableSuppression, 
                                     boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
