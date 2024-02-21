public class Graph {
    public static void main(String[] args) {
        //인접 행렬
        int[][] edges = new int[][] {
                {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 5}, {4, 5}
        };

        int n = 5; //정점의 개수

        int[][] AdjacentGraph = new int[edges.length][edges.length];

        for(int[] edge : edges) {
            AdjacentGraph[edge[0]][edge[1]] = 1;
            AdjacentGraph[edge[1]][edge[0]] = 1;
        }

        //출력
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n ; j++) {
                System.out.print(AdjacentGraph[i][j]+" ");
            }
            System.out.println();
        }
    }
}
