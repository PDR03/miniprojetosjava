package Services;

public class BrasilTaxService implements TaxService {

	public Double tax(Double amount) {
		if(amount <= 100.00) {
			return amount * 0.2;
		}else {
		
		return amount * 0.15;
		}
	}
}
