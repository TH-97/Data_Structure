public class Binary_Search {
    static int[] arr = {1 ,2, 4, 9 ,10, 15, 20, 50, 65, 92};

    public static void main(String[] args) {
        double beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        System.out.println("재귀함수를 이용한 이진 탐색");
        System.out.println("찾는 값의 인덱스: " + binary_Search(4,0,arr.length-1));
        double afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        double secDiffTime = (afterTime - beforeTime) / 10000; //두 시간에 차 계산
        System.out.println("걸린시간(m) : "+secDiffTime);

        System.out.println();
        double beforeTime2 = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        System.out.println("반복문을 이용한 이진 탐색");
        System.out.println("찾는 값의 인덱스: " + binary_Search2(4,0,arr.length-1));
        double afterTime2 = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        double secDiffTime2 = (afterTime2 - beforeTime2) / 10000; //두 시간에 차 계산
        System.out.println("걸린시간(m) : "+secDiffTime2);
    }
    //재귀함수를 이용한 이진탐색
    static int binary_Search(int target, int start, int end){
        int mid;

        //조건을 <= 을 잡는 이유는 찾는 배열의 값이 홀수일수도 짝수 일수도 있어서 이다
        if(start <= end){
            mid = (start + end) / 2;

            if(target == arr[mid]){
                return mid;
            } else if(target < arr[mid]){
                return binary_Search(target,start,mid -1); //mid에 -1을 해주는 이유는 중간지점인 mid는 찾는값이 아니고
                                                                    // target 보다 값이 낮기 때문에 end를 기준을 mid-1로 잡아준다
            } else if(target > arr[mid]){
                return binary_Search(target, mid +1, end);
            }
        }
        return -1; //탐색 실패 if(start <= end) 결국 target을 찾지 못하였기 때문에
    }
    //반복문을 이용한 이진탐색
    static int binary_Search2(int target, int start, int end){
        int mid;

        while (start <= end){
            mid = (start + end) / 2;

            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}
