
package breadshop_pbouas;

/**
 *
 * @author Pathan
 */
public class RotiTawarV2 extends RotiTawar_ToppingFilling{
    //attributes
    int order;

    //roti manis varian 1 membutuhkan filling 5 gram cheese dan 5 gram chocolate
     double filling(){
        return (80 * this.cheeseSum());
    }
    
    void Hargatotal(){
        double HargaProduksi = this.doughPcs_Price() + this.filling();
        double harga = 1.4 * HargaProduksi;
        System.out.println("________________________________________________________________________________");
        System.out.println("Biaya 1 pcs roti tawar varian 2 Rp." + harga);
        System.out.println("Biaya untuk " + this.order + " pcs Pesanan Roti manis varian 2 Rp." + harga*this.order);
        System.out.println("--------------------------------------------------------------------------------");
    }
    
    void ButuhBahan(){
        System.out.println("Perkiraan bahan adonan roti tawar varian 2 yang diperlukan :");
        System.out.println("Tepung terigu : " + this.needFlour * this.order + " gr");
        System.out.println("Gula : " + this.needSugar * this.order + " gr");
        System.out.println("Butter : " + this.needButter * this.order + " gr");
        System.out.println("Ragi : " + this.needYeast * this.order + " gr");
        System.out.println("Susu Bubuk : " + this.needMilkPowder * this.order + " gr");
        System.out.println("Susu Cair : " + this.needMilkLiquid * this.order + " gr");
        System.out.println("Telur : " + this.needEgg * this.order + " gr");
        System.out.println("Es Batu : " + this.needIce * this.order + " gr");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Perkiraan topping dan filling roti tawar Varian 2 yang diperlukan :");
        System.out.println("Keju : " + 80*this.order + " gr");
        System.out.println("--------------------------------------------------------------------------------");
    }
    
}
