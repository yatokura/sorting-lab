import java.util.Arrays;
import java.util.Random;


public class Main {
    static void main(String[] args) {
        Random rnd = new Random(44);
        int[] data = rnd.ints(10, 0, 100).toArray();
        int[] expected = data.clone();
        Arrays.sort(expected);
        System.out.println(Arrays.toString(data));

        System.out.println("============================");
        int pivot = 0;
        int middleIndex = Math.round(data.length/2);
        int lastIndex = data.length-1;
        System.out.println(data[middleIndex]);
        if((data[0]>data[middleIndex] && data[0]<data[lastIndex])||
                (data[0]<data[middleIndex] && data[0]>data[lastIndex]))
        {
            System.out.println("first");
        }
        else if((data[lastIndex]>data[middleIndex] && data[lastIndex]<data[0])||
                (data[lastIndex]<data[middleIndex] && data[lastIndex]>data[0]))
        {
            System.out.println("last");
        }
        else
        {
            System.out.println("middle");
        }

        
        System.out.println("============================");
        System.out.println(Arrays.toString(expected));

    }
}
