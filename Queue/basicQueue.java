package Queue;

public class basicQueue {

    private int maxSize;
    private int front;
    private int rear;
    private int currentSize;

    private int queueArray[];

    basicQueue(int maxSize) {

        this.maxSize = maxSize;
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
        this.queueArray = new int[maxSize];
    }

    public void enQueue(int data) {
        // Checking if queue is full before inserting new item

        if (isQueueFull()) {
            throw new RuntimeException("Queue is Full!");
        }

        // We have to wrap the queue in case maxSize has reached
        if (rear == maxSize - 1) {
            rear = -1;
        }

        queueArray[++rear] = data;
        System.out.print("Enqued: " + data + "\t");
        currentSize++;
        printQueue();
    }

    public int deQueue() {
        // Checking if queue is empty before removing new item
        if (isQueueEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }

        int result = queueArray[front++];
        System.out.print("> Dequed: " + result + "\t");

        // We have to wrap the queue in case maxSize has reached

        if (front == maxSize) {
            front = 0;
        }
        currentSize--;
        printQueue();
        return result;
    }

    private boolean isQueueEmpty() {
        return currentSize == 0;
    }

    private boolean isQueueFull() {
        return maxSize == currentSize;
    }

    public void printQueue() {
        System.out.print("Size: "+ currentSize+"\t\t");
        System.out.print("Current Queue: [ ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println("]");
    }

    public int size() {
        return currentSize;
    }

    public static void main(String[] args) {

        basicQueue queue = new basicQueue(10);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.enQueue(70);

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
    }
}