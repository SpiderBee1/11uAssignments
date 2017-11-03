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
        boolean back = true;
        while (true) {
            System.out.println("Please enter a word to translate. Type \"EXIT\" to end program, or type \"BACK\" to switch to reverse translations");
            if (back == true) {
                System.out.println("You are currently translating to ubbi dubbi");
            } else {
                System.out.println("You are currently translating from ubbi dubbi");
            }
            String word = input.nextLine();
            //end the program if the user types EXIT in all caps
            if (word.equals("EXIT")) {
                break;
            }
            if (word.equals("BACK")) {
                if (back == true) {
                    back = false;
                } else {
                    back = true;
                }
            }
            //defines string translated
            String translated = "";
            //resets the int for b
            boolean invalid = false;
            //if the user did not try to switch modes
            if (!word.equals("BACK")) {
                //if the user wants to translate to ubbi dubbi
                if (back == true) {
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
                    //if the user wants to translate from ubbi dubbi
                } else {
                    for (int i = 0; i < word.length(); i++) {
                        //convert to lowercase
                        word = word.toLowerCase();
                        //if the letter is a "u" followed by a "b"
                        if (word.length() > 1 && word.charAt(i) == ('u') && word.charAt(i + 1) == ('b')) {
                            //skip these letters
                            i = i + 2;
                            //prevents the program from crashing in a case of faulty ubbi dubbi input
                            if (i != word.length()) {
                                translated = translated + word.charAt(i);
                            } else{                              
                                while (i != word.length() - 1) {
                                    i = i + 1;
                                    invalid = true;
                                }
                            }
                            //if the next letter is a vowel
                            if (i != word.length() - 1) {
                                while ((word.charAt(i + 1) == ('a') || word.charAt(i + 1) == ('e') || word.charAt(i + 1) == ('i') || word.charAt(i + 1) == ('o') || word.charAt(i + 1) == ('u'))) {
                                    i = i + 1;
                                    translated = translated + word.charAt(i);
                                }
                            }
                            //if it is not a "ub"
                        } else {
                            //add letter to translation
                            translated = translated + word.charAt(i);
                        }
                    }
                    //if the program did not find any errors
                    if(invalid == false){
                    //prints the translated text (it is on two lines because it looks better)
                    System.out.println("in it original format is:");
                    System.out.println("\"" + translated + "\"");
                    //if the program ran into an error
                    }else{
                        System.out.println("Invalid input");
                    }
                }
            }
        }
    }
}
