package SortAlgorithm;

public class StableSorting {
    // Bắt đầu khai báo lớp với tên
    public static void bubbleSort(int[] arr){
        //Khai báo phương thức bubbleSort nhận một mảng số nguyên làm đối số.
        int n = arr.length;// gan do dai cua mang cho bien
        for (int i = 0; i < n-1 ; i++ ){

            /*Bắt đầu vòng lặp i-loop để lặp qua mảng.
            Đây là vòng lặp bên ngoài (i-loop) để duyệt qua từng phần tử của mảng và đảm bảo rằng
            phần tử lớn nhất "bơi" lên vị trí cuối cùng sau mỗi lần lặp
            n là độ dài của mảng / i là biến đếm cho vòng lặp. Vòng lặp này chạy từ 0 đến n - 1 để đảm bảo tất cả các phần tử được xem xét.

             */
            for (int j = 0 ; j< n-i-1; j++){

                /* Bắt đầu vong lặp qua mảng j-loop để lặp qua mảng Đây là vòng lặp bên trong (j-loop) để so sánh và hoán đổi các cặp phần tử liên tiếp.
                  j là biến đếm cho vòng lặp. Vòng lặp này chạy từ 0 đến n - i - 1.
                  Điều này giới hạn vòng lặp để chỉ xét các phần tử trong dãy chưa sắp xếp.
                  Sau mỗi vòng lặp bên ngoài (i tăng lên), một phần tử lớn nhất sẽ đã "bơi" lên vị trí cuối cùng, do đó không cần xét lại
                */

                if (arr[j] > arr[j+1]){

                    /* Kiểm tra nếu phần tử hiện tại lớn hơn phần tử kế tiếp. Nếu điều này đúng, ta cần hoán
                     đổi vị trí của chúng để đưa phần tử lớn hơn về phía cuối của dãy.*/

                    int temp = arr[j]; //Tạo một biến tạm temp để lưu giá trị của phần tử hiện tại.
                    arr[j] = arr[j+1];//Gán giá trị của phần tử sau cho phần tử hiện tại.
                    arr[j+1]= temp;// Gán giá trị của temp cho phần tử sau, hoàn thành hoán đổi.
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,9,8,4,2,3,1};
        // khởi tao mảng "arr" các giá trị khác nhau
        System.out.println("\nMang ban dau: ");
        for (int num : arr){
            //Bắt đầu vòng lặp for-each để lặp qua mảng arr và gán giá trị của mỗi phần tử cho biến num.
            System.out.print( num + " ");
        }
        bubbleSort(arr);
        //goi phuong thuc de sap xep mang arr
        System.out.println("\nMang sau khi sap xep: ");
        for (int num : arr){
            System.out.println(num + " ");

        }
    }
}
