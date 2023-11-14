package mountain;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static mountain.Mountain.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.setProperty("console.encoding","utf-8");

        System.out.println("Введите количество вершин: ");
        int countMountains = sc.nextInt();
        Mountain [] mountains = setMountainArray(countMountains);

        showMountainArray(mountains);
        mountainMaxHeight(mountains);
        mountainHeight(mountains);
        sortMountainArray(mountains);
        searchMountain(mountains);
    }
}
