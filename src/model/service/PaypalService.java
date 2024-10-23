package model.service;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {
		return amount * 0.02;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		double juros = 0.0;
		
		for(int i = 1; i <= months; i++) {
			juros += months * 0.01;
		}
		
		return juros;
	}

}
