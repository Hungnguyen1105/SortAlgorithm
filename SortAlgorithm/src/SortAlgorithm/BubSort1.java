package SortAlgorithm;

public class BubSort1 {
    public static void bubbleSort(int[]arr){
        int n = arr.length;
        for (int i = 0; i < n-1 ; i++){
            // bat dau bong lap de lap qua mang
            for (int j = 0 ; j < n -i-1; j++){
                //lặp qua các vị trí của mảng, ngoại trừ phần tử cuối cùng
                // (vì phần tử cuối cùng đã đúng vị trí sau các lần lặp trước).
                if (arr[j]> arr[j+1]){
                    // swap elenment
                    int temp = arr[j];
                    // tao bien hoan doi vi tri
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,7,4,3,1,5,9,21,11};// khai bao mang
        System.out.println("Array before sorting: ");
        for (int num:arr) {
            // su dung vong lap for-each lap qua mang gan gia tri moi phan tu
            System.out.print(num + " ");

        }
        System.out.println();
        bubbleSort(arr);
        // phuong thuc sap xep mang arr

        System.out.println("Array after Sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
