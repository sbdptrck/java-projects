package Activity;

public class UserInputCount {
    public void countDigit(int number){
        int count = 0;

        for (int i = 1; i > 0; i++){
            if(number !=0){
                count++;
                number = number/10;
                i--;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}
