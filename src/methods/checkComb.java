package methods;

public class checkComb {
    public boolean royalFlush(int[] hand){
        if (hand[0] == 1 && hand[1] == 10 && hand[2] == 11 && 
        hand[3] == 12 && hand[4] == 13){

            return true;
        }
        else{
            return false;
        }
    }
	public boolean fourOfAKind(int[] hand){
		if (hand[0] != hand[3] && hand[1] != hand[4]){
			return false;
		}
		else{
			return true;
		}
	}
	
	public boolean fullHouse(int[] hand){
		int count = 0;
		for (int i = 1; i < 5; i++)
		{
			if (hand[i - 1] == hand[i])
			{
				count++;
			}
		}
		if (count == 3){
			return true;
		}
		else{
			return false;
		}
	}
	

	public boolean flush(int[] hand){
		for (int i = 1; i < 5; i++){
			if (hand[0] != hand[i]){
				return false;
			}
		}
		return true;
	}
	
	public boolean triple(int[] hand){
		if (hand[0] == hand[2] || hand[2] == hand[4]){
			return true;
		}
		return false;
	}

	public boolean twoPairs(int[] hand){
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
	

	public boolean pair(int[] hand){
		int count = 0;
		for(int i = 1; i < 5; i++){
			if (hand[i - 1] == hand[i])
			{
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
