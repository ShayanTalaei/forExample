import java.util.*;
import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n = scanner.nextInt();
        int i;
        int vertex1;
        int vertex2;
        boolean[][] adj = new boolean[12][12];

        for (i = 0; i < n; i++) {
            vertex1 = scanner.nextInt();
            vertex2 = scanner.nextInt();
            adj[vertex1][vertex2] = true;
            adj[vertex2][vertex1] = true;
        }
        boolean visited[] = new boolean[12];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        int graphPointer = 1;
        visited[graphPointer] = true;
        queue.add(graphPointer);
        int[] tabaghe = new int[12];
        while (queue.size() != 0) {
            graphPointer = queue.poll();
            for( int nextIterator=1; nextIterator < 12; nextIterator++) {
                if (!visited[nextIterator] && adj[nextIterator][graphPointer]) {
                    visited[nextIterator] = true;
                    queue.add(nextIterator);
                    tabaghe[nextIterator] = tabaghe[graphPointer] + 1;
                }
            }
        }

        if( tabaghe[11] == 0) {
            System.out.println(0);
        }
        else{
            System.out.println(90 / (tabaghe[11] * t));
        }


    }

}