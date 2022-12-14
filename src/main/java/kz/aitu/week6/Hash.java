package kz.aitu.week6;




public class Hash {
    public Node tail;
    public int size;
    public Node array[];


    public Hash(int size){
        this.tail=null;
        this.size=size;
        array = new Node[size];

    }
    public int indexer(String key){
        return key.hashCode()%size;
    }

    /*public void set(String key,String value){
        Node dt=new Node(key, value);

        if (array[key.hashCode()%size]==null){
            array[key.hashCode()%size]=dt;
            tail=dt;
        }else{
            tail.next=dt;
            tail=dt;
        }
    }*/
   public void set(String key,String value){
        Node dt=new Node(key, value);
        System.out.println(key.hashCode());
        if (array[key.hashCode()%size]==null){
            array[key.hashCode()%size]=dt;
            System.out.println("added"+key+" to " +key.hashCode()%size);
        }else{
            Node temp = array[key.hashCode()%size];
            while (array[key.hashCode()%size].next!=null){
                array[key.hashCode()%size]=array[key.hashCode()%size].next;
            }
            array[key.hashCode()%size].next=dt;

            array[key.hashCode()%size]=temp;
            System.out.println(" added "+key+" to "+key.hashCode()%size);
        }
    }


    public void remover(String key) {

        if (array[key.hashCode() % size]==null) return;
        //System.out.println("start2");
        if (array[key.hashCode() % size].key == key) {
          //  System.out.println("start3");
            array[key.hashCode() % size] = array[key.hashCode() % size].next;
            return;
        }

        Node temp=array[indexer(key)];

        for (int i=0;i<sizeof(key);i++){
            if (temp.next.key==key){
                temp=temp.next.next;
                return;
            }
                temp=temp.next;
            }
           return;
        }




    public void rowprint(String key){
        Node temp=array[indexer(key)];

        while (temp!=null){
            System.out.print(temp.key+" "+temp.data+"  ");
            temp=temp.next;
        }
        System.out.println("\t\t");
    }


    public String getValue( String k){
        int index=k.hashCode()%size;

        for (Node temp=array[index];temp!=null;temp=temp.next){
            if (temp.key==k){
                return temp.data;
            }
        }


        return null;
    }





    public void insert(String key,String value){
        int code = key.hashCode();
        int index=code%size;
        if (array[index]==null){
            array[index]= new Node(key,value);
        }
        Node temp=array[index];
        while (temp!=null){
            if (temp.key==key) {
                temp.data=value;
                return;
            }
            temp=temp.next;
        }
        if (temp==null) set(key,value);

    }






    public void printall(){
        System.out.println();
        for (int i=0;i<size;i++){
           Node temp=array[i];

           while (temp!=null){
               System.out.print(temp.key+" "+temp.data+"  ");
               temp=temp.next;
           }
            System.out.println("\t\t");
        }
    }






    public int getSize(){
        int counter=0;
        for (int i=0;i<size;i++){
            Node temp=array[i];
            while (temp!=null){
                counter++;
                temp=temp.next;
            }
        }
        return counter;
    }

    public int sizeof(String key) {
        int counter=0;
        Node temp=array[key.hashCode()%size];
        while (temp!=null){
            counter++;

            temp=temp.next;
        }
        return counter;

    }






}
