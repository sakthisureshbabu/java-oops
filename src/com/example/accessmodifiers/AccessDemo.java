package com.example.accessmodifiers;

public class AccessDemo {
    public String publicMessage = "Public Variable";
    protected String protectedMessage = "Protected Variable";
    private String privateMessage = "Private Variable";
    String defaultMessage = "Default Variable";

    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    
    void defaultMethod() {
        System.out.println("Default Method");
    }

    public void testInsideClass() {
        System.out.println(privateMessage);
        System.out.println(protectedMessage);
        System.out.println(publicMessage);
        System.out.println(defaultMessage);

        privateMethod();
        protectedMethod();
        publicMethod();
        defaultMethod();
    }
}