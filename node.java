class node{
    private boolean visited;

    node(){
        visited=false;
    }

    public void visit(){
        visited=true;
    }

    public void unvisit(){
        visited=false;
    }

    public boolean visited(){
        return visited;
    }
}
