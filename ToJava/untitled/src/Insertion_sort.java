public class Insertion_sort {
    private long[] arr;
    private int n;

    public Insertion_sort(int max){
        arr = new long[max];
        n = 0;
    }
    public void insert(long value){
        arr[n] = value;
        n++;
    }
    public void display(){
        for(long i : arr) System.out.print(i + " ");
        System.out.println();
    }
    public void insertionSort(){
        int in;
        for(int i = 0; i< n; i++){
            long temp = arr[i];
            in = i;
            while (in > 0 && arr[in -1] >= temp){
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;

        }
    }

    public static void main(String[] args) {
        int max = 100;
        Insertion_sort arr = new Insertion_sort(max);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();
        arr.insertionSort();
        arr.display();
    }

}
