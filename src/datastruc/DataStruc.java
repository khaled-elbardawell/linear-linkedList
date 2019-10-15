package datastruc;


class node{
    String info;
    node link;
    public node(){
        this(null,null);
    }
    public node(String info,node link){
        this.info=info;
        this.link=link;
    }
}
 
 class linkedList{
     node firstNode;
     int length;
     public int size(){
         return length;
     }
     
     public void print(){
         node n=firstNode;
         if(firstNode==null){
             System.out.println("empty ...");
         }else{
             while(n != null){
                 System.out.println(n.info);
                 n=n.link;
             }
         }
     }
     
     public void insertNewNode(String info ){
        node n=firstNode;
         if(n == null){
             return;
         }
         
         node newNode = new node(info,null);
         newNode.link=n.link;
         n.link=newNode;
         ++length;
         
     }
     
     public void insertLast(String info){
         node n =firstNode;
         node newNode =new node();
         newNode.info=info;
         newNode.link=null;
         if(n == null){
            firstNode=newNode;
             ++length;
             return;
         }else{
             
         while(n.link != null){
             n=n.link;
         }
         n.link=newNode;
         ++length;
     }
    } 
     
     public String search(String info){
          node n =firstNode;
         if(n == null){
             return "Not Found !!";
         }else{
            while(n != null){
                if(n.info == info){
                    return n.info;
                }else{
                   n= n.link;
                }
            }
           return "Not Found !!";
         }
         
     }
     
     public void deleteLast(){
         node n =firstNode;
         node prev , current;
         if(n == null){
             return;
         }else if(n.link==null){
           firstNode =null;
           --length;
           return;
         }else{
             prev=firstNode;
             current=firstNode.link;
             while(current.link !=null){
               prev=current;
               current=current.link;
             }
             prev.link=null;
             --length;
             
         }
     }
     
     public void reverse(){
       node n;
       node  list = null;
       if(firstNode == null){
           return;
       }else{
           while(firstNode != null){
               n=firstNode;
               firstNode=firstNode.link;
               n.link=null;
               
               if(list==null){
                   list=n;
               }else{
                node s=list;   
                list=n;
                list.link=s;
           }
       }
           
           firstNode=list;
       
          }
     }
     
     public void reverse2(){
        node r,n,l;
         l=firstNode;
          r=null;
         while(l !=null){
             n=l;
             l=l.link;
             n.link=r;
             r=n;
         }
         firstNode=r;
    
     }
          
     
          public void deleteFirst(){
         if(firstNode == null){
             return;
         }else{
            firstNode=firstNode.link;
            --length;
         }
     }
     
 }



public class DataStruc {


    public static void main(String[] args) {
        linkedList l=new linkedList();
       //   ********** insert ***********
        l.insertLast("khaled");
        l.insertLast("mohammed");
        l.insertLast("sami");
        l.insertNewNode("majdi");
       //   ********** print items ***********
        System.out.println("********** Items ***********");
        l.print();
        System.out.println("*********************");
        
       //   ********** print size ***********

        System.out.println("search result >> " + l.search("majdi") );
        System.out.println("*********************");
        System.out.println("Length =>> " + l.size() );
       
        
      //   ********** delete last ***********
        
        l.deleteLast();
        System.out.println("********** Items after delete last ***********");
        l.print();
        System.out.println("*********************");
        System.out.println("Length =>> " + l.size() );
        
        //   ********** delete reverse ***********
        
        l.reverse();
        System.out.println("********** Items after reverse ***********");
        l.print();
        System.out.println("*********************");
        System.out.println("Length =>> " + l.size() );
        
        
        //   ********** delete reverse ***********
        
        l.reverse2();
        System.out.println("********** Items after reverse2 ***********");
        l.print();
        System.out.println("*********************");
        System.out.println("Length =>> " + l.size() );
        
        
         //   ********** delete first ***********
        
        l.deleteFirst();
        System.out.println("********** Items after delete fisrt ***********");
        l.print();
        System.out.println("*********************");
        System.out.println("Length =>> " + l.size() );
        
    }
    
}
