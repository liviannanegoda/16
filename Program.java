package HOMEWORK;

public class Program {
    public static void main(String[] args){
        Product product1 = new Product();
        product1.name = "Газировка";
        product1.brand = "ООО Мегапродукт";
        product1.price = 200;
        
        System.out.println(product1.displayInfo());
    }
    
}
