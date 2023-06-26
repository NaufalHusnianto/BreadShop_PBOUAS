/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breadshop_pbouas;

/**
 *
 * @author Kel 18
 */
public class BreadShop_PBOUAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PESANAN 1
        RotiManisV1 p1 = new RotiManisV1();
        p1.orderSum = 50;
        p1.sellingPrice();
        p1.neededIngredients();
        
        //PeSANAN 2
        RotiManisV2 p2 = new RotiManisV2();
        p2.orderSum = 100;
        p2.sellingPrice();
        p2.neededIngredients();
        
        //PESANAN 3
        RotiManisV3 p3 = new RotiManisV3();
        p3.orderSum = 70;
        p3.sellingPrice();
        p3.neededIngredients();
        
        //PESANAN 6
        PizzaV1 p6 = new PizzaV1();
        p6.orderSum = 10;
        p6.sellingPrice();
        p6.neededIngredients();
    }
    
}
