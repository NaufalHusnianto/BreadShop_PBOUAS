/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breadshop_pbouas;

import Interfaces.FillingTopping;
        
        
public abstract class PizzaV1 extends Pizza_Topping {
    
    double topping(){
        return (30 * this.cheeseSum()) + (50 * this.sausageSum()) + (50 * this.smokedBeef()) + (50 * this.onionSum());
       
    }
    
}