package HomeWork3_4;

public class Main {
    public static void main(String[] args) {
        RadiusPi radius = new RadiusPi();
        radius.aWidgh = 1.42; //Указываем высоту отверстия
        radius.bLenght = 2.85; // Указываем длину отверстия
        radius.radiusCicrle = 1.60; //Указываем радиус круга

        //если круг достаточного радиуса или больше нужного для закрытия, то программа напишет "закрыть отверсите кругом можно"
        //если радиуса недостаточно то программа выдаст "закрыть отвестие кругом нельзя"

        radius.radiusDefine();
    }
}
