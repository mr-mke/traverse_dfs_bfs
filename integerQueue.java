import java.util.*;

/*  Class arrayQueue  */

class integerQueue{

    protected int Queue[] ;
    protected int front, rear, size, len;

    /* Constructor */
    public integerQueue(int n){
        size = n;
        len = 0;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }    

    /*  Function to check if queue is empty */
    public boolean isEmpty(){
        if(front == -1)
            return true;
        else
            return false;
    }    

    /*  Function to check if queue is full */
    public boolean isFull(){
        if(front==0 && rear == size -1)
            return true;
        else
            return false;
    }    

    /*  Function to get the size of the queue */
    public int getSize(){
        return len ;
    }    

    /*  Function to check the front element of the queue */
    public int peek(){
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        return Queue[front];
    }    

    /*  Function to insert an element to the queue */
    public void insert(int element){
        int i;
        if(rear == -1){
            front = 0;
            rear = 0;
            Queue[rear] = element;
        }
        else if (rear + 1 >= size && front > 0){
            for(i=front;i<=rear;i++)
                Queue[i-front]=Queue[i];
            rear=rear-front;
            front=0;
            Queue[++rear] = element;
        }
        else if (rear + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( rear + 1 < size)
            Queue[++rear] = element;    
        len++ ;    
    }

    /*  Function to remove front element from the queue */
    public int remove(){
        int element;
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        else{
            len-- ;
            element = Queue[front];
            if ( front == rear){
                front = -1;
                rear = -1;
            }else
                front++;                
            return element;
        }        
    }

    /*  Function to display the status of the queue */

    public void display(){
        int i;
        System.out.print("\nQueue = ");
        if (len == 0){
            System.out.print("Empty\n");
            return ;
        }
        System.out.print(Arrays.toString(Queue));
    }
}
