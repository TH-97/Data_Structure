public class BubbleSort {
    private long[] arr;
    private int size;

    public static void main(String[] args) {
        int maxSize = 100; // array size
        BubbleSort arr = new BubbleSort(maxSize); // create the a
        // insert 10 items
        arr.insert(77);
        arr.insert(99); arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);
        arr.display();
        arr.bubbleSort();
        arr.display();
    }

    BubbleSort(int maxSize){
        arr = new long[maxSize];
        size = 0;
    }
    public void insert(int value){
        arr[size] = value;
        size++;
    }
    public void display(){
        for(long i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public void bubbleSort(){
        for(int out = size - 1; out > 1; out--) {
            for(int in = 0; in < out; in++) {
                if(arr[in] > arr[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }
    private void swap(int one, int two) {
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
