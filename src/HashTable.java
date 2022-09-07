import java.util.ArrayList;

    public class HashTable {
    int slots;
    int size;
    ArrayList<HashNode>buckets;



    public HashTable() {
        size=0;
        slots =5;
        buckets=new ArrayList<>();
        for (int i = 0; i < slots; i++) {
            buckets.add(null);
        }
    }

    public int size(){
        return size;

    }
    public boolean isEmpty(){
        return size()==0;
    }
    public int getIndex(String key){
       int hashCode=key.hashCode();
       int index=hashCode%slots;
       return index;

    }
    public void insert(String key,int data){
        int hashIndex=getIndex(key);
        HashNode head=buckets.get(hashIndex);
        HashNode prev=null;
        while (head!=null){
            if (head.key.equals(key)){
                head.value=data;
                return;
            }
            head=head.next;
        }
        size++;
        head=buckets.get(hashIndex);
        HashNode newSlots=new HashNode(key, data);
        newSlots.next=head;
        buckets.set(hashIndex,newSlots);

    }

    public int delete(String key){

        int hashIndex=getIndex(key);
        HashNode head=buckets.get(hashIndex);
        HashNode prev=null;
        while (head!=null){
            if (head.key.equals(key)){
                break;
            }
            prev=head;
            head=head.next;

        }
        if (head==null){
            return 0;
        }
        size--;
        if(prev!=null){
            prev.next=head.next;
        }else{
            buckets.set(hashIndex,head.next);

        }
        return head.value;
    }
     public int get(String key){
        int hashIndex=getIndex(key);
        HashNode head=buckets.get(hashIndex);
        while (head!=null){
            if (head.key.equals(key)){
                return head.value;

            }
                       head=head.next;
            }
        return head.value;
        }
    }


