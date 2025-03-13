package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] arrayInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserire il proprio nome completo");
        String fullName = sc.nextLine().trim().replaceAll("\\s+", " ").toLowerCase();

        Boolean isInvited = false;

        // for (int i = 0; i < arrayInvitati.length; i++) {
        // String invitatoCorrente = arrayInvitati[i].trim().replaceAll("\\s+", "
        // ").toLowerCase();


        // boolean isHim = invitatoCorrente.equals(fullName);

        // // System.out.println(invitatoCorrente + " == " + fullName + " :
        // " + isHim);

        // if (isHim) {
        // isInvited = true;
        // System.out.println("Benvenuto alla festa dei Ferragnez " +
        // fullName + "!");
        // break;
        // }

        // }
        

        int i = 0;

        boolean isHim = false;

        while (!isInvited && !isHim && i < arrayInvitati.length) {

            String invitatoCorrente = arrayInvitati[i].trim().replaceAll("\\s+", " ").toLowerCase();

            isHim = invitatoCorrente.equals(fullName);

             System.out.println(invitatoCorrente + " == " + fullName + " : " + isHim);

            if (isHim) {
                isInvited = true;
                System.out.println("Benvenuto alla festa dei Ferragnez " + fullName + "!");
            }

            i++;
        }

        if (!isInvited) {
            System.out.println("torna a casa tua ciccio/a :)");
        }
    }
}
