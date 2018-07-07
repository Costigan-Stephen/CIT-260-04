/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneettrail.exceptions;

/**
 *
 * @author maril
 */
public class TradeControlException extends Exception{

    public TradeControlException() {
    }

    public TradeControlException(String string) {
        super(string);
    }

    public TradeControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public TradeControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public TradeControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
