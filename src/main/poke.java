package main;

// si no muestra los simbolos en consola pon chcp 65001
import java.util.ArrayList;
import methods.handManagement;
import methods.checkComb;

public class poke {
    public static void main(String[] args) {
        ArrayList<Integer> deck = new ArrayList<Integer>();

        int [][] mano = new int [2][5];

        handManagement.startHand(mano);

        handManagement.fillDeck(deck);

        for (int i = 0; i < 2; i++) {
            System.out.println("Turno del jugador " + (i+1));

            handManagement.getHand(deck, mano, i);

            handManagement.showHand(mano, i);

            System.out.println();
            
            handManagement.changeHand(deck, mano, i);

            handManagement.showHand(mano, i);

        }

        System.out.println();
        System.out.println("Mano del jugador 1:\n");

        handManagement.showHand(mano, 0);
        handManagement.translateHand(mano, 0);

        System.out.println("\nEl jugador 1 tiene " + checkComb.checkHandComb(mano[0]));

        System.out.println("\n");
        System.out.println("Mano del jugador 2:\n");

        handManagement.showHand(mano, 1);
        handManagement.translateHand(mano, 1);

        System.out.println("\nEl jugador 2 tiene " + checkComb.checkHandComb(mano[1]));

        
    }
}
