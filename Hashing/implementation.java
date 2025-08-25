import java.util.*;
public class implementation {
    static class HashMap<K,V>{ //<K,V>-> called generics(we use this when we have no fixed type), parameterized types i.e in our hashmap key can be of any tupe int,string etc
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
            
        }
        private int n;// ll size ie number of nodes
        private int N; //buckets length ie array size
        private LinkedList<Node> buckets[];
        
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<buckets.length;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc)%N;
        }
        private int searchInLL(K key,int bi){
            LinkedList<Node> ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        } 
        @SuppressWarnings("unchecked")
        private void rehash(){
            //store curret values
            LinkedList<Node> oldbuckets[]=buckets;
            //double the buckets
            buckets=new LinkedList[N*2];
            N=2*N;
            //initialize the buckets with ll
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            //add the nodes in new bucket
            for(int i=0;i<oldbuckets.length;i++){
                LinkedList<Node> ll=oldbuckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key,V value){
            //1.find bucket index
            int bi=hashFunction(key);
            //2.search in the ll if key is already present
            int di=searchInLL(key,bi); //we either get valid index or -1
            if(di!=-1){// node already present, update
                Node node=buckets[bi].get(di);
                node.value=value;
            }else{
                buckets[bi].add(new Node(key,value));
                n++;// increase the node size
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
             if(di!=-1){
                return true;
            }else{
                return false;
            }
        }
        public V remove(K key){
           int bi=hashFunction(key);
            int di=searchInLL(key,bi);
             if(di!=-1){
                Node node=buckets[bi].remove();
                n--;// decrease the node size
                return node.value;
            }else{
                return null;
            }
        }
        public V get(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
             if(di!=-1){
                Node node=buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
    }
     public static void main(String[] args) {
            HashMap<String,Integer> map=new HashMap<>();
            map.put("India",120);
            map.put("US",30);
            map.put("China",150);
            System.out.println(map);
            ArrayList<String> keys=map.keySet();
            for(String key:keys){
                System.out.println(key+"->"+map.get(key));
            }
            System.out.println(map.containsKey("India"));
            System.out.println(map.remove("India"));
            System.out.println(map.get("US"));
            System.out.println(map.isEmpty());
     }    
}
