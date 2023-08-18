package SortAlgorithm;

public class SelectSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;// khai bao do dai mang de dung trong vong lap

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; //biến này sẽ chứa chỉ số của phần tử nhỏ nhất tìm thấy trong phần mảng chưa được sắp xếp.
            for (int j = i + 1; j < n; j++) {
                // vong lap nay dùng để tìm phần tử nhỏ nhất trong phần mảng chưa được sắp xếp, bắt đầu từ vị trí i + 1
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    /* So sánh phần tử tại vị trí arr[j] với phần tử nhỏ nhất đã tìm thấy (arr[minIndex]).
                    Nếu phần tử tại arr[j] nhỏ hơn, ta cập nhật minIndex để trỏ tới j.*/
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1010,899,999,545,678};
        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSort(arr);
        // goi phuong thuc sap xep mang

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
