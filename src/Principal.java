
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yareli
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> queue = new LinkedList();
        queue.add("Adrian");
        queue.add("jesus");
        queue.add("Daniel");

        queue.offer("Franciso");

        queue.remove();
        
        System.out.println(queue.element());
        
        System.out.println("los elementos"+ queue.toString());
        queue.element();
        queue.peek();
        
        
    }

}
