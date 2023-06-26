/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breadshop_pbouas;

import Interfaces.FillingTopping;
/**
 *
 * @author Pathan
 */
public class RotiTawar_ToppingFilling extends RotiTawar_Dough implements FillingTopping{
    
    //perkiraan harga toppingfilling TIAP GRAM
    @Override
    public double cheeseSum(){
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
    public double sausageSum(){
        return this.sausagePrice / this.sausagePack ;
    }
    @Override
    public double smokedBeef(){
        return this.smokedBeefPrice / this.smokedBeefPack;
    }
    @Override
    public double onionSum(){
        return this.onionPrice / this.onionPack;
    }
}
