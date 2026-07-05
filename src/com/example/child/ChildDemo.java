package com.example.child;

import com.example.accessmodifiers.AccessDemo;

public class ChildDemo extends AccessDemo {
    public void testAccess() {
        System.out.println(publicMessage); // Accessible
        System.out.println(protectedMessage); // Accessible - ChildDemo is a subclass of AccessDemo

        // System.out.println(privateMessage); // Not accessible
        // System.out.println(defaultMessage); // Not accessible - default is package-private

        publicMethod(); // Accessible
        protectedMethod(); // Accessible - ChildDemo is a subclass of AccessDemo
        
        // privateMethod(); // Not accessible
        // defaultMethod(); // Not accessible - default is package-private
    }

    public static void main(String[] args) {
        ChildDemo child = new ChildDemo();
        child.testAccess();
    }
}