package national_cipher_challenge;

/**
 * Created by Ayush on 16/10/2015.
 *
 * This java code cracks any caeser shift encrypted code.
 * to crack simply keep changing the key.
 */
public class caesershift {
    static String Alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static String decode(String enc, int key){
        //key--;
        key=key%25;
        //System.out.println(key);
        int index=0;
        int decoded=0;
        String plaintext="";
        for(char i:enc.toCharArray()){
            if(Character.isLetter(i)){
               index = Alphabet.indexOf(i)+1;
               //System.out.println(index);
               decoded=(index+key)%26;
               if(decoded==0){plaintext=plaintext+Alphabet.charAt(25);}else{
               plaintext=plaintext+Alphabet.charAt(decoded-1);}
            }else{
                plaintext=plaintext+i;
            }
            index=0;
            decoded=0;
        }
        return plaintext;
    }
    public static void main(String[] args){
        String coded = "WT MCI KOBH HC YBCK HVS GSQFSH CT HVS FOHZWBSG W AOM PS OPZS HC VSZD PIH HVS DFWQS KWZZ PS VWUV OBR WG BCH BSUCHWOPZS ZWTS VSFS WB PSFZWB VOG ZCGH WHG ZIGHFS OBR W KOBH GOBQHIOFM WB O ACFS QCBUSBWOZ QZWAOHS KWHV GSQIFWHM TCF AM TIHIFS W QOB DFCJWRS RSHOWZG CT DSFGCBBSZ DCZWQM GSQIFWHM OBR FCIHSG OBR QOB TIFBWGV MCI KWHV RCQIASBHOFM SJWRSBQS CT HVS FSOQV CT HVS CFUOBWNOHWCB HVS FSWQVGRCYHCF ";
        coded=coded.toLowerCase();
        String test = " ";
        System.out.println(decode(coded,12).toUpperCase());
    }
}
