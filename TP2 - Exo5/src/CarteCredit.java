
public class CarteCredit extends CartePaiement{
	
	protected double plafond;
	protected double encours;
	
	
	public CarteCredit(double plafond, double encours) {
		super();
		this.plafond = plafond;
		this.encours = encours;
	}

	public boolean autorisePaiement(double montant) {
		return(encours+montant)<=plafond;
	}

}
