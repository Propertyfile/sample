/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author miracle
 */
public class Strings {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = deleteCharAt("sumanth roi", 7);
        System.out.println("New String:" + str1);
    }
    private static String deleteCharAt(String str, int i) {
        return str.substring(0, i) + str.substring(i + 1);
    }
}
