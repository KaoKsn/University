// Multithreading & The Producer-Consumer problem.
class Buffer
{
    static final int BUFFER_SIZE = 10; 
    int arr[], front, rear;
    public Buffer()
    {
        this.arr = new int[BUFFER_SIZE];
        this.front = 0;
        this.rear = 0;
    }
    public synchronized void put(int value) throws InterruptedException
    {
        while (front == (rear + 1) % arr.length)
            wait();
        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        notify(); /* Notify consumer that a value in the stack exists. */
    }
    public synchronized int get() throws InterruptedException
    {
        // If the stack is empty, wait().
        while (front == rear)
            wait();
        front = (front + 1) % arr.length;
        int returnValue = arr[front];
        notify(); /* Notify producer that an empty spot exists. */
        return returnValue;
    }
}
class Producer implements Runnable
{
    String name;
    Thread t;
    Buffer stack;
    public Producer(Buffer stack)
    {
        this.name = "producer";
        t = new Thread(this, name);
        this.stack = stack;
    }

    @Override
    public void run()
    {
        int i = 0;
        try {
            while (true) {
                System.out.println(name + " produced: " + i);
                stack.put(i++);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
class Consumer implements Runnable
{
    String name;
    Thread t;
    Buffer stack;
    Consumer(Buffer stack)
    {
        this.name = "consumer";
        t = new Thread(this, name);
        this.stack = stack;
    }

    @Override
    public void run()
    {
        try {
            while (true) {
                System.out.println(name + " consumed: " + stack.get());
                Thread.sleep(3000);
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
class producerConsumer
{
    static {
        System.out.println("Ctrl + C to quit!");
    }
    public static void main(String args[])
    {
        Buffer stack = new Buffer();

        Producer producer = new Producer(stack);
        Consumer consumer = new Consumer(stack);

        producer.t.start();
        consumer.t.start();

        try{
            producer.t.join();
            consumer.t.join();
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
        return;
    }
}
