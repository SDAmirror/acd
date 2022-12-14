package kz.aitu.HW.summer;

public class FIND {

    track head=null;
    track tail=null;

    public void add(int [] arr,int sum){

        for (int i=0;i<arr.length;i++){
            int j=0;
            do {
                if (j==i){
                    j++;
                }
                if (arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+"  "+arr[j]);
                   track track=new track(arr[i],arr[j]);
                    if (head==null){
                        head=track;
                        tail=track;
                    }else {
                        tail.next=track;
                        tail=track;
                    }
                }
                j++;
            } while (j<arr.length-1);

        }


    }
    public void Nescolco(int [] arr,int sum,int n) {
    //int [][] ara =new int[199] [199];
    int curent,i,j;
    for (i=0;i<n;i++){
        curent=arr[i];
        for (j=i+1;j<=n;j++){
            if (curent==sum){
                
            }
        }
    }

    }
    public void print(){
        track temp=head;
        while (temp!=null){
            System.out.println(temp.firsts+"and"+temp.second+"->>>>");
            temp=temp.next;
        }
    }


}

