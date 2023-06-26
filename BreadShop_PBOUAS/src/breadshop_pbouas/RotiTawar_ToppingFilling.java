package breadshop_pbouas;

import Interfaces.FillingTopping;
/**
 *
 * @author Pathan
 */
public class RotiTawar_ToppingFilling extends RotiTawar_Dough {
    
    //perkiraan harga toppingfilling TIAP GRAM
    public double cheeseSum(){
        return this.cheesePrice / this.cheesePack;
    }
    public double chocolateSum(){
        return this.chocolatePrice / this.chocolatePack ;
    }
    public double vanillaCreamSum(){
        return this.vanillaCreamPrice / this.vanillaCreamPack;
    }
    public double redBeanJamSum(){
        return this.redBeanJamPrice / this.redBeanJamPack;
    }
    public double sausageSum(){
        return this.sausagePrice / this.sausagePack ;
    }
    public double smokedBeef(){
        return this.smokedBeefPrice / this.smokedBeefPack;
    }
    public double onionSum(){
        return this.onionPrice / this.onionPack;
    }
}
