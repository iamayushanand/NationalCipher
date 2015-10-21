package national_cipher_challenge;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by mYPC on 20/10/2015.
 */
public class AffineCipher {
    public static int[] euclideanAlgo(int input,int mod){
        int[] axr=new int[3];
        int a = input/mod;
        int x=mod;
        int r=input % mod;
        //System.out.println("a: "+a+" x: "+x+" r: "+r);
        if(r==1){
            axr[0]=a;
            axr[1]=x;
            axr[2]=r;
            return axr;
        }else{
        return euclideanAlgo(x,r);
        }

    }


    public static String decode(String enc,int a,int b){
        BigInteger inv=BigInteger.valueOf(a).modInverse(BigInteger.valueOf(26));
        int inverse=inv.intValue();
        int p=0;
        int y=0;
        String plaintext="";
        for(int i=0;i<enc.length();i++){
           if(Character.isAlphabetic(enc.charAt(i))){
             y=((int)(enc.charAt(i)-'a'));
             p=inverse*(y-b+26) % 26;
             plaintext=plaintext+(char)('a'+p);
           }else{
               plaintext=plaintext+enc.charAt(i);
           }
        }
        return plaintext;
    }

    public static void main(String[] args){
        System.out.println(decode("IHHWVCSWFRCP".toLowerCase(),5,8));

    }
}
