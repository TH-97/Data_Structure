import java.util.Iterator;
import java.util.LinkedList;

//모든 정점을 방문해야 하는 문제, 경로의 특징을 저장해야 하는 문제, 최단 거리를 구해야 하는문제
//시간복잡도가 낮다


//인접리스트 이용
public class BFS {
    private int V;
    private LinkedList<Integer> adj[];

    BFS(int v){
        V = v;
        adj = new LinkedList[v];

        for(int i = 0; i< v; i++){
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int v, int w) { adj[v].add(w); }
    // BFS
    void BFSGO(int s){
        boolean visited[] = new boolean[V]; //방문여부 확인
        LinkedList<Integer> queue = new LinkedList<>(); //연결리스트 생성

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0){
            //방문한 노드를 큐에서 뽑아내서 출력
            s = queue.poll();
            System.out.println(s + " ");

            //방문한 노드와 인접한 노드 모두 가져온다
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                //방문하지 않은 노드라면 방문한 것으로 표시하고 queue에 삽입
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}














