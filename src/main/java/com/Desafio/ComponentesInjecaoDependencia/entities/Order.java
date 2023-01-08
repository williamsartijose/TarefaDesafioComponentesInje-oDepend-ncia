package com.Desafio.ComponentesInjecaoDependencia.entities;

public class Order {
	
	public Integer code;
	public Double basic;
	public Double discount;
	
	public Order() {
		
	}
	
	public Order(Integer code, Double basic, Double discount) {
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	} 
	
	
	
	
	

}
