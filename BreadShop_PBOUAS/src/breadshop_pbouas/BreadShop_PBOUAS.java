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
        System.out.println("________________________________________________________________________________");
        System.out.println("PESANAN 1 <Roti Manis Varian 1 50 pcs>");
        RotiManisV1 p1 = new RotiManisV1();
        p1.orderSum = 50;
        p1.sellingPrice();
        p1.neededIngredients();
        
        //PeSANAN 2
        System.out.println("________________________________________________________________________________");
        System.out.println("PESANAN 2 <Roti Manis Varian 2 100 pcs>");
        RotiManisV2 p2 = new RotiManisV2();
        p2.orderSum = 100;
        p2.sellingPrice();
        p2.neededIngredients();
        
        //PESANAN 3
        System.out.println("________________________________________________________________________________");
        System.out.println("PESANAN 3 <Roti Manis Varian 3 70 pcs>");
        RotiManisV3 p3 = new RotiManisV3();
        p3.orderSum = 70;
        p3.sellingPrice();
        p3.neededIngredients();
        
        //PESANAN 4
        System.out.println("________________________________________________________________________________");
        System.out.println("PESANAN 4 <Roti Tawar Varian 1 20 pcs>");
        RotiTawarV1 p4 = new RotiTawarV1();
        p4.order = 20;
        p4.Hargatotal();
        p4.ButuhBahan();
        
        //PESANAN 5
        System.out.println("________________________________________________________________________________");
        System.out.println("PESANAN 5 <Roti Tawar Varian 2 15 pcs>");
        RotiTawarV2 p5 = new RotiTawarV2();
        p5.order = 15;
        p5.Hargatotal();
        p5.ButuhBahan();
        
        //PESANAN 6
        System.out.println("________________________________________________________________________________");
        System.out.println("PESANAN 6 <Pizza Varian 1 10 pcs>");
        PizzaV1 p6 = new PizzaV1();
        p6.orderSum = 10;
        p6.sellingPrice();
        p6.neededIngredients();
    }
    
}
