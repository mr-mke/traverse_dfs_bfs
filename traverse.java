import java.util.*;

class traverse{
    public static void main(String[] args){
        int number_of_nodes, source;
        graph Graph;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nodes in the graph");
        number_of_nodes = scanner.nextInt();
        int adjacency_matrix[][] = new int[number_of_nodes][number_of_nodes];
        Graph = new graph(adjacency_matrix);

        System.out.println("Enter the adjacency matrix");
        for (int i = 0; i < number_of_nodes; i++)
            for (int j = 0; j < number_of_nodes; j++)
                adjacency_matrix[i][j] = scanner.nextInt();

        System.out.println("Enter the source for the graph");
        source = scanner.nextInt(); 

        System.out.println("The DFS Traversal for the graph is given by ");
        Graph.traverse_dfs(source);
        Graph.print_dfs_path();
        System.out.println("");
        scanner.close();
    }
}
