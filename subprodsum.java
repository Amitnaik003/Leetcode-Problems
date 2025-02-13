import java.util.Scanner;
public class subprodsum {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("The produ and sum of the digits is");
        subprodsum obj=new subprodsum();
        System.out.println(obj.subsprodsum(n));
    }
    public int subsprodsum(int n){
        int prod =1;
        int sum=0;
        while(n!=0){
            int x=n%10;
            prod=prod*x;
            sum=sum+x;
            n=n/10;
        }
        return prod-sum;
    }
}
