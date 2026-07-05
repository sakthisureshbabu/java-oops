package com.example.others;

import com.example.accessmodifiers.AccessDemo;

public class OtherPackageDemo {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();

        System.out.println(demo.publicMessage); // Accessible
        // System.out.println(demo.protectedMessage); // Not Accessible - protected is not accessible outside the package unless it's a subclass
        // System.out.println(demo.defaultMessage); // Not Accessible - default is package-private
        // System.out.println(demo.privateMessage); // Not Accessible - private is not accessible outside

        demo.publicMethod(); // Accessible
        // demo.protectedMethod(); // Not Accessible - protected is not accessible outside the package unless it's a subclass
        // demo.defaultMethod(); // Not Accessible - default is package-private
        // demo.privateMethod(); // Not Accessible - private is not accessible outside
    }
}