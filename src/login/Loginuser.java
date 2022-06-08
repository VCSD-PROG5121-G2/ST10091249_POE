
package login;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Loginuser {
    
    private String username;
    private String Password;
    private String firstname;
    private String lastname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public boolean checkUserName(String username){
        boolean Checked;
    
    if(username.length() <= 5 && username.contains("_") ){
            
             System.out.println("Username successfuly captured");
        Checked = true;
    }else{
        System.out.println("Usaername is not correctly formatted please "
                              + "ensure that your username contains an "
                              + "underscore and is no more than 5 character");
        Checked = false;
    }
    return Checked;
    }
        
        
    
    public boolean checkPasswordComplexity(String password){
        Pattern sp = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]");
        Matcher sm = sp.matcher(password); 
        boolean foundspc = sm.find();
        boolean foundUpper = true; 
        boolean foundDigit = true;
        boolean foundLower = true;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c) ){
            foundUpper = true;    
        }
            if (Character.isLowerCase(0) ){
            foundLower = true;
        }
            if (Character.isDigit(c)) {
            foundDigit = true;
        } }
           if(foundDigit && foundspc && password.length()>=8 && foundUpper ){System.out.println("Password successfuly captured");return false;}
           else{System.out.println("Password is not correctly formatted, please ensure that the "
                   + "password contains at least 8 characters, "
                   + "a capital letter, a number and a special character.”");
                   return true;}
    }


    public String registerUser(){
        String success="The registration is successful";
        return success;
    }
    public boolean logUser(String loginus,String loginpws){
        if(loginus.equals(username) && loginpws.equals(Password)){
            System.out.println("Welcome " + firstname + " "+ lastname+" its good to see you");
            return false;
        }else {return true;}
    } 
    
    }
       
    
    

  
   
           
