package com.java_8_hands_on;

@FunctionalInterface
interface ISum {
    int sum(int value1, int value2);
}


public class MethodReference {

    public static int addition(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {

        ISum isum1 = new ISum() {
            @Override
            public int sum(int value1, int value2) {
                return value1 + value2;
            }
        };
        System.out.println("Printing sum from normal code  ::: " + isum1.sum(90, 50));


        /* lambda way -> override logic of sum method
        Method reference are special kind of lambda expression
         */
        ISum isum = (int num1, int num2) -> num1 + num2;
        System.out.println("Printing sum from lambda code ::: " + isum.sum(100, 200));

        // static method reference if same method or same kind of logic already in codebase
        ISum isum2 = MethodReference::addition;
        ISum isum3 = Integer::sum;
        isum3.sum(1000, 3000);
        int sum = isum2.sum(100, 200);
        System.out.println("Printing sum from method reference code ::: " + sum);
    }
}
