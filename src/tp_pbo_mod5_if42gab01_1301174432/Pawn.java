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
public class Pawn extends ChessPieces implements Moveable, Promotable{

    @Override
    public void capture() {
        System.out.println("Pawn capture other piece");
    }

    @Override
    public void move() {
        System.out.println("Pawn moves to other square in straight forward");
    }

    @Override
    public void promote() {
        System.out.println("Pawn promotes to be other piece");
    }
    
}
