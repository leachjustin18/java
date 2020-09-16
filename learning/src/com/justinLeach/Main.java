package com.justinLeach;

public class Main {

    public static void main(String[] args) {
        String messageOldWay = new String("old way");
        System.out.println("Old way string " + messageOldWay);

        //Standard way of determining string
        String message = "   Standard Message  ";
        System.out.println("Standard way " + message);
        System.out.println("Ends with E " + message.endsWith("e"));
        System.out.println("Starts with E " + message.startsWith("e"));
        System.out.println("Uppercase " + message.toUpperCase());
        System.out.println("Length " + message.length());
        System.out.println("Index of " + message.indexOf("n"));
        System.out.println("Index of not found " + message.indexOf("z"));
        System.out.println("Replace " + message.replace("s", "c"));
        System.out.println("Lowercase " + message.toLowerCase());
        System.out.println("Trim " + message.trim());
    }
}
