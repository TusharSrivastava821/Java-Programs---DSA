// Write a Java class, Flower, that has three instance variables of type String, int, and float, which respectively represent the name of the flower, its number of petals, and price. 
// Your class must include a constructor method that initialises each variable to an appropriate value, and your class should include methods for setting the value of each type, and getting the value of each type. 
// Create an array of 5 Flower objects and print the value.

import java.util.Scanner;
public class Flower
{
    String name;
    int petalNumber;
    float price;
    Scanner sc = new Scanner(System.in);
    public Flower()
    {
        System.out.print("Flower Name : ");
        name = sc.nextLine();
        System.out.print("Number of Petals : ");
        petalNumber = sc.nextInt();
        System.out.print("Price : ");
        price = sc.nextFloat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetalNumber() {
        return petalNumber;
    }

    public void setPetalNumber(int petalNumber) {
        this.petalNumber = petalNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
class FlowerMain
{
    public static void main(String[] args)
    {
        Flower[] flowerArr = new Flower[5];
        for (int i = 0; i < flowerArr.length; i++)
        {
            flowerArr[i] = new Flower();
        }
        for (int i = 0; i < flowerArr.length; i++)
        {
            System.out.println("Flower " + (i+1) + " : ");
            System.out.println("Name : " + flowerArr[i].getName());
            System.out.println("Number of Petals : " + flowerArr[i].getPetalNumber());
            System.out.println("Price : Rs." + flowerArr[i].getPrice());
        }
    }
}

