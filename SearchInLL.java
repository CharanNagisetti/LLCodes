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
class SearchInLL{
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
        System.out.print("Enter the element that you want to find: ");
        int x=sc.nextInt();
        if(findEle(x,head)) System.out.println("Element is present in LL");
        else System.out.println("Element is not present in LL");
        sc.close();
    }
    public static boolean findEle(int x, Node head){
        Node temp=head;
        while(temp!=null){
            if(temp.val==x) return true;
            temp=temp.next;
        }
        return false;
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