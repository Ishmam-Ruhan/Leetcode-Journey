import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        
        BigInteger number1 = new BigInteger(a,2);
        BigInteger number2 = new BigInteger(b,2);
        
        return number1.add(number2).toString(2);
    }
}