import java.awt.Rectangle;
public class IntersectionPrinter {
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(0,0,10,20);
        Rectangle r2 = new Rectangle(5,5,10,20);
        Rectangle r3 = r1.intersection(r2);
        System.out.println("İlk Intersection Rectangle : "+ r3);

        Rectangle r4 = new Rectangle(0,0,10,20);
        Rectangle r5 = new Rectangle(15,15,10,20);
        Rectangle r6 = r4.intersection(r5);
        System.out.println("İkinci Intersection Rectangle : "+ r6);
    }
}

/*Intersection metodu, iki kümenin kesişiminin değiştirilemez bir görünümünü döndürür.
  
  Kesişen kümeler yoksa bunu intersection metodu ile bulmak için
  Çıktının değerine bakarız.
  Eksili ise üst üste binen kümeler olmadığı için kesişimlerinde de bir küme oluşmaz.*/
