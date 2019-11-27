package week7;
import java.util.Arrays;
/**
 * 在这里给出对类 BubbleSort 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class BubbleSort {
    public static void main(String [ ] args) {
        int [ ] arr = {98,38,93,33,21,6,63,81,32};
        System.out.println("Original array is: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.print("Sorted array is (Bubble sort): [ ");
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("]");
    }

    public static void bubbleSort(int [] array) {
        int n = array.length;
        for(int pass=0; pass<n-1; pass++){
            for(int a=0; a<n-pass-1; a++) {
                if(array[a] > array[a+1]){
                    swap(array,a,a+1);
                }
            }
        }
    }

    public static void swap (int [ ] array, int first, int second) {
        int temp = array [ first ];
        array [ first ] = array [ second ];
        array [ second ] = temp;
    }
}

