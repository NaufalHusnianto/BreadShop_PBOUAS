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
public class Pizza_Topping extends Pizza_Dough implements FillingTopping {

    private double sausageSum;
    private double smokedBeefSum;
    private double onionSum;

 @Override
    public double cheeseSum() {
        return this.cheesePrice / this.cheesePack;
    }
    
    @Override
    public double chocolateSum(){
        return this.chocolatePrice / this.chocolatePack ;
    }
    
    @Override
    public double vanillaCreamSum(){
        return this.vanillaCreamPrice / this.vanillaCreamPack;
    }
    
    @Override
    public double redBeanJamSum(){
        return this.redBeanJamPrice / this.redBeanJamPack;
    }
    
    @Override
    public double sausageSum() {
        return this.sausageSum / this.sausagePack;
    }

    @Override
    public double smokedBeef() {
        return this.smokedBeefSum / this.smokedBeefPack;
    }

    @Override
    public double onionSum() {
       return this.onionSum / this.onionPack;
    }
    
    
}
