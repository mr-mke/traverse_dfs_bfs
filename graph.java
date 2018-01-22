import java.util.*;

class graph{
    private node nodes[];
    private Stack<Integer> dfs_path;
    private Stack<Integer> bfs_path;
    private integerQueue nodes_to_visit;
    private int number_of_nodes;
    private int adjacency_matrix[][];

    graph(int adjacency_matrix[][]){
        int i;
        this.adjacency_matrix=adjacency_matrix;
        number_of_nodes = this.adjacency_matrix[1].length;
        nodes = new node[number_of_nodes];
        for(i=0;i<number_of_nodes;i++)
            nodes[i]=new node();
        dfs_path= new Stack<Integer>();
        bfs_path= new Stack<Integer>();
        nodes_to_visit = new integerQueue(number_of_nodes);
    }
	
    public void traverse_dfs(int node_num){
        int next=0;
        while(next != -1){
            if(!nodes[node_num].visited()){
                nodes[node_num].visit();
                dfs_path.push(new Integer(node_num+1));
            }
            next=get_next_unvisited_node(node_num);
            if(next != -1)
                traverse_dfs(next);
        }
    }    
    
	public void traverse_bfs(int node_num){
        
	}

    public void print_dfs_path(){
        System.out.println(dfs_path);
        reset_nodes();
    }
    
    public void print_bfs_path(){
        System.out.println(bfs_path);
        reset_nodes();
    }

    private int get_next_unvisited_node(int node_num){
        int i;
        for(i=0;i<number_of_nodes;i++){
            if(adjacency_matrix[node_num][i]==1 && nodes[i].visited() != true){
                return i;
            }
        }
        return -1;
    }

    private void reset_nodes(){
        int i;
        for(i=0;i<number_of_nodes;i++)
            nodes[i].unvisit();
    }
}
