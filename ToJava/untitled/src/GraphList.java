import java.util.ArrayList;

public class GraphList {
    public static void main(String[] args) {
        int[][] edges = new int[][] {
                {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 5}, {4, 5}
        };

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0 ; i <= edges.length ; i++) list.add(new ArrayList<>());

        for(int[] edge : edges) {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }

        //출력
        for (int i = 1; i < list.size(); i++) {
            for(int j = 0 ; j < list.get(i).size(); j++)
                System.out.print(list.get(i).get(j)+" ");
            System.out.println();
        }
    }
}
