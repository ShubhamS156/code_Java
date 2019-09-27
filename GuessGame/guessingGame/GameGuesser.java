package guessingGame;
 class Player{
	public int guessedNumber;

	public void guess(){
		guessedNumber=(int)(Math.random()*10);
		System.out.println("I'm guessing "+guessedNumber);
	}
}


	 public class GameGuesser extends Player{
		Player p1;
		Player p2;
		Player p3;


	

		public void startGame(){
			p1=new Player();
			p2=new Player();
			p3=new Player();


			boolean p1isRight=false;
			boolean p2isRight=false;
			boolean p3isRight=false;

			int targetNumber=(int)(Math.random()*10);
			System.out.println("Target is "+ targetNumber);
			while(true){
			p1.guess();
			p2.guess();
			p3.guess();

			int guessOfP1=p1.guessedNumber;
			System.out.println("Player one guessed "+guessOfP1);
			int guessOfP2=p2.guessedNumber;
			System.out.println("Player two guessed "+guessOfP2);
			int guessOfP3=p3.guessedNumber;
			System.out.println("Player three guessed "+guessOfP3);

			if(guessOfP1==targetNumber){
				p1isRight=true;
			}
 			

			if(guessOfP2==targetNumber){
				p2isRight=true;
			}


			if(guessOfP3==targetNumber){
				p3isRight=true;
			}

			if(p1isRight||p2isRight||p3isRight){
				System.out.println("We've got ourselves a winner");
				System.out.println("Is it player ONE?? "+p1isRight);
				System.out.println("Is it player TWO?? "+p2isRight);
				System.out.println("Is it player THREE?? "+p3isRight);
				System.out.println("Game Over fellas!!");
				break;
			}

			else{
				System.out.println("No one got it right..Players are trying again");
			}
		}

	}
}

