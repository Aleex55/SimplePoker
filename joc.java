package Joc;

    import java.io.IOException;
    import java.util.Scanner;
    
public class joc {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
    int score1 = 0,score2 = 0;
    for(int i=0; i<10; i++){
    int[][] previous_cards = new int[0][2];
    int[][] hand1 = generate_hand(previous_cards);
    int[][] sorted1 = sort_hand(hand1);
    System.out.println("Round "+(i+1)+": ");
    System.out.print(" Your hand: ");
    print_hand(sorted1);
    int identify_hand1 = identify_hand(sorted1);
    System.out.print(" ");
    print_identify_hand(identify_hand1);
    System.out.println();
    int[][] hand2 = generate_hand(hand1);
    int[][] sorted2 = sort_hand(hand2);
    System.out.print(" Computer hand: ");
    print_hand(sorted2);
    int identify_hand2 = identify_hand(sorted2);
    System.out.print(" ");
    print_identify_hand(identify_hand2);
    System.out.println();
    int compared = compare_hands(sorted1,sorted2);
    if(compared==-1)
    System.out.println(" You win this round!");
    else if(compared==1)
    System.out.println(" The computer wins this round!");
    else System.out.println("Draw!");
    score1 += (compared<0)?1:0;
    score2 += (compared>0)?1:0;
    System.out.println(" Score: You:"+score1+" - Computer:"+score2);
    input.nextLine();
    }
    if(score1<score2)
    System.out.println("The computer won with: "+score2+"-"+score1+".");
    else if(score1==score2)
    System.out.println("Draw: "+score1+"-"+score2+".");
    else System.out.println("You won with: "+score1+"-"+score2+".");
    }
    public static int[][] generate_hand(int[][] previous_cards){
    int[][] hand = new int[5][2];
    return hand;
    }
    public static int[] generate_card(){
    int[] card = new int[2];
    card[0] = (int) (Math.random()*13 + 2);
    card[1] = (int) (Math.random()*4 + 1);
    return card;
    }
    public static int compare_2_cards(int[] card1, int[] card2){
    return 0;
    }
    public static void print_hand(int[][] hand){
    System.out.print(card_to_String(hand[0])+", ");
    System.out.print(card_to_String(hand[1])+", ");
    System.out.print(card_to_String(hand[2])+", ");
    System.out.print(card_to_String(hand[3])+", ");
    System.out.print(card_to_String(hand[4]));
    }
    public static String card_to_String(int[] c){
    String card = "";
    if(2<=c[0] && c[0]<=10)
    card += c[0];
    else if(c[0]==11) card += "Jack";
    else if(c[0]==12) card += "Queen";
    else if(c[0]==13) card += "king";
    else card += "Ace";
    card += " of ";
    if(c[1]==1) card += "hearts";
    else if(c[1]==2) card += "diamonds";
    else if(c[1]==2) card += "clubs";
    else card += "spades";
    return card;
    }
    public static int[][] sort_hand(int[][] hand) {
        int[][] sorted = new int[5][2];
        for(int i=0;i<5;i++){
            int[] cardRnd = generate_card();
            sorted[i][0]= cardRnd[0];
            sorted[i][1]= cardRnd[1];
        }
        return sorted;
    }
    public static void print_identify_hand(int identify_hand){
    if(identify_hand==1)
    System.out.print("(straight flush)");
    else if(identify_hand==2)
    System.out.print("(four of a kind)");
    else if(identify_hand==3)
    System.out.print("(full house)");
    else if(identify_hand==3)
    System.out.print("(four of a kind)");
    else if(identify_hand==4)
    System.out.print("(flush)");
    else if(identify_hand==5)
    System.out.print("(straight)");
    else if(identify_hand==6)
    System.out.print("(three of a kind)");
    else if(identify_hand==7)
    System.out.print("(two pairs)");
    else if(identify_hand==8)
    System.out.print("(one pair)");
    else
    System.out.print("(nothing - high hand comparison)");
    }
    public static int compare_hands(int[][] hand1,int[][] hand2){
    // IMPLEMENT: compare 2 cards
    return 1;
    }
    public static int identify_hand(int[][] hand){
    if(hand[0][1]==hand[1][1] && hand[1][1]==hand[2][1] && hand[2][1]==hand[3][1] && hand[3][1]==hand[4][1] && // compare that they have the same suit
    hand[0][0]+1==hand[1][0] && hand[1][0]+1==hand[2][0] && hand[2][0]+1==hand[3][0] && hand[3][0]+1==hand[4][0]) // compare card numbers
    return 1;
    if(hand[0][0]==hand[1][0] && hand[1][0]==hand[2][0] && hand[2][0]==hand[3][0]) // compare card numbers
    return 2;
    if(hand[1][0]==hand[2][0] && hand[2][0]==hand[3][0] && hand[3][0]==hand[4][0]) // compare card numbers
    return 2;
    return 9;
    }
}
