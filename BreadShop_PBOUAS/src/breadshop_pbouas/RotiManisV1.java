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
    
}
