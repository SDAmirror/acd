package kz.aitu.week44.queue;



public class Main {
    public static void main(String[] args) {
    Queue queue = new Queue();

        queue.add(56);
        queue.add(13);
        queue.add(22);
        queue.add(56);
        queue.add(13);
        queue.add(22);

        queue.delete(3);
        System.out.println();

    }
}

