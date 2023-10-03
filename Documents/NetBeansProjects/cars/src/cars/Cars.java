/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cars;

/**
 *
 * @author Acer
 */
public class Cars {
    String name;
    String model;
    Double price;
    int date;
    
    public Cars(String name,String model,Double price,int date){
        this.name=name;
        this.model=model;
        this.price=price;
        this.date=date;
    }
        
    public void displayinfo(){
        System.out.println("name is"+name);
        System.out.println("model is"+model);
        System.out.println("date is"+date);
        System.out.println("price is"+price);
        }
    
  
    public static void main(String[] args) {
        Cars car1=new Cars("lambo","alpha",4500.00,2024);
        car1.displayinfo();
}
}

