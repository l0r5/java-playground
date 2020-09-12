package ch.l0r5.exercises;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void formatCurrencies() {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        if (payment <= 0.00 || payment >= Math.pow(10, 9)) {
            return;
        }
        BigDecimal roundedPayment = new BigDecimal(payment);
        roundedPayment = roundedPayment.setScale(2, BigDecimal.ROUND_HALF_UP);

        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfIN = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        NumberFormat nfCN = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfFR = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + nfUS.format(roundedPayment));
        System.out.println("India: " + nfIN.format(roundedPayment).replace("¤", "Rs."));
        System.out.println("China: " + nfCN.format(roundedPayment));
        System.out.println("France: " + nfFR.format(roundedPayment));
    }
}


