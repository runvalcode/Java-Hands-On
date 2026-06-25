package com.java17;

sealed interface Payment permits GooglePay,PhonePay {
	void modeOfPayment();
}

record GooglePay() implements Payment{

	@Override
	public void modeOfPayment() {
		System.out.println("Google Pay - Payment Process Implementation....");
	}}

non-sealed class PhonePay implements Payment{

	@Override
	public void modeOfPayment() {
		System.out.println("Phone Pay - Payment Process Implementation....");
	}
	
}

// not allowed becuase PayTmPaymentBank class has not permit to implement Payment interface.
final class PayTmPaymentBank{

	
	public void modeOfPayment() {
	}
	
}

public class SealedClassAndInterface {
	public static void main(String[] args) {
		// create object using interface and classes
	}

}
