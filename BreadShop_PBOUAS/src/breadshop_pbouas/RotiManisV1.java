/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breadshop_pbouas;

/**
 *
 * @author Naufal Husnianto
 */
public class RotiManisV1 extends RotiManis_ToppingFilling{
    //attributes
    int orderSum;

    //roti manis varian 1 membutuhkan filling 5 gram cheese dan 5 gram chocolate
     double filling(){
        return (5 * this.cheeseSum()) + (5 * this.chocolateSum());
    }
     double topping(){
        return 5 * this.cheeseSum();
    }
    
    double sellingPrice(){
        double rawPrice = this.doughPcs_Price() + this.filling() + this.topping();
        double profit = 0.4 * rawPrice;
        return rawPrice + profit * orderSum;
    }
    
    void neededIngredients(){
        System.out.println("PERKIRAAN ADONAN ROTIMANIS YANG DIBUTUHKAN");
        System.out.println("Tepung terigu yang diperlukan : " + this.neededFlour * this.orderSum + " gr");
        System.out.println("Gula yang diperlukan : " + this.neededSugar * this.orderSum + " gr");
        System.out.println("Butter yang diperlukan : " + this.neededButter * this.orderSum + " gr");
        System.out.println("Ragi yang diperlukan : " + this.neededYeast * this.orderSum + " gr");
        System.out.println("Susu bubuk yang diperlukan : " + this.neededMilkPowder * this.orderSum + " gr");
        System.out.println("Susu cair yang diperlukan : " + this.neededMilkLiquid * this.orderSum + " gr");
        System.out.println("Telur yang diperlukan : " + this.neededEgg * this.orderSum + " gr");
        System.out.println("Es yang diperlukan : " + this.neededIce * this.orderSum + " gr");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("PERKIRAAN TOPPING DAN FILLING ROTI MANIS YANG DIBUTUHKAN");
        System.out.println("Keju yang diperlukan : " + this.neededCheese * this.orderSum + " gr");
        System.out.println("Coklat yang diperlukan : " + this.neededChocolate * this.orderSum + " gr");
        System.out.println("Krim Vanila yang diperlukan : " + this.neededVanillaCream * this.orderSum + " gr");
        System.out.println("Selai Kacang Merah yang diperlukan : " + this.neededRedBeanJam * this.orderSum + " gr");
        System.out.println("Sosis yang diperlukan : " + this.neededSausage * this.orderSum + " gr");
        System.out.println("Smoked Beef yang diperlukan : " + this.neededSmokedBeef * this.orderSum + " gr");
        System.out.println("Bawang Bombay yang diperlukan : " + this.neededOnion * this.orderSum + " gr");
    }
    
}
