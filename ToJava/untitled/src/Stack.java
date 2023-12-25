class Stack {
    static int size = 0;
    static long[] arr;
    Stack(){
        arr = new long[size];
    }
    public void display(){
        for(long i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public void push(long value){
        long[] arr2 = new long[size + 1];
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        arr2[size] = value;
        arr = arr2;
        size++;
    }
    public void peek(){
        try {
            System.out.println(arr[size]);
        }catch (Exception e){
            System.out.println("NoSuchElementException");
            e.printStackTrace(); //예외정보 출력
        }
    }
    public void pop(){
        long result = arr[arr.length-1];
        long[] arr2 = new long[arr.length-1];
        for(int i = 0 ; i < arr.length-1;i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
        System.out.println("지워진 값: " +result);
        size--;
    }
    public boolean empty(){
        return arr.length == 0;
    }
    public int search(int value){
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == value)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        System.out.println(stack.empty());
        stack.pop();
        System.out.println(stack.search(1));
        System.out.println(stack.search(4));
    }

}
