package management.app.services.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import management.app.services.payment.model.PaymentRequest;
import management.app.services.payment.model.PaymentResponse;
import management.app.services.payment.service.PaymentService;

/**
 * @author Sikandar
 *
 */
@RestController
@RequestMapping("/v1")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/pay")
	public ResponseEntity<PaymentResponse> doPayment(@RequestBody PaymentRequest payment) {
		PaymentResponse paymentResponse = paymentService.doPayment(payment);
		return new ResponseEntity<>(paymentResponse, HttpStatus.CREATED);
	}
}
