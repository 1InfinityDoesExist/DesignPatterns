package com.design.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Notify some listener/observer
 * 
 * @author mossad
 *
 */
public class PaymentManager {

	private final List<PaymentListener> paymentListeners = new ArrayList<>();

	public void pay() {

		// do something
		paymentListeners.forEach(PaymentListener::paymentMade);

	}

	public void registerPaymentListener(PaymentListener p) {
		paymentListeners.add(p);
	}

	public void unregisterPaymentListener(PaymentListener p) {
		paymentListeners.remove(p);
	}

}
