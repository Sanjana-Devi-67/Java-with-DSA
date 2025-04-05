public class QueueArray {
    static class Queue {
         static int[] arr;
         static int size;
         static int rear, front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
           front = -1;  //  // Initialize front for circular queue
        }

        // Normal Queue Methods
        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int frontValue = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];  // Shift elements left
            }
            rear--;
            return frontValue;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }

        // Circular Queue Methods
        public boolean isEmptyCQ() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void addCQ(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {  // First element added
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int removeCQ() {
            if (isEmptyCQ()) {
                System.out.println("Empty queue");
                return -1;
            }
            int res = arr[front];
            if (rear == front) {  // Last element removed
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;
        }

        public int peekCQ() {
            if (isEmptyCQ()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        // Circular Queue Operations
        q.addCQ(1);
        q.addCQ(2);
        q.addCQ(3);
        System.out.println(q.remove());
        q.addCQ(4);
        System.out.println(q.remove());
        q.addCQ(5);
        while (!q.isEmptyCQ()) {
            System.out.print(q.peekCQ() + " ");
            q.removeCQ();
        }
    }
}
