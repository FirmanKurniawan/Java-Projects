import java.util.*; 

public class Bowling {
	HashMap<String, Integer> players;
	Bowling() {
		players = new HashMap<String, Integer>();
	}
	public void addPlayer(String name, int p) {
		players.put(name, p);
	}
	//your code goes here
	public void getWinner() {
		String[] nameArr = new String[players.size()];
	   	nameArr = players.keySet().toArray(nameArr);
	   	
	   	String bestPlayer = nameArr[0];
	   	int maxVal = players.get(nameArr[0]);
	   	
		for (String player : nameArr){
			if(players.get(player) > maxVal) {
			  bestPlayer = player;
			  maxVal = players.get(player);
			}
		}
		
		System.out.println(bestPlayer);
	}
	
}

public class Program {
	public static void main(String[ ] args) {
		Bowling game = new Bowling();
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<3;i++) {
			String input = sc.nextLine();
			String[] values = input.split(" ");
			String name = values[0];
			int points = Integer.parseInt(values[1]);
			game.addPlayer(name, points);
		}
		game.getWinner();
	}
}
