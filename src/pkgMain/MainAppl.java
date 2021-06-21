package pkgMain;

import pkgData.Player;

public class MainAppl {
	public static void main(String[] args) {
		
		Player player=new Player(2,"Dragovic","Defence");
		System.out.println("=="+player);

		player=new Player(4,"Hinteregger","Defence");
		System.out.println("=="+player);
		player=new Player(5,"player 5","Goal");
		System.out.println("=="+player);
		System.out.println("TEST");
	}
}
