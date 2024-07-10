public class countalphabet {
    public static void main(String[] args) {

        String s="aaaaabbbcccddd";
        char[] s1 = s.toCharArray();
        int j=0;int count=1;

        for (int i = 1; i <s.length() ; i++) {

            if(s1[i] == s1[j]){
                count++;
            }
            if(s1[j] != s1[i] | i==s.length()-1){
                String k =Character.toString(s1[j]);
                System.out.print(k+count);
                j=i;
                count=1;
            }

        }


    }
}
