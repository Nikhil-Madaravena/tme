import java.util.*;
public class Heap{
    public static void heapify(List<Integer> heap, int i){
        int mi = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<heap.size() && heap.get(mi) < heap.get(left)){
            mi = left;
        }
        if(right<heap.size() && heap.get(mi) < heap.get(right)){
            mi = right;
        }
        if(mi!=i){
            int temp = heap.get(mi);
            heap.set(mi, heap.get(i));
            heap.set(i, temp);
            heapify(heap,mi);
        }
    }

    public static void insert(List<Integer> heap, int element){
        heap.add(element);
        int l = heap.size()/2-1;
        for(int i=l; i>=0; i--){
            heapify(heap, i);
        }
    }


    public static void delete(List<Integer> heap){

        int temp = heap.get(0);
        heap.set(0,heap.get(heap.size() - 1));
        heap.set(heap.size() - 1,temp);

        heap.remove(heap.size()-1);

        heapify(heap, 0);
        
    }


    public static void heapifyArr(List<Integer> heap){
        int l = heap.size()/2-1;
        for(int i=l; i>=0; i--){
            heapify(heap, i);
        }
    }



    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(23,45,20,2,54,34,67,87));
        // heapify(arr);
        System.out.println("Original array: " + arr);
        ArrayList<Integer> heap = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++){
            insert(heap, arr.get(i));
        }
        System.out.println(heap);
        delete(heap);
        System.out.println(heap);
    }
}