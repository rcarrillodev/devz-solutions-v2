package dev.rcarrillo.devz.arraysstrings;

import java.text.Normalizer;

/**
 * Escribe un programa que verifique que una frase es un palíndromo.
 * Un palíndromo es una frase que se lee igual de derecha a izquierda que de izquierda
 * a derecha.
 */
public class Palindrome {

    public static void main(String[] args) {
        String str1 = "Aman a Panamá";
        String str2 = "ana";
        String str3 = "sol";
        String str4 = "A mamá Roma le aviva el amor a papá y a papá Roma le aviva el amor a mamá";
        System.out.printf("%s : %s%n",str1, isPalindrome(str1));
        System.out.printf("%s : %s%n",str2, isPalindrome(str2));
        System.out.printf("%s : %s%n",str3, isPalindrome(str3));
        System.out.printf("%s : %s%n",str4, isPalindrome(str4));
    }

    private static boolean isPalindrome(String phrase) {
        phrase = normalizePhrase(phrase);
        char [] charArray = phrase.toCharArray();
        int start = 0;
        int end = charArray.length-1;
        for(int i = 0; i<charArray.length/2; i++){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }

    private static String normalizePhrase(String phrase) {
        phrase = phrase.toLowerCase();
        phrase = phrase.trim();
        phrase = phrase.replaceAll("\\s","");
        phrase = Normalizer.normalize(phrase,Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        return phrase;
    }

}
