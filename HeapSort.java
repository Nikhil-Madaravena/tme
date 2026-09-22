import java.util.ArrayList;
import java.util.List;

public class HeapSort {
    public static void heapify(List<Integer> heap, int i, int n){
        int mi = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && heap.get(mi) < heap.get(left)){
            mi = left;
        }
        if(right<n && heap.get(mi) < heap.get(right)){
            mi = right;
        }
        if(mi!=i){
            int temp = heap.get(mi);
            heap.set(mi, heap.get(i));
            heap.set(i, temp);
            heapify(heap,mi,n);
        }
    }

    public static void heapifyArr(List<Integer> heap){
        int l = heap.size()/2-1;
        for(int i=l; i>=0; i--){
            heapify(heap, i, heap.size());
        }
    }

    public static void heapSort(List<Integer> arr){

        heapifyArr(arr);

        for(int i=arr.size()-1; i>0; i--){

            int temp = arr.get(0);
            arr.set(0,arr.get(i));
            arr.set(i, temp);

            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(23,45,20,2,54,34,67,87));

        heapSort(arr);
        System.out.println(arr);
    }
}

/*
arrays
strings
bit manipulation
recurison
two pointer and sliding window
sorting techniques
linked lists
stacks and queues
trees
graphs
DP
heaps
tries

 40 problems
 */
