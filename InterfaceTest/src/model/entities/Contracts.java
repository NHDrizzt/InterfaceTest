package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contracts {
	private Integer numContract;
	private Date dateContract;
	private Double totalValueContract;
	
	List<Installment> installment = new ArrayList<Installment>();
	
	public Contracts(Integer numContract, Date dateContract, Double totalValueContract) {
		this.numContract = numContract;
		this.dateContract = dateContract;
		this.totalValueContract = totalValueContract;
	}

	public Integer getNumContract() {
		return numContract;
	}

	public void setNumContract(Integer numContract) {
		this.numContract = numContract;
	}

	public Date getDateContract() {
		return dateContract;
	}

	public void setDateContract(Date dateContract) {
		this.dateContract = dateContract;
	}

	public Double getTotalValueContract() {
		return totalValueContract;
	}

	public void setTotalValueContract(Double totalValueContract) {
		this.totalValueContract = totalValueContract;
	}

	public List<Installment> getInstallment() {
		return installment;
	}
	
	public void addInstall(Installment installments) {
		installment.add(installments);
	}
	public void removeInstallment(Installment installments) {
		installment.remove(installments);
	}
	
	
	

}
