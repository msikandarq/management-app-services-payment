package management.app.services.payment.service;

import management.app.services.payment.model.PaymentRequest;
import management.app.services.payment.model.PaymentResponse;

/**
 * @author Sikandar
 *
 */
public interface PaymentService {

	/**
	 * @param fees
	 * @return
	 */
	PaymentResponse doPayment(PaymentRequest paymentRequest);
}
