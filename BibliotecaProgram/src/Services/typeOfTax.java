package Services;

import java.time.Duration;

public class typeOfTax implements Tax {
	private Double Tax;
	
	
	public Double getTax() {
		return Tax;
	}

	public void setTax(Double tax) {
		Tax = tax;
	}
	
	public void tax(Aluguel aluguel) {
		double Days = Duration.between(aluguel.getRetirada(), aluguel.getRetorno()).toDays();
		if(Days > 3) {
			setTax(Days * 2.50);
		}
	}
	
}
