import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        int space = n-1;
        while(row<=n){

             //space
             int j=1;
             while(j<=space){
                 System.out.print("  ");
                 j++;
             }
            //star
            int i =1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
        row++;
        star++;
        space--;
        System.out.println();
        }
    }
}
