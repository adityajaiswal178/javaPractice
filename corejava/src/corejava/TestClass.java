package corejava;

public class TestClass {

	public static void displayHighScorePosition(String Name,int position){
		System.out.println(Name+" managed to get into "+position+ " on the high score table");
	}
	public static int calculateHighScorePosition(int score){
		if(score>=1000){
			return 1;
		}else if(score >=500 && score < 1000){
			return 2;
		}else if(score>=100 && score < 500){
			return 3;
		}else{
			return 4;
		}



	}
	public static void main(String[] args) {

		int position1 = calculateHighScorePosition(1500);
		displayHighScorePosition("Rahul",position1);

		int position2 = calculateHighScorePosition(900);
		displayHighScorePosition("Dhole",position2);
		int position3 = calculateHighScorePosition(400);
		displayHighScorePosition("munde",position3);
		int position4 = calculateHighScorePosition(50);
		displayHighScorePosition("Katni",position4);

	}

}


