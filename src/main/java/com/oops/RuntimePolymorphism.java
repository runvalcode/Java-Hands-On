package com.oops;

public class RuntimePolymorphism {

    public static void main(String[] args) {
        RuntimePolymorphism p = new RuntimePolymorphism();
        
        // convert to ascii code
        p.show('a');
        p.show(1);
        p.show('d');

        
        String s = "a" + "b" + "c";
        System.out.println(s);
    }

    public void show(int i) {
    	System.out.println(i);
        System.out.println("int");
    }
}
