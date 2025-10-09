public class Main
{
    /*public static void main (String[] args)
    {
    fizzBuzz();
    }
    */
    //Bis 100
    public static void fizzBuzz()
    {
    for (int i = 1; i <= 100; i++)
        {
            if (i%3 == 0)   System.out.println("Fizz");
            if (i%5 == 0)   System.out.println("Buzz");
            if (i%7 == 0)   System.out.println("Whizz");
            if (i%11 == 0)  System.out.println("Bang");
            else System.out.println(i);
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