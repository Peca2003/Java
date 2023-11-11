package mountain;

import java.util.Scanner;

public class Mountain
{
    private String m_MountainName, m_Location;
    private int m_MountainHeight;

    public String getM_MountainName() {
        return m_MountainName;
    }

    public void setM_MountainName(String m_MountainName) {
        this.m_MountainName = m_MountainName;
    }

    public String getM_Location() {
        return m_Location;
    }

    public void setM_Location(String m_Location) {
        this.m_Location = m_Location;
    }

    public int getM_MountainHeight() {
        return m_MountainHeight;
    }

    public void setM_MountainHeight(int m_MountainHeight) {
        this.m_MountainHeight = m_MountainHeight;
    }

    public static Mountain [] setMountainArray(int numberMountains)
    {
        Scanner sc = new Scanner(System.in, "utf-8");
        System.setProperty("console.encoding","utf-8");
        Mountain [] mountain = new Mountain[numberMountains];

        //Заполнение информации
        System.out.println("Введите информацию о горах: ");
        for (int i = 0; i < mountain.length; ++i)
        {
            sc.nextLine();
            mountain[i] = new Mountain();
            System.out.print("Название " + (i + 1) + "-й горы: ");
            mountain[i].setM_MountainName(sc.nextLine());
            System.out.print("Местоположение " + (i + 1) + "-й горы: ");
            mountain[i].setM_Location(sc.nextLine());
            System.out.print("Высота " + (i + 1) + "-й горы (м):");
            mountain[i].setM_MountainHeight(sc.nextInt());
            sc.nextLine();
        }
        return mountain;
    }

    //Вывод информации
    public static void showMountainArray(Mountain [] mount)
    {
        System.out.println("\nИнформация о горах: ");
        for (Mountain value : mount)
        {
            System.out.println(value.m_MountainName + "\t" + value.m_Location + "\t" + value.m_MountainHeight + " м");
        }
    }

    //Определение самой высокой горы
    public static String mountainMaxHeight(Mountain [] mount)
    {
        int indexMaxHeight = 0;
        int max = mount[indexMaxHeight].m_MountainHeight;
        for (int i = 0; i < mount.length; ++i)
        {
            if (mount[i].m_MountainHeight > max)
            {
                max = mount[i].m_MountainHeight;
                indexMaxHeight = i;
            }
        }
        return "\nСамая высокая гора: " + mount[indexMaxHeight].m_MountainName;
    }

    //Определение вершин, высота которых больше 1000 м
    public static void mountainHeight(Mountain [] mount)
    {
        int height = 1000;
        for (int i = 0; i < mount.length; ++i)
        {
            if (mount[i].m_MountainHeight > height)
            {
                System.out.println(mount[i].m_MountainName + "\t" + mount[i].m_MountainHeight + " м");
            }
        }
    }

    //Сортировка вершин по высоте
    public static void sortMountainArray(Mountain [] mount)
    {
        for (int i = 0; i < mount.length - 1; ++i)
        {
            for (int j = 0; j < mount.length - 1 - i; ++j)
            {
                if (mount[j].m_MountainHeight < mount[j + 1].m_MountainHeight)
                {
                    Mountain temp = mount[j];
                    mount[j] = mount[j + 1];
                    mount[j + 1] = temp;
                }
            }
        }
    }

    //Поиск вершины по названию
    public static void searchMountain(Mountain [] mount)
    {
        Scanner sc = new Scanner(System.in, "utf-8");
        System.setProperty("console.encoding","utf-8");
        int choiseMenu;
        System.out.println("Хотите ли Вы найти вершину? (1 - да, 2 - нет)");
        choiseMenu = sc.nextInt();

        switch (choiseMenu)
        {
            case 1:
                sc.nextLine();
                System.out.println("\nВведите название вершины: ");
                String name = sc.nextLine();
                int nom = -1;

                for (int i = 0; i < mount.length; ++i)
                {
                    if (name.equalsIgnoreCase(mount[i].m_MountainName))
                        nom = i;
                }
                if (nom != -1)
                {
                    System.out.println("\nВершина найдена! Это вершина " + mount[nom].m_MountainName + ", расположенная в " + mount[nom].m_Location + ", высотой " + mount[nom].m_MountainHeight + " м");
                    int choise;
                    System.out.println("Хотите ли Вы редактировать информацию о вершине? (1 - да, 2 - нет)");
                    choise = sc.nextInt();

                    switch (choise)
                    {
                        case 1:
                            int selectionField;
                            System.out.println("Выберите поле для редактирования (1 - название, 2 - расположение, 3 - высота)");
                            selectionField = sc.nextInt();
                            sc.nextLine();
                            if (selectionField == 1)
                            {
                                System.out.println("Введите новое название вершины: ");
                                mount[nom].setM_MountainName(sc.nextLine());
                            }

                            if (selectionField == 2)
                            {
                                System.out.println("Введите новое расположение вершины: ");
                                mount[nom].setM_Location(sc.nextLine());
                            }

                            if (selectionField == 3)
                            {
                                System.out.println("Введите новую высоту вершины: ");
                                mount[nom].setM_MountainHeight(sc.nextInt());
                            }
                            System.out.println("Новая информация о вершине:");
                            System.out.println(mount[nom].m_MountainName + "\t" + mount[nom].m_Location + "\t" + mount[nom].m_MountainHeight);
                            break;
                        case 2:
                            System.out.println("Вы вышли из редактирования.");
                            break;
                        default:
                            System.out.println("Такой пункт меню отсутствует!");
                            break;
                    }
                }
                else System.out.println("\nТакой вершины нет!");
                break;
            case 2:
                System.out.println("Вы вышли из поиска.");
                break;
            default:
                System.out.println("Пункт меню отсутствует!");
                break;
        }
    }
}
