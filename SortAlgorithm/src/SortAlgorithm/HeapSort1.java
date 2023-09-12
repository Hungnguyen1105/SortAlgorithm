package SortAlgorithm;

public class HeapSort1 {
    public static void heapSort(int[]arr){
        int n = arr.length;
        for (int i = n/ 2-1; i >=0; i--){
            heapify(arr, n, i);
            /*thực hiện việc xây dựng một Heap Max từ mảng đầu vào
            Biến i được khởi tạo với giá trị bằng một nửa độ dài của mảng (n / 2 - 1)
            Mỗi lần lặp, hàm heapify được gọi để biến cây con có gốc tại i thành một Heap Max.
            Điều này đảm bảo rằng cây Heap toàn cục sau cùng là một Heap Max, với nút gốc (index 0) chứa giá trị lớn nhất trong mảng.
            */
        }

        for (int i = n - 1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            //  gán giá trị của phần tử cuối cùng trong mảng (tức là giá trị tại index i) vào phần tử đầu tiên của mảng

            arr[i]= temp;
            /*Dòng này gán giá trị của biến tạm thời temp (chứa giá trị ban đầu của phần tử đầu tiên) vào phần tử cuối cùng của mảng (index i).
              Điều này hoán đổi giá trị của phần tử đầu tiên (ban đầu là lớn nhất)
              với phần tử cuối cùng trong mảng, để đảm bảo rằng phần tử lớn nhất đã được đưa vào vị trí cuối cùng của mảng. */


            heapify(arr, i, 0);
            //gọi lại hàm heapify để tái cấu trúc Heap sau khi trích xuất phần tử lớn nhất và đặt nó vào cuối mảng

            /* Vòng lặp này bắt đầu từ cuối mảng và di chuyển từ phải qua trái.
               Tại mỗi bước, nút gốc của Heap (có giá trị lớn nhất) được trích xuất và đặt ở cuối mảng (index i).
               Điều này có nghĩa là phần tử lớn nhất đã được đặt ở vị trí cuối cùng của mảng.
               Sau khi trích xuất phần tử lớn nhất, cây Heap được giảm kích thước đi 1 (bằng cách truyền i vào hàm heapify).
               Sau đó, hàm heapify được gọi lại để đảm bảo rằng cây đã giảm kích thước vẫn là một Heap Max,
               và quá trình này tiếp tục cho đến khi mảng được sắp xếp hoàn thành.
             */

        }
    }
    public static void heapify(int []arr, int n , int i){
        int largest = i; // khoi tao largest la goc
        int leftChild = 2* i+1;// chi so cua nut trai
        int rightChild = 2 * i +2;// chi so cua nut phai
        /*  So sánh nút con trái với nút gốc và ghi nhớ nút lớn hơn */
        if (leftChild < n && arr[leftChild]> arr[largest]){
            largest = leftChild;
        }
        /* So sánh nút con phải với nút lớn nhất đã tìm được ở trên */
        if (rightChild < n && arr[rightChild]> arr[largest]){
            largest = rightChild;
        }
        /* Nếu nút lớn nhất không phải là gốc, thực hiện swap và gọi heapify lại*/
        if (largest != i){
            int swap = arr[i];
            // tạo một biến tạm thời swap để lưu giá trị của nút i, tức là arr[i].

            arr[i]= arr[largest];
            // Đoạn này tạo một biến tạm thời swap để lưu giá trị của nút i, tức là arr[i].
            arr[largest] = swap;
            // Dòng này gán giá trị của biến tạm thời swap vào nút largest. Điều này đồng nghĩa với việc đặt giá trị ban đầu của nút i vào nút largest

            heapify(arr, n, largest);
            //gọi lại hàm heapify trên cây con có gốc tại largest
        }

    }
    public static void printArray(int []arr){
        int n = arr.length;
        for(int i = 0 ; i< n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr = {15,16,8,5,6,7,1};
        System.out.println("Mang chua sap xep");
        printArray(arr);

        heapSort(arr);
        // goi phuong thuc sap xep vun dong

        System.out.println("Mang sau khi sap xep");
        printArray(arr);
    }
}
