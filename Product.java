package HOMEWORK;
public class Product{
    String name;
    String brand;
    double price;
    Product(){
        
    }
String displayInfo(){
    return String.format("%s - %s - %.2f", brand, name, price);
}

}
