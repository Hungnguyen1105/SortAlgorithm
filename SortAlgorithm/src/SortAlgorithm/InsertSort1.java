package SortAlgorithm;

public class InsertSort1 {
    public static void InsertSort(int[]arr){
        //là phương thức thực hiện thuật toán sắp xếp chèn trên một mảng số nguyên đầu vào (arr).
        int n = arr.length;// khai bao lay do dai cua mang
        for (int i =1; i <n; i++){
            //duyệt qua mảng từ phần tử thứ hai đến phần tử cuối.
            int key = arr[i];   // khai bao key voi mang
            int j = i -1 ;   // Đặt chỉ số j để duyệt qua các phần tử bên trái của key

            // di chuyen mang lon hon key ve phia sau de tao vi tri cho mang da sap xep
            while (j>=0 && arr[j]>key){  //: Bắt đầu vòng lặp while để di chuyển các phần tử lớn hơn key về phía sau để mở đường cho key.
                arr[j+1] = arr[j];  // Di chuyển phần tử tại vị trí j sang phải để tạo chỗ cho key
                j--;      //Giảm giá trị của j để duyệt qua các phần tử bên trái tiếp theo.
            }
            arr[j+1] = key;//Chèn key vào vị trí thích hợp trong mảng đã sắp xếp
        }
    }

    public static void main(String[] args) {
        int[] arr= {3,5,6,1,2,7,9};
        System.out.println("Array before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        InsertSort(arr);// goi phunog thuc sap xep chen

        System.out.println("Array after sorting: ");
        for (int num : arr ){
            // sử dụng để duyệt qua mảng hoặc tập hợp mà không cần quản lý chỉ số.
            // Trong trường hợp này, int num là biến tạm thời để lưu giá trị của từng phần tử trong mảng arr khi duyệt qua.
            System.out.print(num + " ");
        }
    }
}
