
public class CarteDebit extends CartePaiement {
	
	protected Compte compteAssocie;
	
	
	public CarteDebit(Compte compteAssocie) {
		super();
		this.compteAssocie = compteAssocie;
	}

	public boolean autorisePaiement(double montant) {
		return compteAssocie.getSolde()>=montant;

	}

}
