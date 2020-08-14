    import java.util.*;    
    class car { 
        
    //int id;    
    String name;    
    int milage;
    int price;
    public car(String name,int milage , int price) {    
        this.name = name;    
        this.milage = milage;    
        this.price = price;    
    }    
    }    
    public class MapExample {    
    public static void main(String[] args) {    
        //Creating map of Books    
        Map<car> map=new HashMap<car>();    
        //Creating Books    
        Book b1=new Book(40,guru,40000);    
        Book b2=new Book(42,guru,40001);    
        Book b3=new Book(43,guru,40002);    
        //Adding Books to map   
        map.put(b1);  
        map.put(b2);  
        map.put(b3);  
        Collections.sort(map);
        //Traversing map  
        for(Map.Entry<Integer, Book> entry:map.entrySet()){    
            int key=entry.getKey();  
            Book b=entry.getValue();  
            System.out.println(key+" Details:");  
            System.out.println(b.name+ " "+b.milage+""+b.price);   
        }    
    }    
    }    