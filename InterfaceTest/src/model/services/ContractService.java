package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contracts;
import model.entities.Installment;

public class ContractService {

	private Service outsourceService;

	public ContractService(Service outsourceService) {
		this.outsourceService = outsourceService;
	}

	public void processContract(Contracts contract, int months) {
		double valueInstallment = contract.getTotalValueContract() / months;
		for(int i=1; i<=months;i++) {
			Date date = addMonths(contract.getDateContract(), i);
			double totalInstall = outsourceService.calculateFee(valueInstallment, i);
			System.out.println(totalInstall);
			contract.addInstall(new Installment(date, totalInstall));
		}
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
	
	
}
