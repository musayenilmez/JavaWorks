
package bağlıliste.yığıt;
class node{
    int eleman;
    node ileri;
}
class linkedstack{
    node top; int size;
     public linkedstack(){
       top=null;
      size=0;
     }
     public boolean bosmu(){
               return size==0;
     }
     public void ekle(int a){
         node newnod=new node();
         newnod.eleman=a;
         newnod.ileri=top;
         top=newnod;
         size++;
     }
     public int cikar(){
        int temp=0;
        if(!bosmu()){
            temp=top.eleman;
            top=top.ileri;
            size--;
        }
        return temp;
     }
}
public class BağlılisteYığıt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        linkedstack lst=new linkedstack();
        lst.ekle(5);
        lst.ekle(6);
        lst.ekle(7);
        lst.ekle(8);
        while(!lst.bosmu()){
            System.out.println(lst.cikar());
        }
        
    }
    
}
