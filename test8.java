import java.util.Scanner;

public class test8{
    public static void main(String[] args){
        int row = 0;
		int aa =0;
		int straight = 4;
        while (aa < 10) {
			int star = 0;
		    if(aa < 5){
				while (star <= row) {
					System.out.print("*");
					star = star + 1;
				}
				System.out.println("");
				row = row + 1;
				aa +=1;
			}
			else{
				int star1 = 0;
				while(star1 < straight){
				
					System.out.print("*");
					star1  = star1 +1;
					 
				 
				}
				System.out.println("");
				straight -=1;
			
				aa +=1;
				
			
				
			}
        }
    
    }
}