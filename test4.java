import java.util.Scanner;

public class test4{
    public static void main(String[] args){
    	int num1;
		
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        num1 = input.nextInt();
        if(num1<=100 && num1>=0){
            switch (num1/10){
                case 9:
                case 10:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("E");
                    break;
                }
        }
        else{
            System.out.println("error");
        }
    }
}