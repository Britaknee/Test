public class Method{

    public static void main(String[] args) {
		loveAndHate(5);
		carrotCake(5,10,15,20);
		System.out.println("This is an example");
		//BUTO
	}

    private static void loveAndHate(int n) {
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0 && i < n - 1) {
                System.out.print("I hate that ");
            }
            if(i % 2 == 1 && i < n - 1) {
                System.out.print("I love that ");
            }
            if(i % 2 == 0 && i == n - 1) {
                System.out.print("I hate ");
            }
            if(i % 2 == 1 && i == n - 1) {
                System.out.print("I love ");
            }
        }
        System.out.print("it");

   }

   public String carrotCake(int n, int t, int k, int d){
	   int a = n;
	   int temp = (int) Math.ceil((double)n/k);

	   int timeTakenNormal = temp*t;
	   int timeTakenOven = d;

	   a=(a-(d/t))*k;

	   while(a>0){
		   a=a-(2*k);
		   timeTakenOven=timeTakenOven + t;
	   } if (k >= n) {
		   return "NO";
	   } else{
		   if(timeTakenNormal > timeTakenOven) {
			   return "YES";
		   }else{
			   return "NO";
		   }
	   }
   }
}
