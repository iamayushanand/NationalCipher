package national_cipher_challenge;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created by mYPC on 20/10/2015.
 */
public class AffineCipherTest extends TestCase {

    public void testEuclideanAlgo() throws Exception {
        int[] ans=AffineCipher.euclideanAlgo(3000,197);
        int[] real=new int[] {1,5,1};
        assertEquals(Arrays.toString(ans),Arrays.toString(real));
    }
}