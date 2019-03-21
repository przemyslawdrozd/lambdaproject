package com.company;

public class Main {

    public static void main(String[] args) {

        methodMain("1", "2", "3", new MyInterface() {
            @Override
            public boolean go(String s1, String s2, String s3) {
                return false;
            }
        });

        methodMain("1", "2", "3", (s1, s2, s3) -> false);

        MyInterface myInterface = (s1, s2, s3) -> false;
        methodMain("1", "2", "3", myInterface);

        methodMain("1", "2", "3");

    }

    private static void methodMain(String s1, String s2, String s3, MyInterface myInterface){
        System.out.println(myInterface.go(s1, s2, s3));
    }

    private static void methodMain(String s1, String s2, String s3){
        System.out.println(s3 + " " + s2 + " " + s1);
    }

}

interface MyInterface{
    boolean go(String s1, String s2, String s3);
}