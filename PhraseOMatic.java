public class PhraseOMatic{
	public static void main(String[] args) {
		
		String[] worldListOne={"rotten","earthy","agreeable","parched","cellar","matter","bucket","white","ordinary","balance","boundary","instinctive"};
		String[] worldListTwo={"rustic","beautiful","challenge","trip","drink","knotty","birds","exchange","mean","befitting","jail","cooing"};
		String[] worldListThree={"level","man","seemly","thumb","neat","curvy","carpenter","foot","slap"};

		int oneLength=worldListOne.length;
		int twoLength=worldListTwo.length;
		int threeLength=worldListThree.length;

		int rand1=(int) (Math.random()*oneLength);
		int rand2=(int) (Math.random()*twoLength);
		int rand3=(int) (Math.random()*threeLength);

		System.out.println(Math.random());

		System.out.println(worldListOne[rand1]+" "+worldListTwo[rand2]+" "+worldListThree[rand3]);

	}
}