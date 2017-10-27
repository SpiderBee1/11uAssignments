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
            //end the program if the user types EXIT in all caps
            if (word.equals("EXIT")) {
                break;
            }
            //defines string translated
            String translated = "";

            for (int i = 0; i < word.length(); i++) {
                //convert to lowercase
                word = word.toLowerCase();
                //if the letter is a vowel
                if (word.charAt(i) == ('a') || word.charAt(i) == ('e') || word.charAt(i) == ('i') || word.charAt(i) == ('o') || word.charAt(i) == ('u')) {
                    //add the letter to the translation with ub
                    translated = translated + "ub" + word.charAt(i);
                    //if the next letter is a vowel
                    while (i != word.length() - 1 && (word.charAt(i + 1) == ('a') || word.charAt(i + 1) == ('e') || word.charAt(i + 1) == ('i') || word.charAt(i + 1) == ('o') || word.charAt(i + 1) == ('u'))) {
                        //cheats the for statement to add a vowel without ub
                        i = i + 1;
                        translated = translated + word.charAt(i);
                    }
                //if it is not a vowel
                } else {
                    //add letter to translation
                    translated = translated + word.charAt(i);
                }
            }
            //prints the translated text (it is on two lines because it looks better)
            System.out.println("in Ubbi Dubbi is:");
            System.out.println("\"" + translated + "\"");
        }
    }
}
