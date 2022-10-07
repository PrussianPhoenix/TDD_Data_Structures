public class Queue {
    int front, rear, waiting;
    int capacity;
    int []supermarket;

    public Queue(int cashiers) {
        capacity = cashiers;
        supermarket = new int[cashiers];
    }

    public boolean isEmpty(){
        return waiting == 0;
    }

    public int getSize(){
        return waiting;
    }

    public int getFront(){
        return supermarket[front];
    }

    public int enqueue(int number){
        if (waiting == capacity) {
            return 0;
        }
        supermarket[rear] = number;
        rear +=1;
        waiting += 1;
        return 1;
    }

    public int dequeue(){
        if (isEmpty()) {
            return 0;
        }
        int data = supermarket[front];
        for (int i = 0; i < waiting; i++) {
            supermarket[i] = supermarket[i+1];
        }
        waiting -= 1;
        rear -= 1;
        return data;
    }


}
