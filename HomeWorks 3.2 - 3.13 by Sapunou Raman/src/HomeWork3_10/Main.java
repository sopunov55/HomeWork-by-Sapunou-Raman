package HomeWork3_10;

public class Main {


    public static void main(String[] args) {
        int enteredNumber = 16;
        int number = 0;
        int finishNumber = 0;
        int[] costsNumbers = new int[100000];
        for (int x = enteredNumber; x != 0; x--) {
            number++;
            costsNumbers[x] = number;
        }
        for (int z = 0; z < costsNumbers.length; z++) {
            finishNumber = finishNumber + costsNumbers[z];
        }
        System.out.print("Сумма всех предыдущих чисел цифры ");
        System.out.print(enteredNumber);
        System.out.print(": " + finishNumber);
    }
}

