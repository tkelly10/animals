/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mattgreen;

/**
 *
 * @author tyler
 */
public class InputTypeVerifier {
  
    public int checkInt(String str) throws NumberFormatException
    { 
               int i = Integer.parseInt(str);
            
        return i;
    }
     
}
