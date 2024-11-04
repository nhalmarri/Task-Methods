import java.util.ArrayList;

public class SummationPractice {
    public static void main(String[] args) {

       ArrayList<Integer> numbers = new ArrayList<>();

//       numbers.add(1);
//       numbers.add(15);
//       numbers.add(4);
//       numbers.add(11);
//       numbers.add(6);



        for( int i =0 ; i < 10; i++) {
            int randomNum = (int) (Math.random()*10);
            //System.out.print(randomNum + " ");
            numbers.add(randomNum) ;
        }

        System.out.println(sum(numbers));


    } //end of main method

    public static int sum (ArrayList<Integer> numbers) {

        int sum = 0;

        for ( int number : numbers ) {
            sum += number;
        }

        return sum;
    }



}