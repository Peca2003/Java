public class Main
{
    public static void main(String[] args)
    {
        Phone phone = new Phone("8(988)888-88-88", "redmi note 5", 181.0);
        Phone phone1 = new Phone("8(994)546-37-21", "realme 9", 178.0);
        Phone phone2 = new Phone("8(928)345-22-31", "redmi note 12", 186.0);

        System.out.println(phone);
        System.out.println(phone1);
        System.out.println(phone2);

        System.out.println();
        phone.receiveCall("Муса");
        phone.get_number();
        phone1.receiveCall("Никита");
        phone1.get_number();
        phone2.receiveCall("Петр");
        phone2.get_number();
        System.out.println();

        phone.receiveCall("Муса", "8(988)546-63-64");
        System.out.println();
        phone.sendMessage("8(988)888-88-88", "8(994)546-37-21");
    }
}