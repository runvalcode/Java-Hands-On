package com.java_8_hands_on;

/*
 * Java 8 introduced:
 * 1. Default methods
 * 2. Static methods
 * inside interfaces.
 *
 * Before Java 8:
 * Interfaces could only contain abstract methods.
 *
 * Problem:
 * If we add a new method inside an existing interface,
 * then all implementing classes must implement that method,
 * otherwise compilation will fail.
 *
 * Solution:
 * Java 8 introduced DEFAULT METHODS for backward compatibility.
 */

interface Payments {

    /*
     * Abstract method
     * Every implementing class MUST provide implementation.
     */
    String paymentName();

    /*
     * DEFAULT METHOD
     * -----------------------------
     * Why default method?
     *
     * Suppose this interface is already implemented
     * by 100 classes in a production application.
     *
     * Now company wants to add a new feature.
     *
     * If we add a normal abstract method,
     * then all 100 classes must implement it.
     *
     * To avoid breaking existing code,
     * Java 8 introduced default methods.
     *
     * Benefits:
     * - Backward compatibility
     * - Optional implementation
     * - Common reusable logic
     *
     * Any implementing class can:
     * 1. Use this default implementation directly
     * 2. Override it with custom logic
     */
    default void paymentServiceLogic() {
        System.out.println("Default Payment is Cash");
    }

    /*
     * STATIC METHOD
     * -----------------------------
     * Why static method in interface?
     *
     * If some utility/helper functionality belongs
     * to the interface itself and should NOT be overridden,
     * then make it static.
     *
     * Benefits:
     * - Utility/helper methods
     * - Common logic shared by all classes
     * - Prevent overriding
     *
     * Static methods are called using:
     * InterfaceName.methodName()
     *
     * They are NOT inherited by implementing classes.
     */
    static void trackPayment() {
        System.out.println("I'll track payment via moneybox");
    }
}

/*
 * GooglePay implementation
 */
class GooglePay implements Payments {

    /*
     * Mandatory implementation
     * because paymentName() is abstract.
     */
    @Override
    public String paymentName() {
        return "Google-Pay";
    }

    /*
     * Overriding default method
     * with custom business logic.
     */
    @Override
    public void paymentServiceLogic() {
        System.out.println("Google-Pay will implement its own Payment Gateway");
    }
}

/*
 * PhonePay implementation
 */
class PhonePay implements Payments {

    @Override
    public String paymentName() {
        return "Phone-Pay";
    }

    /*
     * Overriding default method
     * with its own implementation.
     */
    @Override
    public void paymentServiceLogic() {
        System.out.println("Phone-Pay will implement its own Payment Gateway");
    }
}

public class Interface_Default_and_Static_Methods_Implementation {

    public static void main(String[] args) {

        /*
         * Runtime polymorphism:
         * Parent interface reference
         * holding child object.
         */
        Payments googlePayPayment = new GooglePay();

        System.out.println(googlePayPayment.paymentName());

        // Calls overridden method
        googlePayPayment.paymentServiceLogic();


        Payments phonePayPayment = new PhonePay();

        System.out.println(phonePayPayment.paymentName());

        // Calls overridden method
        phonePayPayment.paymentServiceLogic();


        /*
         * Calling STATIC METHOD
         * using interface name.
         *
         * Correct way:
         * Payments.trackPayment();
         *
         * Wrong way:
         * googlePayPayment.trackPayment(); ❌
         */
        Payments.trackPayment();
    }
}