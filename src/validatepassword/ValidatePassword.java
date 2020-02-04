/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatepassword;

/**
 *
 * @author Jeremy
 */
import java.util.Scanner;
public class ValidatePassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
       
    Scanner input = new Scanner(System.in);
    System.out.println("1. Your password must have at least six characters in which: "
           + "\n a: Two uppercase letters \n b: two lowercase letters "
            + "\n c: Two digits \n Input a password: ");
        String s = input.nextLine();
        
        if(isValidPassword(s)){
            System.out.println("Password is Valid: " + s);
            
        } else{
            System.out.println("Not a valid Password: " + s);

         
             
        }
        
       
    }
    
    public static final int maxLength = 6;
    
    public static boolean isValidPassword(String password){
        if(password.length() < maxLength) return false;
        
        int charCount = 0;
        int numCount = 0;
        for(int i = 0; i < password.length(); i++){
            
            char ch = password.charAt(i);
            
            if(isNumeric(ch)) numCount++;
            else if (isuppercaseLetter(ch)) charCount++;
            else if (islowercaseLetter(ch)) charCount++;
            else return false;
        }
        
        return (charCount >= 2 && numCount >= 2);
    }
    
    public static boolean isuppercaseLetter(char ch){
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
        
    }
    
     public static boolean islowercaseLetter(char ch){
        ch = Character.toUpperCase(ch);
        return (ch >= 'a' && ch <= 'z');
        
    }
    
    public static boolean isNumeric(char ch) {
        
        return (ch >= '0' && ch <= '9');
    }
    
}
