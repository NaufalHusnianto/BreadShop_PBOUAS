/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breadshop_pbouas;

import Interfaces.FillingTopping; 

/**
 *
 * @author LENOVO
 */
public abstract class Pizza_Topping extends Pizza_Dough implements FillingTopping {

    private double sausageSum;
    private double smokedBeef;
    private double onionSum;

 @Override
    public double cheeseSum() {
        return this.cheesePrice / this.cheesePack;
    }

    @Override
    public double sausageSum() {
        return this.sausageSum / this.sausagePack;
    }

    @Override
    public double smokedBeef() {
        return this.smokedBeef / this.smokedBeefPack;
    }

    @Override
    public double onionSum() {
       return this.onionSum / this.onionPack;
    }
    
    
}
