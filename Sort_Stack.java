package mypack;
import java.util.*;
public class Sort_Stack
{
    int stack[];
    int tos,MaxSize;

    void createStack(int size)
    {
        stack=new int[size];
        MaxSize=size;
        tos=-1;
    }
    void push(int e)
    {
        tos++;
        stack[tos]=e;
        //or stack[++tos]=e;
    }
    int pop()
    {
        int temp=stack[tos];
        tos--;
        return(temp);
    }
    int peek()
    {
        return(stack[tos]);
    }
    boolean is_full()
    {
        if(tos==MaxSize-1)
            return true;
        else
            return false;
    }
    boolean is_empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
    }

    void print_stack()
    {
        for(int i=tos;i>-1;i--)
            System.out.println(stack[i]);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = sc.nextInt();

        Sort_Stack stack = new Sort_Stack();
        Sort_Stack sortedStack = new Sort_Stack(); // Additional stack for sorting

        stack.createStack(size);
        sortedStack.createStack(size);
        while (!stack.is_full()) {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            stack.push(num);
        }

        System.out.println("Numbers Inside Stack: ");
        stack.print_stack();

        // Sort the stack
        while (!stack.is_empty()) {
            int temp = stack.pop();
            // Pop elements from the sortedStack and push them back onto the stack
            while (!sortedStack.is_empty() && sortedStack.peek() > temp) {
                stack.push(sortedStack.pop());
            }
            sortedStack.push(temp);
        }

        System.out.println("Numbers Inside Sorted Stack: ");
        sortedStack.print_stack();
    }

}
