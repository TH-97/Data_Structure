class Select_sort{
    int size = 1;
    private long[] arr;
    public Select_sort(int maxSize){
        this.arr = new long[maxSize];
    }
    public void insert(long value){
        arr[size - 1] = value;
        size++;
    }
    public void display(){
        for(long i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public void selectionSort(){
        int out, in, min;
        for(out=0; out<arr.length; out++) {
            min = out;
            for(in=out+1; in<arr.length; in++)
                if(arr[in] < arr[min] ) min = in;
            swap(out, min);
        }
    }
    private void swap(int one, int two) {
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
class SelectSortApp{
    public static void main(String[]args) {
        int maxSize = 100;
        Select_sort arr = new Select_sort(maxSize);
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
        arr.selectionSort();
        arr.display();
    }
}