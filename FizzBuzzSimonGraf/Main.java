public class Main
{
    public static void main (String[] args)
    {
        fizzBuzz();
    }

    //Bis 100
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            String result = "";

            if (i % 3 == 0) result += "Fizz";
            if (i % 5 == 0) result += "Buzz";
            if (i % 7 == 0) result += "Whizz";
            if (i % 11 == 0) result += "Bang";

            if (result.isEmpty()) System.out.println(i);
            else System.out.println(result);
        }
    }

    // Bis 1155

    /*
    public static void fizzBuzz(){
        for (int i = 1; true; i++){
            String printResult = "";
            if (i%3 == 0)   printResult += "Fizz";
            if (i%5 == 0)   printResult += "Buzz";
            if (i%7 == 0)   printResult += "Whizz";
            if (i%11 == 0)  printResult += "Bang";
            if (printResult.isEmpty()) System.out.println(i);
            else System.out.println(printResult);
            if (printResult.equals("FizzBuzzWhizzBang")) break;
        }
    }
    */  
}