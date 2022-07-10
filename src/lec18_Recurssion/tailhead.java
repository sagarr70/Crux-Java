package lec18_Recurssion;

public class tailhead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins = 5;
		toss(coins, "");

	}

	private static void toss(int coins, String ans) {

		if (coins == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ' ';
		if (ans != "") {
			ch = ans.charAt(ans.length() - 1);
		}
		toss(coins - 1, ans + "T");
		if (ch != 'H') {
			toss(coins - 1, ans + "H");
		}
	}

}
