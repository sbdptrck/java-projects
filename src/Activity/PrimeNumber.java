package Activity;

public class PrimeNumber {
    public String checkPrimeNumber(int number){
        return (number % 2 == 1 || number == 2) ? "true" : "false";
    }

    public void checkBetweenTwoPrimeNumber(int number1, int number2){
        for(int i = number1; i < number2; i++){
            if(findPrime(i)){
                System.out.print(i+"\t");
            }
        }
    }

    public Boolean findPrime(int number){
        if(number <= 1){
            return false;
        }else{
            for(int i = 2; i <= number/2;i++){
                if(number%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
