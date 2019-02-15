
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarteCredit cc = new CarteCredit(3000,700);
		System.out.println(cc.autorisePaiement(300));
		cc.payeAchat(300);
		
		Compte compte = new Compte(8000);
		CarteDebit cd = new CarteDebit(compte);
		System.out.println(cd.autorisePaiement(1000));
		
	}

}
