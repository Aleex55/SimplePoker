package methods;

public class checkComb {

	public static String checkHandComb(int[] hand){
		if (royalFlush(hand) == true) {
			return "una ESCALERA REAL!!";
		}else if (fourOfAKind(hand) == true){
			return "un CUARTETO";
		}else if (fullHouse(hand) == true){
			return "un FULL HOUSE";
		}else if(flush(hand) == true){
			return "una ESCALERA";
		}else if (triple(hand) == true){
			return "un TRIO";
		}else if (twoPairs(hand) == true){
			return "una DOBLE PAREJA";
		}else if (pair(hand) == true){
			return "una PAREJA";
		}else{
			return "NADA";
		}

	}

    public static boolean royalFlush(int[] hand){
        if (hand[0] == 1 && hand[1] == 10 && hand[2] == 11 && 
        hand[3] == 12 && hand[4] == 13){

            return true;
        }
        else{
            return false;
        }
    }
	public static boolean fourOfAKind(int[] hand){
		if (hand[0] == hand[3] && hand[1] == hand[4]){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean fullHouse(int[] hand){
		if (hand[0] == hand[1] && hand[2] == hand[4]){
			return true;
		}
		else if(hand[0] == hand[2] && hand[3] == hand[4]){
			return true;
		}
		else{
			return false;
		}
	}
	

	public static boolean flush(int[] hand){
		for (int i = 0; i < hand.length; i++){
			if (hand[0] - hand[i] > i){
				return false;
			}
		}
		return true;
	}
	
	public static boolean triple(int[] hand){
		if (hand[0] == hand[2] || hand[2] == hand[4]){
			return true;
		}
		return false;
	}

	public static boolean twoPairs(int[] hand){
		int count = 0;
		for(int i = 1; i < 5; i++){
			if (hand[i - 1] == hand[i]){
				count++;
			}
		}
		if (count == 2){
			return true;
		}
		else{
			return false;
		}
	}
	

	public static boolean pair(int[] hand){
		int count = 0;
		for(int i = 1; i < 5; i++){
			if (hand[i - 1] == hand[i]){
				count++;
			}
		}
		if (count == 1){
			return true;
		}
		else{
			return false;
		}
	}
}
