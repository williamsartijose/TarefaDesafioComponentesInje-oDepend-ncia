package com.Desafio.ComponentesInjecaoDependencia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Desafio.ComponentesInjecaoDependencia.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;
	
	public Double total(Order order) {
		Double freteA = shippingService.shipment(order);
		Double total = order.getBasic() - order.getBasic() * (order.getDiscount() / 100) + freteA;
		return total;
	}
	
}
