public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0, digit = 0;
        for(int i = 0; i < number; i++) {
            digit = number % 10;
            if(digit % 2 == 0){
            sum+=digit;
            }
            number /= 10;
        }
        if(number > 1){
            return sum+number;
        } else
        return sum;
    }
}
