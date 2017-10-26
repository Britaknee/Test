import java.util.Scanner; 
public class MishkaAndGame{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.println(method(input));		
		
	}
	public static String method(Scanner input){
		int rounds = input.nextInt();
        int mishka = 0;
        int chris = 0;
        
        for (int i = 0; i < rounds; i++) {
            int m = input.nextInt();
            int c = input.nextInt();
            
            if (m > c) {
                mishka++;
            } else if (c > m) {
                chris++;
            }
            
        }
        
        if (mishka > chris) {
            return "Mishka";
        } else if (mishka < chris) {
            return "Chris";
        } else {
            return "Friendship is magic!^^";
        }
	}
}