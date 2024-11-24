package Exercice2;

import java.util.Scanner;

public class Authentification {
	protected final String LoginCorrect="scott" ;
	protected final String PwdCorrect="tiger" ;
	Scanner sc = new Scanner (System.in);
	
	public String getLoginCorrect() {
		return LoginCorrect;
	}
	
	public String getPwdCorrect() {
		return PwdCorrect;
	}
	
	public Authentification () throws WrongLoginException {
		getUserLongin();
		//getUserPwd();
	}
	public void getUserLongin() throws WrongLoginException {
		System.out.println("donnez votre login");
		String Login=sc.nextLine();
		if(Login.length()>10) {
			throw new WrongLoginException ("login incorrect"); 

		}
			}
	
/*	public void getUserPwd() {
		System.out.println("donnez votre password");
		String password=sc.nextLine();
	}*/
	
	

}
