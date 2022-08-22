package management.app.services.payment.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import management.app.services.payment.model.PaymentRequest;
import management.app.services.payment.model.PaymentResponse;
import management.app.services.payment.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public PaymentResponse doPayment(PaymentRequest paymentRequest) {
		PaymentResponse paymentResponse = new PaymentResponse();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm");
        String formatDateTime = now.format(formatter);
        
		paymentResponse.setTransactionReference("TRAN-" + RandomStringUtils.randomAlphanumeric(9).toUpperCase());
		paymentResponse.setTimestamp(formatDateTime);
		return paymentResponse;
	}
}
