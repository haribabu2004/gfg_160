package subarray;

public class Premutatin {

    public static int[] permute(int arr[]) {

        int len = arr.length;
        int pivot = -1;
        for (int i = len - 2; i >= 0; i--) {
            if (arr[i + 1] > arr[i]) {
                pivot = i ;
                break;
            }
        }

        if (pivot == -1) {
            reverse(arr, 0, len - 1);
            return arr;
        }
        

        // rightmost element greater then pivot

        for (int j = len-1;j>pivot; j--) {
            if (arr[j] > arr[pivot]) {
                swap(arr, j, pivot);
                break;
            }
        }

        reverse(arr, pivot+1,len-1);

        return arr;
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left++, right--);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,6,5,4 };
        permute(arr);
        System.out.println();

        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
