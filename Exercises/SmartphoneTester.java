package Exercises;
import java.util.Objects;
class Smartphone implements Cloneable {
    private String brandName;
    private String modelName;
    private int batterymAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return "Brand: " + brandName + "\n" +
                "Model: " + modelName + "\n" +
                "Battery: " + batterymAh + "mAh" + "\n" +
                "Producer Price: " + producerPrice + "\n" +
                "Retail Price: " + retailPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Smartphone other = (Smartphone) obj;
        return brandName.equals(other.brandName) &&
                modelName.equals(other.modelName) &&
                batterymAh == other.batterymAh &&
                producerPrice.equals(other.producerPrice) &&
                retailPrice.equals(other.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() {
        try {
            Smartphone clonedSmartphone = (Smartphone) super.clone();
            clonedSmartphone.producerPrice = producerPrice.clone();
            clonedSmartphone.retailPrice = retailPrice.clone();
            return clonedSmartphone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

class SmartphonePrice implements Cloneable {
    private String priceType;
    private double priceInEuros;

    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    @Override
    public String toString() {
        return "Price Type: " + priceType + "\n" +
                "Price in Euros: " + priceInEuros;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartphonePrice other = (SmartphonePrice) obj;
        return priceType.equals(other.priceType) &&
                priceInEuros == other.priceInEuros;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    @Override
    public SmartphonePrice clone() {
        try {
            return (SmartphonePrice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class SmartphoneTester {
    public static void main(String[] args) {
        SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 500.0);
        SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 600.0);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 800.0);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 900.0);

        Smartphone smartphone1 = new Smartphone("Brand1", "Model1", 4000, producerPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("Brand2", "Model2", 5000, producerPrice2, retailPrice2);

        System.out.println("Smartphone 1 Details:");
        System.out.println(smartphone1);

        System.out.println("\nSmartphone 2 Details:");
        System.out.println(smartphone2);

        System.out.println("\nChecking if Smartphone 1 is equal to Smartphone 2:");
        System.out.println(smartphone1.equals(smartphone2));

        try {
            Smartphone clonedSmartphone = smartphone2.clone();
            System.out.println("\nCloned Smartphone Details:");
            System.out.println(clonedSmartphone);

            System.out.println("\nChecking if Smartphone 2 is equal to Cloned Smartphone:");
            System.out.println(smartphone2.equals(clonedSmartphone));
        } catch (Exception e) {
            System.out.println("\nAn error occurred while cloning the Smartphone:");
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}
