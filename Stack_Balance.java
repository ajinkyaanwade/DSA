package mypack;
import java.util.*;
public class Stack_Balance
{
    char stack[];
    int tos,MaxSize;

    void createStack(int size)
    {
        stack=new char[size];
        MaxSize=size;
        tos=-1;
    }
    void push(char e)
    {
        tos++;
        stack[tos]=e;
        //or stack[++tos]=e;
    }
    char pop()
    {
        char temp=stack[tos];
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
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Sequence to test");
        String line=in.nextLine();
        Stack_Balance sb=new Stack_Balance();
        sb.createStack(line.length());
        boolean flag=true;
        for(int i=0;i<line.length();i++)
        {
            char c=line.charAt(i);
            if(c=='{')
                sb.push(c);
            else if(c=='}')
            {
                if (!sb.is_empty())
                {
                    char temp = sb.pop();
                }
                else
                {
                    System.out.println("} is unexpected");
                    flag=false;
                }
            }
        }
        if(!sb.is_empty())
        {
            System.out.println("} is excepted");
        }
        else if(flag)
        {
            System.out.println("perfectly balance");
        }
    }
}
