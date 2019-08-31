import java.io.Console;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {

    public static void main(String[] args) {
        System.out.println("Enter string to be encrypted");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
       String userString = bufferedReader.readLine();
        //key
        System.out.println("Enter key");
        String keyString = bufferedReader.readLine();
        int key = Integer.parseInt(keyString);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

        CeaserCipher ceaserCipher = new CeaserCipher();
        String encryptedResult = ceaserCipher.encrypt(userString,key);
        //
        String decryptedResult = ceaserCipher.decrypt(userString);
        System.out.println("Decrypted :" + decryptedResult + " " );
        System.out.println("Encrypted : " + encryptedResult + " " + "with key " + key);
        } catch (IOException e){
            e.printStackTrace();
        }

    }

}

