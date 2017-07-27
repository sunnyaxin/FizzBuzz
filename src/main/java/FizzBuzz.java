public class FizzBuzz {
    String fizzbuzz(int n) {
        if(isDevidedByThree(n) && isDevidedByFive(n))
            return "FizzBuzz";
        if (isDevidedByThree(n))
            return "Fizz";
        if (isDevidedByFive(n))
            return "Buzz";
        return n + "";
    }

    private boolean isDevidedByFive(int n) {
        return n % 5 == 0;
    }

    private boolean isDevidedByThree(int n) {
        return n % 3 == 0;
    }
}
