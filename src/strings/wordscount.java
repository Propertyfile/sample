/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class wordscount {

    public static void main(String[] args) {
       String s=null;
int count=0;
 
Scanner in = new Scanner(System.in);
System.out.println("Please enter a String");
 s=in.nextLine();
 char ch[]= new char[s.length()];    
 for(int i=0;i<s.length();i++)
{
     ch[i]= s.charAt(i);
     if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
        count++;
 }
System.out.println("Number of words in given String: "+count);
        System.out.println("number of characters :" +s.length());
     }
}
