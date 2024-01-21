public class Que {
    static int size = 0;
    static long[] arr;
    Que(){
        arr = new long[size];
    }
    public void display(){
        for(long i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public boolean add(long value){
        try {
            long[] arr2 = new long[size + 1];
            for(int i = 0; i < arr.length; i++){
                arr2[i] = arr[i];
            }
            arr2[size] = value;
            arr = arr2;
            size++;
            return true;
        }catch (Exception e){
            System.out.println("IllegalStateException");
            e.printStackTrace(); //예외정보 출력
            return false; //??이게 맞나?
        }
    }
    public boolean offer(long value){
        try {
            long[] arr2 = new long[size + 1];
            for(int i = 0; i < arr.length; i++){
                arr2[i] = arr[i];
            }
            arr2[size] = value;
            arr = arr2;
            size++;
            return true;
        }catch (Exception e){
            e.printStackTrace(); //예외정보 출력
            System.out.println("false");
            return false;
        }
    }
    public Object remove(){
        try {
            long value = arr[0];
            int count =0;
            long[] arr2 = new long[size-1];
            for(int i = 1; i < arr.length; i++){
                arr2[count] = arr[i];
                count++;
            }
            arr = arr2;
            size++;
            count = 0;
            return value;
        }catch (Exception e){
            System.out.println("NoSuchElementException");
            e.printStackTrace(); //예외정보 출력
            return null;
        }
    }
    // 여기 하는중
    public boolean remove(long value) {
        int rem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                rem = i;
            }
        }
        if(rem == 0) return false;
        int count = 0;
        long[] arr2 = new long[size - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i == rem){

                continue;
            }
            arr2[count] = arr[i];
            count++;
        }
        arr = arr2;
        return true;
    }
    public Object poll(){
            if(arr.length == 0) return null;
            long value = arr[0];
            int count =0;
            long[] arr2 = new long[size-1];
            for(int i = 1; i < arr.length; i++){
                arr2[count] = arr[i];
                count++;
            }
            arr = arr2;
            count = 0;
            return value;
    }
    public void element(){
        try {
                System.out.println(arr[0]);

        }catch (Exception e){
            System.out.println("NoSuchElementException");
            e.printStackTrace(); //예외정보 출력
        }
    }
    public Object peek(){
        if(arr.length != 0) return arr[0];
        return null;
    }
    public void clear(){
        arr = new long[0];
    }
    public void size(){
        System.out.println(arr.length);
    }
    public boolean contains(long value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value) return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(arr.length == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Que q = new Que();
        q.add(1);
        q.offer(2);
        q.display();
        q.add(3);
        q.add(4);
        q.remove();
        q.remove(3);
        q.display();

    }

}

