public class Phone
{
    private String _number;
    private String _model;
    private double _weight;

    public Phone(String number, String model, double weight)
    {
        this(number, model);
        this._weight = weight;
    }

    public Phone(String number, String model)
    {
        this._number = number;
        this._model = model;
    }

    public Phone()
    {}

    @Override
    public String toString() {
        return "Номер: " + _number + '\t' +
                "Модель: " + _model + '\t' +
                "Вес: " + _weight;
    }

    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number)
    {
        System.out.println("Звонит " + name + " с номера " + number);
    }

    public String get_number() {
        return _number;
    }

    public void sendMessage(String... numbers)
    {
        System.out.println("Сообщение будет отправлено на номер(-а):");
        for (String number : numbers)
        {
            System.out.println(number);
        }
    }
}
