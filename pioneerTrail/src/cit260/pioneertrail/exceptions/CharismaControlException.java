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
public class CharismaControlException extends Exception{
    
    public CharismaControlException() {
    }
    
    public CharismaControlException(String message) {
        super(message);
    }
    
    public CharismaControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public CharismaControlException(Throwable cause) {
        super(cause);
    }
    
    public CharismaControlException(String message, 
                                     Throwable cause, 
                                     boolean enableSuppression, 
                                     boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
