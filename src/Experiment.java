public class Experiment {
    public void runTraversals(Graph g) {
        long start;
        long end;

        start = System.nanoTime();
        g.bfs(0);
        end = System.nanoTime();

        System.out.println("BFS Time: " + (end - start) + " ns");

        start = System.nanoTime();
        g.dfs(0);
        end = System.nanoTime();

        System.out.println("DFS Time: " + (end - start) + " ns");
    }

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};

        for (int size : sizes) {

            System.out.println("\n Graph size: " + size);

            Graph g = new Graph();
            for (int i = 0; i < size; i++) {
                g.addVertex(new Vertex(i));
            }
            for (int i = 0; i < size - 1; i++) {
                g.addEdge(i, i + 1);

                if (i + 2 < size) {
                    g.addEdge(i, i + 2);
                }
            }
            if (size == 10) {
                g.printGraph();
            }
            runTraversals(g);
        }
    }

    public void printResults() {
        System.out.println("\nExperiments completed.");
    }
}
