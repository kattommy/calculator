import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //  String dataToCalc = scanner.nextLine();
        String dataToCalc = "1 + 2 -1 + 3 / 2 ";

        // String regex = "^(\\d+[\\+\\-\\*\\/]{1})+\\d+$";
        String[] dataArray = dataToCalc.split("[\\+\\-\\*\\/]{1}");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(dataArray[i]);
        }
        System.out.println("---------------");
        String[] operatorsArray = dataToCalc.split("[0-9]");
        for (int i = 0; i < operatorsArray.length; i++) {
            System.out.println(operatorsArray[i]);
        }
    }
}
