public class gcd {
    public static void main(String[] args) {

        int k=find(15,25);
        System.out.println(k);
    }
    static int find(int a,int b){

        int ans = (a > b) ? a : b;

        while(true){

        if(ans%a==0 && ans%b==0){
            break;
        }
        ans++;

        }
        return ans;
    }
}
