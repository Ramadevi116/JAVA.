public class Q4 {

	public static void main(String[] args) {
		int number1 = 0;
        int number2 = 1;
        int sum;
        int total = 15;

        System.out.print(number1);

        for(int i=1;i<total;++i){
          
          sum = number1 + number2;
          System.out.print(", " + number2);
          number1 = number2;
          number2= sum;   

        }

	}

}