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
//    public static String decrypt(String text, int key){
//
//        String decryptedText = "";
//        if(key>26){
//            System.err.println("Uknown key! ");
//
//        } else if(key <=26){
//
//            int textLength = text.length();
//            for (int i=0; i<textLength; i++){
//                char index = text.charAt(i);
//                if (Character.isLetter(index)){
//                    char decryptedChar = (char)(index - key);
//
//                    if (decryptedChar < 'a'){
//                        decryptedText += (char)(index + (26 - key));
//                    }  else {
//                        decryptedText += decryptedChar;
//                    }
//                }
//
//            }
//        }
//        return decryptedText;
//    }

    public static void main(String[] args) {
        String text = "Xylophone";
        String cipherText = encrypt(text, 3);
        System.out.println(cipherText);
        String decrypted = text;
        System.out.println("Decryptef = " + decrypted);

    }
}
