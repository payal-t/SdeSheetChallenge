package linkedList;
// 1.) brute force approach:== hashing approach
class Node {
    int num;
    Node next;
    Node(int val) {
        num=val;
        next=null;
    }
}
public class cycleDetection {

    //utility fun to insert a node
    static node insertNode(Node head,int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
            return head;
        }
        Node temp=head;
        while (temp.next!=null)
            temp=temp.next;
            temp.next=newNode;
            return head;
    }

    //utility fun to create a cycle
    static node createCycle(Node head,int a,int b)
    {
        int cnta=0,cntb=0;
        Node p1=head;
        Node p2=head;
        while (cnta != a || cntb != b)
        {
            if()
        }


    }






}
