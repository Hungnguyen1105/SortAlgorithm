package SortAlgorithm;

public class MergeSort1 {
    public static void main(String[] args) {
        int[] arr = {2, 8, 6, 5, 1, 9};
        // khoi tao mang sap xep
        mergeSort(arr, 0, arr.length - 1);
        //Gọi hàm mergeSort để sắp xếp mảng từ vị trí đầu (0) đến vị trí cuối (arr.length - 1)
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // dieu kien so ben trai nho hon so ben phai
            int mid = left + (right - left) / 2;

            /*mid là chỉ số của phần tử ở giữa mảng,
            nơi mà mảng sẽ được chia thành hai phần nhỏ hơn.
            Biểu thức left + (right - left) / 2 tính toán giá trị trung bình của left và right,
            để tránh tràn số và đảm bảo tính đúng đắn khi lấy phần tử ở giữa */

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            /*
            Hai lời gọi đệ quy mergeSort được sử dụng để tiếp tục chia mảng thành các phần nhỏ hơn.
            Lời gọi đầu tiên mergeSort(arr, left, mid) chia mảng từ left đến mid.
            Lời gọi thứ hai mergeSort(arr, mid + 1, right) chia mảng từ mid + 1 đến right.
            */
            merge(arr, left, mid, right);
            /* sau khi các mảng con đã được sắp xếp bằng đệ quy,
            chúng ta gọi phương thức merge để trộn các mảng con lại với nhau và
            tạo thành mảng con đã sắp xếp từ left đến right.*/
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        /*đại diện cho số lượng phần tử trong mảng con bên trái. Vị trí phần tử giữa mid là một trong
         số các phần tử trong mảng con bên trái, nên cộng thêm 1 để tính cả phần tử giữa.*/

        int n2 = right - mid;
        /* đại diện cho số lượng phần tử trong mảng con bên phải.
        Vị trí phần tử giữa mid + 1 là một trong số các phần tử trong mảng con bên phải.*/

        /* chia mảng gốc thành mảng con "n1" là mảng con bên trái
        "n2 "là mảng con bên phải
        */

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        // leftArr and rightArr là hai mảng tạm thời lưu các mảng con phân tử đã chia
        System.arraycopy(arr, left + 0, leftArr, 0, n1);
        //để sao chép các phần tử từ mảng gốc arr vào mảng tạm leftArr.
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
            //Vòng lặp này sao chép các phần tử từ mảng gốc arr vào mảng tạm rightArr, bắt đầu từ vị trí mid + 1.

        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                /*leftArr và rightArr để trộn chúng lại thành mảng
                arr.leftArr[i] nhỏ hơn hoặc bằng rightArr[j], chúng ta đặt arr[k] bằng leftArr[i] và tăng i.
                Biến i và j là chỉ số của leftArr và rightArr tương ứng.
                */
                arr[k] = leftArr[i];
                i++;
                //arr[k] bang leftArr[i] va tang i
            } else {
                arr[k] = rightArr[j];
                j++;
                //arr[k] bằng rightArr[j] và tăng j.
            }
            k++;
            /* sau moi lan gan tri cho arr[k] chung tang k de dam bao k ghi de len cac pha tu da tron*/
        }
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
            /* su dung vong lap while duyet cac phân từ mảng con bên trái đưa vào mảng arr
            và i cho biết vị trí phần tử hiện tại trong mảng con bên trái.
            k cho biết vị trí mà chúng ta muốn đặt phần tử từ mảng con vào mảng kết quả.
            */
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
            /*su dung vong lap while duyet cac phân từ mảng con bên phai đưa vào mảng arr
            j cho biết vị trí phần tử hiện tại trong mảng con bên trái.
            k cho biết vị trí mà chúng ta muốn đặt phần tử từ mảng con vào mảng kết quả
            */
        }
    }
}
