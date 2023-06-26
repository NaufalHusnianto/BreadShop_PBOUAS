/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breadshop_pbouas;
        
        
public class PizzaV1 extends Pizza_Topping {
    //attributes
    int orderSum;
    
    double filling(){
        return 0;
    }
    
    double topping(){
        return (30 * this.cheeseSum()) + (50 * this.sausageSum()) + (50 * this.smokedBeef()) + (30 * this.onionSum());
    }
    
    void sellingPrice(){
        double rawPrice = this.doughPcs_Price() + this.filling() + this.topping();
        double profit = 0.4 * rawPrice;
        double pcsPrice = rawPrice + profit;
        System.out.println("________________________________________________________________________________");
        System.out.println("Biaya 1 pcs pizza varian 1 Rp." + pcsPrice);
        System.out.println("Biaya untuk " + this.orderSum + " pcs Pesanan pizza varian 1 Rp." + pcsPrice*this.orderSum);
        System.out.println("--------------------------------------------------------------------------------");
    }
    
    void neededIngredients(){
        System.out.println("Perkiraan bahan adonan pizza varian 1 yang diperlukan :");
        System.out.println("Tepung terigu : " + this.neededFlour * this.orderSum + " gr");
        System.out.println("Gula : " + this.neededSugar * this.orderSum + " gr");
        System.out.println("Butter : " + this.neededButter * this.orderSum + " gr");
        System.out.println("Ragi : " + this.neededYeast * this.orderSum + " gr");
        System.out.println("Susu Bubuk : " + this.neededMilkPowder * this.orderSum + " gr");
        System.out.println("Susu Cair : " + this.neededMilkLiquid * this.orderSum + " gr");
        System.out.println("Telur : " + this.neededEgg * this.orderSum + " gr");
        System.out.println("Es Batu : " + this.neededIce * this.orderSum + " gr");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Perkiraan topping dan filling pizza Varian 1 yang diperlukan :");
        System.out.println("Keju : " + 30*this.orderSum + " gr");
        System.out.println("Sosis : " + 50*this.orderSum + " gr");
        System.out.println("Smoked Beef : " + 50*this.orderSum + " gr");
        System.out.println("Bawang Bombay : " + 30*this.orderSum + " gr");
        System.out.println("--------------------------------------------------------------------------------");
    }
    
}