package national_cipher_challenge;

import java.util.HashMap;

/**
 * Created by Ayush on 19/10/2015.
 */
public class SubstitutionCipher {
    public static HashMap mapping = new HashMap();

    public static void initialize(){

        for(char i=0;i<26;i++){

            mapping.put((char)('a'+i),'*');
        }
    }

    public static void substitute(char a,char b){
        mapping.put(a,b);
    }

    public static void printDecoded(String enc){
        String text="";
        for(int i=0;i<enc.length();i++){
            if(mapping.get(enc.charAt(i))!=null){
            text=text+mapping.get(enc.charAt(i));
            }else{
                text=text+enc.charAt(i);
            }
        }
        System.out.println(text);
    }

    public static void main(String args[]){
        String test="abcdada";
        initialize();

        substitute('b','z');
        substitute('a','h');
        printDecoded(test);
    }

}
