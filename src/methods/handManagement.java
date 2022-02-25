package methods;

public class handManagement {
    public void handSort(int[] hand) {
        int aux = 0;

        for (int i = 0; i < (hand.length - 1); i++) {
            for (int j = 0; j < ((hand.length - i) - 1); j++) {
                if (hand[j] > hand[j+1]) {
                    aux = hand[j];
                    hand[j] = hand[j+1];
                    hand[j+1] = aux;
                }
            }
        }
    }
    public void showHand (int[] hand){
        
    }
}
