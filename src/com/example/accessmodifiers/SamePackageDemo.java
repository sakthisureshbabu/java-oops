package com.example.accessmodifiers;

public class SamePackageDemo {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        // System.out.println(obj.privateMessage); // Not Accessible

        System.out.println(obj.publicMessage); // Accessible
        System.out.println(obj.protectedMessage); // Accessible
        System.out.println(obj.defaultMessage); // Accessible
    
        // obj.privateMethod(); // Not Accessible
        obj.publicMethod(); // Accessible
        obj.protectedMethod(); // Accessible
        obj.defaultMethod(); // Accessible
    }
}