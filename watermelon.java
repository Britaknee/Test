import java.util.Scanner;
public class WaterMelon{

	Scanner scan = new Scanner(System.in);
	System.out.print(Enter the weight of the water melon  );
	int weight=scan.nextInt();


	
	if(weight1 && weight100){
	System.out.print(Input only values between 1 and 100);
	} else{
	if(weight%2 == 0){
		System.out.print(Yes);
	} else if (weight%2 != 0){
		System.out.print(No);
	}

	} 
public String waterMelon(int weight) {
	   if(weight1 && weight100){
	System.out.print(Input only values between 1 and 100);
	} else{
	if(weight%2 == 0){
		return Yes;
			System.out.print(Yes);
	} else if (weight%2 != 0){
		return No;
			System.out.print(No);
	}

}
 	return No; }
public static void main(String[] args){
	WaterMelon obj = new WaterMelon();
	System.out.print(obj.waterMelon(18));
	}
}