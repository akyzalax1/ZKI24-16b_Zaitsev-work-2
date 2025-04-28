// Класс Холодильник
public class Refrigerator {
    // Поля класса
    private String brand;       // Бренд холодильника
    private String model;       // Модель холодильника
    private int capacity;       // Объем в литрах
    private double powerConsumption; // Потребление электроэнергии в кВт/ч
    private double height;      // Высота в метрах

    // Конструктор по умолчанию
    public Refrigerator() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.capacity = 0;
        this.powerConsumption = 0.0;
        this.height = 0.0;
    }

    // Конструктор с параметрами
    public Refrigerator(String brand, String model, int capacity, double powerConsumption, double height) {
        setBrand(brand);
        setModel(model);
        setCapacity(capacity);
        setPowerConsumption(powerConsumption);
        setHeight(height);
    }

    // Методы доступа (геттеры)
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getHeight() {
        return height;
    }

    // Методы модификации (сеттеры) с проверкой данных
    public void setBrand(String brand) {
        if (brand != null && !brand.trim().isEmpty()) {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model != null && !model.trim().isEmpty()) {
            this.model = model;
        }
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        }
    }

    public void setPowerConsumption(double powerConsumption) {
        if (powerConsumption >= 0) {
            this.powerConsumption = powerConsumption;
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    // Метод, возвращающий энергетический класс холодильника
    public String getEnergyClass() {
        if (powerConsumption < 0.5) {
            return "A++";
        } else if (powerConsumption < 1.0) {
            return "A+";
        } else if (powerConsumption < 1.5) {
            return "A";
        } else {
            return "B";
        }
    }

    // Метод для красивого вывода информации о холодильнике
    public String toString() {
        return "Бренд: " + brand +
                ", Модель: " + model +
                ", Вместимость: " + capacity + " л" +
                ", Потребление энергии: " + powerConsumption + " кВт/ч" +
                ", Высота: " + height + " м" +
                ", Энергетический класс: " + getEnergyClass();
    }
}
