/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_pbo_mod5_if42gab01_1301174432;

/**
 *
 * @author evana
 */
public class TP_PBO_MOD5_IF42GAB01_1301174432 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //membuat masing-masing objek
        Queen ratu = new Queen();
        Knight kuda = new Knight();
        Pawn pion = new Pawn();
        Player pemain = new Player();
        
        //memanggil method
        ratu.capture();
        ratu.capture();
        ratu.move();
        kuda.capture();
        kuda.move();
        kuda.jump();
        pion.capture();
        pion.move();
        pion.promote();
        pemain.move();
        
        
    }
        
}
    

