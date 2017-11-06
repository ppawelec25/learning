package pl.ideabank.elead.duplicate;

import java.util.Scanner;

public class PIN {

    public static void main(String[] args) {
        PIN pin = new PIN();
        while (!pin.passPin()) {
            System.out.println("Zly pin");
        }
        System.out.println("Dobry pin");
    }

    public boolean passPin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 cyfrowy pin");
        String pin = scanner.next();
        return validatePin(pin);
    }

    private boolean validatePin(String number) {
        return number.matches("[[a-z][A-Z]]{3}");
    }

}
