/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breadshop_pbouas;

import Interfaces.Composition;

/**
 *
 * @author Naufal Husnianto
 */
public class RotiManis_Dough extends GroceryStore implements Composition{
    //KOMPOSISI ROTI MANIS
    //Dalam satuan gram
    @Override
    public double flourComposition(){
        return 1000;
    }
    @Override
    public double sugarComposition(){
        return 150;
    }
    @Override
    public double butterComposition(){
        return 150;
    }
    @Override
    public double yeastComposition(){
        return 20;
    }
    @Override
    public double milkPowderComposition(){
        return 300;
    }
    @Override
    public double milkLiquidComposition(){
        return 250;
    }
    @Override
    public double eggComposition(){
        return 80;
    }
    @Override
    public double iceComposition(){
        return 400;
    }
    
    double flourSum(){
        return this.flourComposition() / this.flourPack * this.flourPrice;
    }
    double sugarSum(){
        return this.sugarComposition() / this.sugarPack * sugarPrice;
    }
    double butterSum(){
        return this.butterComposition() / this.butterPack * this.butterPrice;
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
    
    //Total Bberat satu adonan
    private double totalDoughPrice(){
        return flourSum() + sugarSum() + butterSum() + yeastSum() + milkPowderSum() + milkLiquidSum() + eggSum() + iceSum();
    }
    
    double totalDough_Weight(){
        return flourComposition() + sugarComposition() + butterComposition() + yeastComposition() + milkPowderComposition() + milkLiquidComposition() + eggComposition() + iceComposition();
    }
    
    //Berat Adonan per pcs dari rotiManis adalah 50gr
    double doughPcs_Price(){
        double doughPcs = totalDough_Weight()/ 50;
        return this.totalDoughPrice() / doughPcs;
    }
}
