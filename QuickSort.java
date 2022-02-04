public class QuickSort {

    int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j > low) {
                j--;
            }
            if (i < j) {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (i == j) {
                return j;
            }
        }
        return j;
    }

    void sort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int temp;
        int pi = partition(arr, low, high);
        temp = arr[low];
        arr[low] = arr[pi];
        arr[pi] = temp;

        sort(arr, low, pi - 1);// lower half

        sort(arr, pi + 1, high);// higher half
    }

    public static void out(Object o) {
        System.out.print(o.toString());
    }

    void printArray(int[] a) {
        for (int i : a) {
            out(i + ", ");
        }
        out("\n");
    }

    public static void main(String args[]) {
        QuickSort q = new QuickSort();
        int[] arr = { 20, 10, 91, 14, 51, 79, 26, 88, 35, 48, 99, 78, 43, 45, 18, 27, 55, 67, 73, 12, 64, 1, 17, 25,
                70 };
        q.sort(arr, 0, arr.length - 1);
        q.printArray(arr);
    }

}
