package model.services;

public class Outsourced implements Service{
	
	private static final double fee = 0.02;
	private static final double month = 0.01;
	
	@Override
	public double calculateFee(double valueContract, int numInstallments) {
		return valueContract + (valueContract * month * numInstallments) + (valueContract * fee);
	}
}
