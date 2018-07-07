/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.exceptions;

import cit260.pioneertrail.control.HealthControl;

/**
 *
 * @author Stephen
 */
public class HealthControlException extends Exception{

    public HealthControlException() {
    }
    
    public HealthControlException(String message) {
        super(message);
    }
    
    public HealthControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public HealthControlException(Throwable cause) {
        super(cause);
    }
    
    public HealthControlException(String message, 
                                     Throwable cause, 
                                     boolean enableSuppression, 
                                     boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
