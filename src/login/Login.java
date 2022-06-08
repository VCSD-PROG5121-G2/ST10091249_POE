
package login;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.html.HTML;


public class Login{
    
    public static void main(String[] args){
        String fname,lname;
        String username = "";
        String password;
        String passn = "";
        String usern= "";
        boolean Checked = false;
        boolean Checkedpass = true;
        Scanner sc = new Scanner(System.in);
        Loginuser kb = new Loginuser();
        boolean Checkedlog = true;
        
         System.out.print("Enter your first name: ");
         fname=sc.nextLine();
        
         System.out.print("Enter your last name: ");
         lname=sc.nextLine();
         
        while(!Checked){
           
        //Prompt the user to enter their name
        System.out.print("Enter your username: ");
         usern = sc.nextLine();
        Checked = kb.checkUserName(usern);
        }
        while (Checkedpass){
             System.out.print("Enter your password: ");
         passn = sc.nextLine();
        Checkedpass = kb.checkPasswordComplexity(passn);
            
        }
        String reg = kb.registerUser();
        System.out.println(reg);
        kb.setFirstname(fname);
        kb.setLastname(lname);
        kb.setPassword(passn);
        kb.setUsername(usern);
        
        while(Checkedlog){
        System.out.println("Enter your logger username:");
        String loginus= sc.nextLine();
        
        System.out.println("Enter your logger password");
        String loginpw=sc.nextLine();
        Checkedlog = kb.logUser(loginus,loginpw);
        }
        
        
        
          
        }
         
         }

             
       
