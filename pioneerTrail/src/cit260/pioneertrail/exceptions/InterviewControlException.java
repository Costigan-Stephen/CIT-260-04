/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.exceptions;

import cit260.pioneertrail.control.InterviewControl;

/**
 *
 * @author Stephen
 */
public class InterviewControlException extends Exception{
    
    public InterviewControlException() {
    }
    
    public InterviewControlException(String message) {
        super(message);
    }
    
    public InterviewControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public InterviewControlException(Throwable cause) {
        super(cause);
    }
    
    public InterviewControlException(String message, 
                                     Throwable cause, 
                                     boolean enableSuppression, 
                                     boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
