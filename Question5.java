import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int row = 1;
        int space = 0;
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
            //row ki prep
        row++;
        star--;
        space++;
        System.out.println();
        }
    }
}
