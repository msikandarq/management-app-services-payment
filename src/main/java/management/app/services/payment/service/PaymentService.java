package management.app.services.payment.service;

import management.app.services.payment.model.PaymentRequest;
import management.app.services.payment.model.PaymentResponse;

public interface PaymentService {

	/**
	 * @param fees
	 * @return
	 */
	PaymentResponse doPayment(PaymentRequest paymentRequest);
}
