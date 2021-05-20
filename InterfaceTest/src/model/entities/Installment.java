package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.services.Service;

public class Installment {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dateInstallment;
	private Double numInstallment;
	
	private Service feeService;

	public Installment(Date dateInstallment, Double numInstallment) {
		this.dateInstallment = dateInstallment;
		this.numInstallment = numInstallment;
	}

	public Date getDateInstallment() {
		return dateInstallment;
	}

	public void setDateInstallment(Date dateInstallment) {
		this.dateInstallment = dateInstallment;
	}

	public Double getNumInstallment() {
		return numInstallment;
	}

	public void setNumInstallment(Double numInstallment) {
		this.numInstallment = numInstallment;
	}

	@Override
	public String toString() {
		return sdf.format(dateInstallment)+ " - " + String.format("%.2f", numInstallment);
	}
	
	
	
}
