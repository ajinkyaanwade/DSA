package Examples;

import java.util.Scanner;

public class Sliding_Window
{

        public class Linear_Queue
    {
        int MaxSize,rear,front,queue[];
        void createQueue(int size)
        {
            MaxSize=size;
            queue=new int[MaxSize];
            front= 0;
            rear=-1;
        }
        void enqueue(int e)    //Entry On Queue
        {
            rear++;
            queue[rear]=e;
        }
        boolean is_full()
        {
            if(rear==MaxSize-1)
                return true;
            else
                return false;
        }
        int dequeue() //
        {
            return queue[front++];
        }
        boolean is_empty()
        {
            if(front>rear)
                return true;
            else
                return false;
        }
        void print_Queue()
        {
            for(int i=front;i<=rear;i++)
                System.out.println(queue[i]);
        }
        void sliding_window(int size)
        {
            if((rear-front+1)<size)
            {
                int max=queue[front];
            }
            for(int i=front;i<=rear;i++)
                System.out.println(queue[i]);
        }
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter size of queue:");
            int size = in.nextInt();
            Examples.Linear_Queue obj = new Examples.Linear_Queue();
            obj.createQueue(size);
            int ch;
            do {
                System.out.println("\n1.enqueue\n2.dequeue\n3.Print\n0.Exit\n:");
                ch = in.nextInt();//read
                switch (ch) {
                    case 1:
                        if (!obj.is_full()) {
                            System.out.println("\nEnter a number:");
                            int no = in.nextInt();
                            obj.enqueue(no);
                            System.out.println("Pushed " + no);
                        } else
                            System.out.println("queue is Full");
                        break;
                    case 2:
                        if (!obj.is_empty()) {
                            System.out.println("dequeue " + obj.dequeue());
                        } else
                            System.out.println("queue is Empty");
                        break;
                    case 3:
                        if (!obj.is_empty()) {
                            System.out.println("Elements in queue are");
                            obj.print_Queue();
                        } else
                            System.out.println("queue is Empty");
                        break;
                    case 0:
                        System.out.println("Exiting");
                        break;
                    default:
                        System.out.println("Wrong Choice");
                        break;
                }
            } while (ch != 0);
        }
    }

}
