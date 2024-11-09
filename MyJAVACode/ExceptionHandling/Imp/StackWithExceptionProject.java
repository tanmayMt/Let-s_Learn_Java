package Imp;
import Node;

class StackException1 extends Exception{
    public StackException1(String message) {
        super(message);
    }
}

class Node
{
    int info;
    Node link;
    Node(int info){
        this.info=info;
        this.link=null;
    }
}

class Stack1
{
    int len,cap;
    Node head;
    Node temp;
    public Stack1(int cap)
    {
        int len=0;
        this.cap=cap;
        this.head=null;
    }
    public void push(int n) throws StackException1
    {
        if(len==cap)
          throw new StackException1("Stack Overflow");
        this.temp= new Node(n);
        temp.link=head;
        this.head=temp;
        len++;
    }
    public void pop() throws StackException1
    {
        if(len==0)
          throw new StackException1("Stack Underflow");
        this.temp=this.head;
        this.head=this.head.link;
        this.temp.link=null;
        len--;
    }
    public void dis()
    {
        this.temp=head;
        while(this.temp!=null){
            System.out.print(this.temp.info);
            this.temp=this.temp.link;
        }
        System.out.println();
    }
}
public class StackWithExceptionProject 
{
    public static void main(String[] args) {
        Stack1 s = new Stack1(3);
        try {
            s.push(4);
            s.push(2);
            s.push(7);
            s.dis();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.dis();

        } catch (StackException1 e) {
            System.out.println(e);
        }

    }
}
