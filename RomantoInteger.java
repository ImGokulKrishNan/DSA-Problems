13. Roman to Integer
Solved
Easy
Topics
Companies
Hint
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer

  
import java.util.HashMap;


public class RomantoInteger{
    public static void main(String[] args) {

        String[] a={"III","MCMXCIV","LVIII" };

        for (int i = 0; i <= a.length; i++) {
            String b=a[i];
            System.out.println(find(b));

        }

    }
    static int find(String s){
        int n = 0;
        int m = 0;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

       // String s = "MCMXCIV";
        while (n <s.length()) {
            int temp=0;
            if(n!=s.length()-1) {
                if (s.charAt(n) == 'I' && s.charAt(n + 1) == 'V') {
                    temp = Math.abs(map.get(s.charAt(n)) - map.get(s.charAt(n + 1)));
                }
                if (s.charAt(n) == 'I' && s.charAt(n + 1) == 'X') {
                    temp = Math.abs(map.get(s.charAt(n)) - map.get(s.charAt(n + 1)));
                }
                if (s.charAt(n) == 'X' && s.charAt(n + 1) == 'L') {
                    temp = Math.abs(map.get(s.charAt(n)) - map.get(s.charAt(n + 1)));
                }
                if (s.charAt(n) == 'X' && s.charAt(n + 1) == 'C') {
                    temp = Math.abs(map.get(s.charAt(n)) - map.get(s.charAt(n + 1)));
                }
                if (s.charAt(n) == 'C' && s.charAt(n + 1) == 'D') {
                    temp = Math.abs(map.get(s.charAt(n)) - map.get(s.charAt(n + 1)));
                }
                if (s.charAt(n) == 'C' && s.charAt(n + 1) == 'M') {
                    temp = Math.abs(map.get(s.charAt(n)) - map.get(s.charAt(n + 1)));
                }
            }
            if(temp==0){
                m=m+temp+map.get(s.charAt(n));
                n++;
            }
            else{
                m=m+temp;
                n=n+2;
            }
        }
    return m;
    }
    }
