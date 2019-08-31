public class CeaserCipher {

    public static String encrypt(String text, int key){

        String encryptedText = "";
       if(key>26){
           System.err.println("Uknown key! ");

       } else if(key <=26){

           int textLength = text.length();
           for (int i=0; i<textLength; i++){
               char index = text.charAt(i);
               if (Character.isLetter(index)){
                   char encryptedChar = (char)(index + key);

                   if (encryptedChar > 'z'){
                      encryptedText += (char)(index - (26 - key));
                   }  else {
                      encryptedText += encryptedChar;
                   }
               }

           }
       }
       return encryptedText;
    }
public static String decrypt(String text){
        String decryptedText = text;
        return decryptedText;
}


}
