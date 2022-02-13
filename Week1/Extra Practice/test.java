import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class test {
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));

        HashMap<Integer, String> idMap = new HashMap<Integer, String>();

        idMap.put(1, "Andrew");
        idMap.put(2, "Nate");
        idMap.put(3, "Elijah");
        idMap.put(4, "Stephanie");

        Set<Integer> keys = idMap.keySet();
        for(Integer key : keys) {
            System.out.printf(key + " " + idMap.get(key) + "\n");
    }
    
}}