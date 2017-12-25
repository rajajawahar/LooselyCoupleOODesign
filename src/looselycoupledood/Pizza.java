/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looselycoupledood;

/**
 *
 * @author rajajawahar
 */
public abstract class Pizza {
    
    public String name;
    public String dough;
    public String sauce;
    
    
    void prepare(){
        System.out.print("Preparing " +name);
    }
      
}
