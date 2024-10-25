import java.util.Arrays;
public class BubbleSort {  
private void swap(int[] array, int i, int j) {
int temp = array[i];
array[i] = array[j];
array[j] = temp;
}
public void bubbleSort(int[] array) {
int n = array.length;
       
for (int i = 0; i < n - 1; i++) {            
for (int j = 0; j < n - 1 - i; j++) {
if (array[j] > array[j + 1]) {
swap(array, j, j + 1); 
}
}
}
}
public static void main(String[] args) {
int[] numbers = {8,3,1,4,5,11,7,2,17,13};
        
System.out.println("Before Sorting: " + Arrays.toString(numbers));
        
BubbleSort sorter = new BubbleSort();
sorter.bubbleSort(numbers);
        
System.out.println("After Sorting: " + Arrays.toString(numbers));
}
}