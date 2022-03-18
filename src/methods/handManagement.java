package methods;

import java.util.ArrayList;
import java.util.Scanner;

public class handManagement {
    public static Scanner kb = new Scanner(System.in);

    public static void startHand(int[][] hand){
        for (int i = 0; i < hand.length; i++) {
            for (int j = 0; j < hand[i].length; j++) {
                hand[i][j] = 0;
            }
        }
    }
    public static void fillDeck (ArrayList<Integer> deck){
        for (int i = 1; i <= 52; i++) {
            deck.add(i);
        }
    }
    public void handSort(int[][] hand, int player) {
        int aux = 0;

        for (int i = 0; i < (hand[player].length - 1); i++) {
            for (int j = 0; j < ((hand[player].length - i) - 1); j++) {
                if (hand[player][j] > hand[player][j+1]) {
                    aux = hand[player][j];
                    hand[player][j] = hand[player][j+1];
                    hand[player][j+1] = aux;
                }
            }
        }
    }
    public static void showHand (int[][] hand, int player){
        System.out.println();
        System.out.println("     1          2            3           4           5    ");
        System.out.println(" _________   _________   _________   _________   _________");

        for (int i = 0; i < hand[player].length; i++) {
            System.out.print("| " + getCardNumber(hand[player][i]) + "      | ");
        }
        System.out.println();
        System.out.println("|         | |         | |         | |         | |         |");
        for (int i = 0; i < hand[player].length; i++) {
            System.out.print("|    "+  getCardSymbol(hand[player][i]) +"    | ");
        }
        System.out.println();
        System.out.println("|         | |         | |         | |         | |         |");
        System.out.println();
    }
    public static String getCardNumber(int card){
        String carta = "0";
        switch (card) {
            case 13, 26, 39, 52:
                carta = "K ";
                break;
            case 12, 25, 38, 51:
                carta = "Q ";
                break;
            case 11, 24, 37, 50:
                carta = "J ";
                break;
            case 10, 23, 36, 49:
                carta = "10";
                break;
            case 9, 22, 35, 48:
                carta = "9 ";
                break;
            case 8, 21, 34, 47:
                carta = "8 ";
                break;
            case 7, 20, 33, 46:
                carta = "7 ";
                break;
            case 6, 19, 32, 45:
                carta = "6 ";
                break;
            case 5, 18, 31, 44:
                carta = "5 ";
                break;
            case 4, 17, 30, 43:
                carta = "4 ";
                break;
            case 3, 16, 29, 42:
                carta = "3 ";
                break;
            case 2, 15, 28, 41:
                carta = "2 ";
                break;
            case 1, 14, 27, 40:
                carta = "A ";
                break;
            default:
                carta = "0 ";
                break;
          }
        return carta;
    }
    public static void translateHand(int[][] hand, int player){


        for (int i = 0; i < hand.length; i++) {
        
            switch (hand[player][i]) {
                case 13, 26, 39, 52:
                    hand[player][i] = 13;
                    break;
                case 12, 25, 38, 51:
                    hand[player][i] = 12;
                    break;
                case 11, 24, 37, 50:
                    hand[player][i] = 11;
                    break;
                case 10, 23, 36, 49:
                    hand[player][i] = 10;
                    break;
                case 9, 22, 35, 48:
                    hand[player][i] = 9;
                    break;
                case 8, 21, 34, 47:
                    hand[player][i] = 8;
                    break;
                case 7, 20, 33, 46:
                    hand[player][i] = 7;
                    break;
                case 6, 19, 32, 45:
                    hand[player][i] = 6;
                    break;
                case 5, 18, 31, 44:
                    hand[player][i] = 5;
                    break;
                case 4, 17, 30, 43:
                    hand[player][i] = 4;
                    break;
                case 3, 16, 29, 42:
                    hand[player][i] = 3;
                    break;
                case 2, 15, 28, 41:
                    hand[player][i] = 2;
                    break;
                case 1, 14, 27, 40:
                    hand[player][i] = 1;
                    break;
                default:
                    hand[player][i] = 0;
                    break;
            }
        }
    }
    public static char getCardSymbol(int card){
        char simbolo = '0';

        if (card <= 13){
            simbolo = '♥';
        }else if (card <= 26){
            simbolo = '♠';
        }else if (card <= 39){
            simbolo = '♦';
        }else {
            simbolo = '♣';
        }

        return simbolo;
    }
    public static void getHand(ArrayList<Integer> deck, int[][] hand, int player){
        int card = 0;

        for (int i = 0; i < hand[player].length; i++) {
            card = (int)(Math.random() * (deck.size()));

            hand[player][i] = deck.get(card);

            deck.remove(card);
        }
    }
    public static void changeHand(ArrayList<Integer> deck, int[][] hand, int player){
        int change = 0;
        int card = 0;

        do {
            System.out.println("Que carta quieres cambiar? (0 o numero no valido si no cambias ninguna mas)");
            change = kb.nextInt();

            if (change > 0 && change <= 5) {
                card = (int)(Math.random() * (deck.size()));

                hand[player][(change - 1)] = deck.get(card);
    
                deck.remove(card);
            }
        }while(change > 0 && change <= 5);


    }
}
