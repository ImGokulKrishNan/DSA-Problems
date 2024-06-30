class Main {
public static void main(String[] args) {
int n=20;
int F1=1,F2=1;
System.out.println("F1="+F1);
System.out.println("F2="+F2);
       
            for(int j=3;j<=n;j++){
                int F3;
                F3=F1+F2;
            System.out.println("F"+j+"="+F3+"  ");
                    F1=F2;
                    F2=F3;
                }
 
}
    
    }
