package mypack;
import java.util.*;
public class Reversed_Stack
{
    int stack[],tos,MaxSize;

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

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size");
        int size=sc.nextInt();
        Reversed_Stack stack=new Reversed_Stack();
        Reversed_Stack reversed=new Reversed_Stack();
        stack.createStack(size);
        reversed.createStack(size);
        while(!stack.is_full())
        {
            System.out.println("Enter a number");
            int num=sc.nextInt();
            stack.push(num);
        }
        System.out.println("Numbers Inside Stack is: ");
        stack.print_stack();
        System.out.println("Numbers inside Reversed Stack is: ");
        while(!reversed.is_full())
        {
            reversed.push(stack.pop());
        }
        reversed.print_stack();
    }
}
