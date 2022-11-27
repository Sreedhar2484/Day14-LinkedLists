import java.util.LinkedList;

// A LL node to store queue entry
class QNode{
    int key;
    QNode next;
    public QNode(int key){
        this.key = key;
        this.next = null;
    }
}

public class Queue {
    QNode front, rear;
    public Queue(){
        this.front = this.rear = null;
    }
    // method to add an key to queue
    void enqueue(int key) {
        // craete a new LL node
        QNode temp = new QNode(key);
        if(this.rear == null){
            this.front = this.rear = temp;
            return;
        }
        // add the new node at end and change to rear
        this.rear.next = temp;
        this.rear = temp;

    }
    void dequeue(){
        if(this.front==null)
             return;
        // store previous front and move front one node
        QNode temp = this.front;
        this.front = this.front.next;
        //if front becomes null, then change raer also null
        if(this.front==null)
              this.rear = null;
    }

    
    public static void main(String args[]){
        Queue q = new Queue();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        System.out.println(q.front.key);
        System.out.println(q.rear.key);
        

    }
    
}
