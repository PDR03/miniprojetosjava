package Service;

import java.time.LocalDate;

import Entities.Contract;
import Entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		double basicVal = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
			LocalDate Date = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicVal, i);
            double fee = onlinePaymentService.paymentFee(basicVal + interest);
            double val = basicVal + interest + fee;
            contract.getInstallments().add(new Installment(Date, val));
		}
	}
}
