package com.MundoSenai.Presenca.Service;

public class NumberClaener {
    public static String cleanerNumber(String number){
       return number.replaceAll("[^0-9]", "");
    }
}
