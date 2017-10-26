/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author goodm9679
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a word to translate, or type \"EXIT\" to end program");
            String word = input.nextLine();
            if (word.equals("EXIT")) {
                break;
            }

            String translated = "";

            for (int i = 0; i < word.length(); i++) {
                //convert to lowercase
                word = word.toLowerCase();
                if (word.charAt(i) == ('a') || word.charAt(i) == ('e') || word.charAt(i) == ('i') || word.charAt(i) == ('o') || word.charAt(i) == ('u')) {
                    translated = translated + "ub" + word.charAt(i);
                    while (i != word.length() - 1 && (word.charAt(i + 1) == ('a') || word.charAt(i + 1) == ('e') || word.charAt(i + 1) == ('i') || word.charAt(i + 1) == ('o') || word.charAt(i + 1) == ('u'))) {
                        i = i + 1;
                        translated = translated + word.charAt(i);
                    }
                } else {
                    translated = translated + word.charAt(i);
                }
            }
            System.out.println("in Ubbi Dubbi is:");
            System.out.println("\"" + translated + "\"");
        }
    }
}
