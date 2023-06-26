/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breadshop_pbouas;

import Interfaces.Composition;

/**
 *
 * @author ASUS
 */
public class RotiTawar_Dough extends GroceryStore implements Composition{
    
    @Override
    public double flourComposition(){
        return 1000;
    }
    
    @Override
    public double sugarComposition(){
        return 125;
    }
    
    @Override
    public double butterComposition(){
        return 100;
    }
    
    @Override 
    public double yeastComposition(){
        return 20;
    }
    
    @Override
    public double milkPowderComposition(){
        return 250;
    }
    
    @Override
    public double milkLiquidComposition(){
        return 200;
    }
    
    @Override
    public double eggComposition(){
        return 70;
    }
    
    @Override
    public double iceComposition(){
        return 300;
    }
    
    double flourSum(){
        return this.flourComposition() / this.flourPack * this.flourPrice;
    }
    
    double sugarSum(){
        return this.sugarComposition() / this.sugarPack * this.sugarPrice;
    }
    
    double butterSum(){
        return this.butterComposition() / this.butterPack * this.sugarPrice;
    }
    
    double yeastSum(){
        return this.yeastComposition() / this.yeastPack * this.yeastPrice;
    }
    
    double milkPowderSum(){
        return this.milkPowderComposition() / this.milkPowderPack * this.milkPowderPrice;
    }
    
    double milkLiquidSum(){
        return this.milkLiquidComposition() / this.milkLiquidPack * this.milkLiquidPrice;
    }
    
    double eggSum(){
        return this.eggComposition() / this.eggPack * this.eggPrice;
    }
    
    double iceSum(){
        return this.iceComposition() / this.icePack * this.icePrice;
    }
    
    private double totalDoughPrice(){
        return flourSum() + sugarSum() + butterSum() + yeastSum() + milkPowderSum() + milkLiquidSum() + eggSum() + iceSum();
    }
    
    double totalDough_Weight(){
        return flourComposition() + sugarComposition() + butterComposition() + yeastComposition() + milkPowderComposition() + milkLiquidComposition() + eggComposition() + iceComposition();
    }
    
    double doughPcs_Price(){
        double doughPcs = totalDough_Weight() / 400;
        return this.totalDoughPrice() / doughPcs;
    }
     // Needed dough per pcs
    double needFlour = 50 / this.totalDough_Weight() * this.flourComposition();
    double needSugar = 50 / this.totalDough_Weight() * this.sugarComposition();
    double needButter = 50 / this.totalDough_Weight() * this.butterComposition();
    double needYeast = 50 / this.totalDough_Weight() * this.yeastComposition();
    double needMilkPowder = 50 / this.totalDough_Weight() * this.milkPowderComposition();
    double needMilkLiquid = 50 / this.totalDough_Weight() * this.milkLiquidComposition();
    double needEgg = 50 / this.totalDough_Weight() * this.eggComposition();
    double needIce = 50 / this.totalDough_Weight() * this.iceComposition();
    
}
