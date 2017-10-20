public class Method{

    public static void main(String[] args) {
		loveAndHate(5);
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
}
