package onlinestoe;

import java.lang.reflect.Field;

public class Store extends Product{



 public static void main(String[] args) {

   Store storeProducts = new Store();

   storeProducts.productCatalog();


   Class<Category> categoryClass = Category.class;
   Field[] declaredFields = categoryClass.getFields();
   for (Field field :declaredFields) {
    System.out.println(field);

   }
      }




}

