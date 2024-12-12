import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        while(row<=n){
            //star
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;


            }
            //next row preparation
            row++;
            star++;
            System.out.println();
        }
    }
}
