import java.io.Serializable;
import java.util.Objects;

public class Phone implements Serializable {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номера " + number);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщение будет отправлено на номер(-а):");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(weight, phone.weight) == 0 && Objects.equals(number, phone.number) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }

    @Override
    public String toString() {
        return "Номер: " + number + '\t' +
                "Модель: " + model + '\t' +
                "Вес: " + weight;
    }
}
