/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breadshop_pbouas;

/**
 *
 * @author Naufal Husnianto
 */
public class RotiManisV3 extends RotiManis_ToppingFilling{
    //attributes
    int orderSum;

    //roti manis varian 1 membutuhkan filling 5 gram cheese dan 5 gram chocolate
     double filling(){
        return (10 * this.cheeseSum()) + (10 * this.sausageSum());
    }
     double topping(){
        return 0;
    }
    
    void sellingPrice(){
        double rawPrice = this.doughPcs_Price() + this.filling() + this.topping();
        double profit = 0.4 * rawPrice;
        double pcsPrice = rawPrice + profit;
        System.out.println("________________________________________________________________________________");
        System.out.println("Biaya 1 pcs roti manis varian 3 Rp." + pcsPrice);
        System.out.println("Biaya untuk " + this.orderSum + " pcs Pesanan Roti manis varian 1 Rp." + pcsPrice*this.orderSum);
        System.out.println("--------------------------------------------------------------------------------");
    }
    
    void neededIngredients(){
        System.out.println("Perkiraan bahan adonan roti manis varian 3 yang diperlukan :");
        System.out.println("Tepung terigu : " + this.neededFlour * this.orderSum + " gr");
        System.out.println("Gula : " + this.neededSugar * this.orderSum + " gr");
        System.out.println("Butter : " + this.neededButter * this.orderSum + " gr");
        System.out.println("Ragi : " + this.neededYeast * this.orderSum + " gr");
        System.out.println("Susu bubuk : " + this.neededMilkPowder * this.orderSum + " gr");
        System.out.println("Susu cair : " + this.neededMilkLiquid * this.orderSum + " gr");
        System.out.println("Telur : " + this.neededEgg * this.orderSum + " gr");
        System.out.println("Es Batu : " + this.neededIce * this.orderSum + " gr");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Perkiraan topping dan filling roti manis Varian 3 yang diperlukan :");
        System.out.println("Keju : " + 10*this.orderSum + " gr");
        System.out.println("sosis : " + 10*this.orderSum + " gr");
        System.out.println("--------------------------------------------------------------------------------");
    }
    
}
