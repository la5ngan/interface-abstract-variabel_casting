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
public class Knight extends ChessPieces implements Moveable, Jumpable {
    @Override
    public void capture() {
        System.out.println("Knight captures other piece");

    }

    @Override
    public void move() {
        System.out.println("Knight moves to other square in L shape");
    }

    @Override
    public void jump() {
        System.out.println("Knight jumps accross the squares");
    }
    
}
