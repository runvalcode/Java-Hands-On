package com.oops;

public class RuntimePolymorphism {

    public static void main(String[] args) {
        RuntimePolymorphism p = new RuntimePolymorphism();
        p.show('a');
        p.show(1);

        String s = "a" + "b" + "c";
        System.out.println(s);
    }

    public void show(int i) {
        System.out.println("int");
    }
}
