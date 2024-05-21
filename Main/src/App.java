
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        Set<Products> products = new HashSet<>();
         Products product = new Products("Cola", 50);
         Products product2= new Products("Machado", 14);
         Products product3 = new Products("Cola", 50);


         products.add(product);
         products.add(product2);
         products.add(product3);


         for(Products p : products){
               System.out.println(p.getName());
         }

    }
}
