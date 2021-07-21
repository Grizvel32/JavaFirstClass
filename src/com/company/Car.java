package com.company;

public class Car {
    //region Enum Color

    public enum Color {
        red("красный"),
        green("зелёный"),
        blue("голубой"),
        black("чёрный");

        private final String value;

        Color(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    //endregion

    //region Variables

    private int enginePower;
    private double maxSpeed;
    private double weight;
    private String brandName;
    private String model;
    private Color color;

    //endregion

    //region Constructors

    public Car() {
        enginePower = 50;
        maxSpeed = 130;
        weight = 0.57;
        brandName = "Ford";
        model = "Model T";
        color = Color.black;
    }

    public Car(int enginePower, double maxSpeed, double weight, String brandName, String model, Color color) {
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brandName = brandName;
        this.model = model;
        this.color = color;
    }

    public Car(Car car) {
        enginePower = car.enginePower;
        maxSpeed = car.maxSpeed;
        weight = car.weight;
        brandName = car.brandName;
        model = car.model;
        color = car.color;
    }

    //endregion

    //region Setters

    public void setEnginePower(int enginePower) throws Exception {
        if (enginePower <= 0) {
            throw new Exception("engine power must be grater than 0");
        }
        this.enginePower = enginePower;
    }

    //endregion

    //region Getters

    public int getEnginePower() {
        return enginePower;
    }

    //endregion

    public String getInString() {
        String output = "";

        output += "двигатель: " + enginePower + "(лс)\n";
        output += "макс скорость: " + maxSpeed + "(км/ч)\n";
        output += "вес: " + weight + "(тонн)\n";
        output += "марка: " + brandName + "\n";
        output += "модель: " + model + "\n";
        output += "цвет: " + color.getValue();

        return output;
    }

}
