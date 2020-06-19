package onlinestoe;

import com.github.javafaker.Faker;
import java.lang.*;

public class RandomStorePopulator {

    public void newProduct() {

        Faker fakerProduct = new Faker();

        String productName = fakerProduct.commerce().productName();
        String productPrice = fakerProduct.commerce().price();
        int productRate = fakerProduct.number().numberBetween(0, 100);

         System.out.println("Product Name is " + productName);
         System.out.println("Product Price is " + productPrice);
         System.out.println("Product Rate is " + productRate);
    }
       public void newCategory () {

        Faker fakerCategory = new Faker();

        String categoryName = fakerCategory.commerce().department();

        System.out.println("Product Category is " + categoryName);
        }


    /*String productName;
    String productPrice;
    int productRate;
    Faker fakerProduct;

    public RandomStorePopulator(String productName, String productPrice, int productRate) {


        String createProductName = fakerProduct.commerce().productName();
        String createProductPrice = fakerProduct.commerce().price();
        int createProductRate = fakerProduct.number().numberBetween(0, 100);

        System.out.println("Product Name is " + productName);
        System.out.println("Product Price is " + productPrice);
        System.out.println("Product Rate is " + productRate);*/


     /* String[] product = {productName, productPrice, String.valueOf(productRate), categoryName};

        for (String i:product) {
            System.out.println(i);
        }*/

            /*System.out.println("Product Name is " + productName);
            System.out.println("Product Price is " + productPrice);
            System.out.println("Product Rate is " + productRate);
            System.out.println("Product Category is " + categoryName);*/


    }


