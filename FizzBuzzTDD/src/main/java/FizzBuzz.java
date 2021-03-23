public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int i = 0;

        while(i<100){
            System.out.println(fizzBuzz.process(i));
            i++;
        }
    }

    public String process(long number) {
        if(number%3==0 && number%5==0){
            return "FizzBuzz";
        }
        if(number%3==0){
            return "Fizz";
        }

        if(number%5==0){
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
