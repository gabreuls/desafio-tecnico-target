package com.desafiotarget;

public class Perg5 {

    // 5)

public static void InverterString(){ 
    String string = "DesafioTarget";

    char[] caracteresString = new char[string.length()];

    for(int i = 0; i < string.length(); i++) {
        caracteresString[i] = string.charAt(string.length() - 1 - i);
    }
    System.out.println("Questão 5: ");
    System.out.println(caracteresString);
}
}
