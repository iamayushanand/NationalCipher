package national_cipher_challenge;



import java.util.HashMap;

/**
 * Created by Ayush on 20/10/2015.
 */
public class freqAnalysis {
    public static char MostFreq(String input){
        HashMap freq = new HashMap();
            for(char i=0;i<26;i++){

                freq.put((char) ('a' + i), 0);
            }
        for(int i=0;i<input.length();i++){
            if(Character.isAlphabetic(input.charAt(i))){
            freq.put(input.charAt(i),(int)freq.get(input.charAt(i))+1);
            }
        }
        char ret ='*';
        int val = 0;
        for(Object curKey:freq.keySet()){
            if(val<(int)freq.get(curKey)){
                val=(int)freq.get(curKey);
                ret=(char)curKey;
            }
        }
        return ret;
    }
    public static void main(String[] args){
        String test="abbbbbbbbbbbbbcdddddd ddddddddddd";
        System.out.println(MostFreq(test));
    }
}
