public class Practice4 {
    public static void main(String[] args){

        int[] numbers = {12, 45, 67, 23, 89, 34, 90,200, 11};
        int max = numbers[0];

        for (int i=1 ; i <numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];

            }
        }
        System.out.println("The maximum value in the array is: " + max);
    }
}

