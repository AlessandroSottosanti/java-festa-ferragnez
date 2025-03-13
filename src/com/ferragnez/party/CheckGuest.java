package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] arrayInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserire il proprio nome completo");
        String fullName = sc.nextLine().toLowerCase().trim();

        Boolean isInvited = false;

        for (int i = 0; i < arrayInvitati.length; i++) {
            String invitatoCorrente = arrayInvitati[i].trim().toLowerCase();

            String nomeNormalizzato = invitatoCorrente.trim().replaceAll("\\s+", " ").toLowerCase();
            String fullNameNormalizzato = fullName.trim().replaceAll("\\s+", " ").toLowerCase();

            boolean isHim = nomeNormalizzato.equals(fullNameNormalizzato);

            // System.out.println(nomeNormalizzato + " == " + fullNameNormalizzato + " : " + isHim);

            if (isHim) {
                isInvited = true;
                System.out.println("Benvenuto alla festa dei Ferragnez " + fullNameNormalizzato + "!");
                break;
            }

        }

        if (!isInvited) {

            System.out.println("torna a casa tua ciccio/a :)");
        }

    }
}
