public class NumbertoWord {
    public static void main(String[] args) {
        int n=45663516;
        System.out.println(n==0 ?"Zero":helper(n));

    }
    static String helper(int num){
        StringBuilder s=new StringBuilder();

        String[] belowTwenty = {"",        "One",     "Two",       "Three",    "Four",
                "Five",    "Six",     "Seven",     "Eight",    "Nine",
                "Ten",     "Eleven",  "Twelve",    "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"",      "",      "Twenty",  "Thirty", "Forty",
                "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (num < 20)
            s.append(belowTwenty[num]);
        else if (num < 100)
            s.append(tens[num / 10]).append(" ").append(belowTwenty[num % 10]);
        else if (num < 1000)
            s.append(helper(num / 100)).append(" Hundred ").append(helper(num % 100));
        else if (num < 1000000)
            s.append(helper(num / 1000)).append(" Thousand ").append(helper(num % 1000));
        else if (num < 1000000000)
            s.append(helper(num / 1000000)).append(" Million ").append(helper(num % 1000000));
        else
            s.append(helper(num / 1000000000)).append(" Billion ").append(helper(num % 1000000000));

        return s.toString().trim();
    }
}
