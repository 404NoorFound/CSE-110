import java.util.Arrays;

public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {

        return Arrays.stream(array).sum();
    }
}

/*int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;*/
// OR

/*  int sum = 0;
    for(int number: array){
        sum +=number;
    }
    return sum;
*/
    //integers.values().stream().mapToInt(Integer::intValue).sum();
    //integers.values().stream().collect(Collectors.summingInt(Integer::intValue));