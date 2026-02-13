import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x, Node next){
        this.val=x;
        this.next=next;
    }
    public Node(int x){
        this.val=x;
        this.next=null;
    }
}
public class FindLengthLL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        Node head=createLL(l);
        printNode(head);
        System.out.println();
        System.out.print("Length of current LL is: ");
        int size=getSize(head);
        System.out.println(size);
        sc.close();
    }
    public static int getSize(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public static Node createLL(List<Integer> l){
        Node head=null;
        Node curr=null;
        for(int x: l){
            if(head==null){
                head=new Node(x);
                curr=head;
                continue;
            }
            curr.next=new Node(x);
            curr=curr.next;
        }
        return head;
    }
    public static void printNode(Node head){
        Node temp=head;
        while(temp!=null){
            int val=temp.val;
            if(temp.next==null){
                System.out.print(val);
                break;
            }
            System.out.print(val+"->");
            temp=temp.next;
        }
    }
}
