package com.sistema_chat.validation;
import org.mindrot.jbcrypt.BCrypt;;
public class PassworValidator {
   public static String hashPassword(String plainPassword){
    return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
   }
   public static Boolean chekedPassword(String plainPassword , String hashedPassword){
    return BCrypt.checkpw(plainPassword, hashedPassword);
   }

}
