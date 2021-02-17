package Queue;

import java.security.spec.RSAOtherPrimeInfo;

public class queue {
    int arr[]; // delcaration //instance variable
    int beginning;
    int top;

    public queue(int size)
    {
        arr=new int[size]; //creation of array
        beginning=-1;
        top=-1;

    }
    public boolean isEmpty()
    {
        if(beginning==-1||beginning==arr.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isfull()
    {
        if(top==arr.length-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public  void enqueue(int value)
    {
        if(isfull())
        {
            System.out.println("full/overflow");
        }
        else if(isEmpty())
        {
            beginning=0;
            top++;
            arr[beginning]=value;
        }
        else {    top++;
            arr[top] = value;
        }
    }
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            System.out.println(arr[beginning]);
            arr[beginning]=0;
            beginning++;
        }
        if(beginning>arr.length)
        {
            beginning=top=-1;
        }
    }
    public  void peeklnQueue()
    {
        if(isEmpty())
        {
            System.out.println("no values");
        }
        else
        {
            System.out.println(arr[top]);
        }
    }
    public  void traverse()
    {
        int temp=beginning;
        while(temp<=top)
        {
            System.out.println(arr[temp]);
            temp++;
        }
    }
    public void deleteQueue()
    {
        arr=null;
        System.out.println("queue deleted");
    }
}
class queuemain
{
    public static void main(String args[])
    {
        queue obj=new queue(10);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.traverse();
        obj.dequeue();
        System.out.println("==============");
        obj.traverse();
    }
}
