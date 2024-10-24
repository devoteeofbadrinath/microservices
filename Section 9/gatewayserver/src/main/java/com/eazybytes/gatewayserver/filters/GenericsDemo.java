package com.eazybytes.gatewayserver.filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface A {
    default void sayHello(){
        System.out.println("A says Narayan Narayan Hari Hari");
    }
}

interface B{
    default void sayHello(){
        System.out.println("B says Narayan Narayan Hari Hari");
    }

    static void sayHelloStatic(){
        System.out.println("Default B says Narayan Narayan Hari Hari");
    }
}

public class GenericsDemo implements A,B {

    public static void main(String[] args) {
        System.out.println("Narayan Narayan Hari Hari");

        /*List values = new ArrayList();
        values.add(7);
        values.add("Shivam");
        values.add(4);
        int[] valuesArrray = {1,2,3,4};

        System.out.println(values.toArray() +"    "+ Arrays.toString(valuesArrray) + " " + Arrays.toString(values.toArray()));
        System.out.println(values.toArray().length);*/

        GenericsDemo gd = new GenericsDemo();
        gd.sayHello();
    }



    public void sayHello() {
        System.out.println(A.class.toString());
        this.sayHello();

    }
}
