package Exercice2;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			new Authentification();
			
		}catch (WrongLoginException e) {
			System.out.println(e.getMessage());
		}

	}

}
