import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Random gen = new Random();
        int min=0,max=0,srednia=0,mniejszy_s=0,wiekszy_s=0;
        int tab2[][]= new int[5][5];
        int[] tab= new int[10];

        for(int i=0;i< tab.length;i++){//generowanie tablicy wypełnionych liczbami od -10 do 10
            tab[i]= gen.nextInt(21)-10;
        }
        for (int i = 0; i < tab.length; i++) {//wyświetlanie tablicy i wyszukiwanie największego i najmniejszego elementu tablicy

            if(i==0)min=tab[i];max=tab[i];

            System.out.println(tab[i]);


            if(max<tab[i])
                max=tab[i];

            if(min>tab[i])
                min=tab[i];

        }
        System.out.println("Największy to "+max+" element");
        System.out.println("Najmniejszy to "+min+" element");
        for (int i = 0; i < tab.length; i++) {
            srednia+=tab[i];

        }
        float srednia_f = Float.parseFloat(String.valueOf(srednia))/10;

        System.out.println("Suma elementów jest równa "+srednia_f +" ");
        for (int i = 0; i <tab.length ; i++) {
            if(tab[i]>srednia_f)
                wiekszy_s++;
            else if(tab[i]<srednia_f)
                mniejszy_s++;

        }
        System.out.println("Ilosc elementów mniejszych od sredniej"+mniejszy_s+" ");
        System.out.println("Ilosc elementów wiekszych od sredniej"+wiekszy_s+" ");
        for (int i = tab.length-1; i >=0 ; i--) {
            System.out.println(tab[i]);
        }
		}
}


