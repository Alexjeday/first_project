package HomeWork1;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.*;

public class shopOne {
    public static final BigDecimal BIG_DECIMAL = valueOf(800);

    public static void main(String[] args) {
        advanced();
    }
    public static void advanced() {
// Sausages
        BigDecimal priceSausage = valueOf(800);
        int countSausage = 2000;
        BigDecimal costSausage;
        if (countSausage < 100) {
            costSausage = valueOf(412);
        } else if (countSausage <= 1000 && countSausage < 2000) {
            costSausage = valueOf(408);
        } else costSausage = valueOf(404);
        // ham
        BigDecimal priceHam = valueOf(350);
        long countHam = 8511;
        BigDecimal costHam = valueOf(275);
        // Neck
        BigDecimal priceNeck = valueOf(500);
        long countNeck = 6988;
        BigDecimal costNeck = countNeck < 500 ? valueOf(311) : valueOf(299);
        // income Доход

        BigDecimal totalIncomeSausage = priceSausage.multiply(valueOf(countSausage));
        BigDecimal totalIncomeHam = priceHam.multiply(valueOf(countHam));
        BigDecimal totalIncomeNeck = priceNeck.multiply(valueOf(countNeck));
        BigDecimal totalIncome = totalIncomeSausage.add(totalIncomeHam).add(totalIncomeNeck);

        BigDecimal totalOutcomeSausage = costSausage.multiply(valueOf(countSausage));
        BigDecimal totalOutcomeNeck = costNeck.multiply(valueOf(countNeck));
        BigDecimal totalOutcomeHam = costHam.multiply(valueOf(countHam));
        BigDecimal outcomeConstant = valueOf(1_000_000);
        BigDecimal totalOutcome = totalOutcomeSausage.add(totalOutcomeHam).add(totalOutcomeNeck).add(outcomeConstant);

        BigDecimal profitBeforeTax =totalIncome.subtract(totalOutcome);
// tax calculation
        BigDecimal taxRateBeforeLowLimit= new BigDecimal(0.08);
        BigDecimal lowLimitTax = valueOf(1_000_000);
        BigDecimal taxRateAfterLowLimit = new BigDecimal(0.1);
        BigDecimal highLimitTax = valueOf(2_000_000);
        BigDecimal taxRateAfterHighLimit = new BigDecimal(0.13);

        BigDecimal totalTax= ZERO;
        if (profitBeforeTax.compareTo(lowLimitTax) < 0) {
            BigDecimal taxBeforeLowLimit = taxRateBeforeLowLimit.multiply(profitBeforeTax);
        } else {
            BigDecimal taxBeforeLowLimit = taxRateBeforeLowLimit.multiply(lowLimitTax);
            totalTax = totalTax.add(taxBeforeLowLimit);

        }
        // calculation for average limit
        if (profitBeforeTax.compareTo(highLimitTax)< 0) {
            BigDecimal taxAfterLowLimit = profitBeforeTax.subtract(lowLimitTax).multiply(taxRateAfterLowLimit);
            totalTax = totalTax.add(taxAfterLowLimit);

        } else {
            BigDecimal taxAfterLowLimit = highLimitTax.subtract(lowLimitTax).multiply(taxRateAfterLowLimit);
            BigDecimal taxAfterHighLimit = profitBeforeTax.subtract(highLimitTax).multiply(taxRateAfterHighLimit);
            totalTax= totalTax.add(taxAfterHighLimit).add(taxAfterLowLimit);
        }
        System.out.println("Налог составил :" + totalTax.setScale(2, RoundingMode.CEILING));
        BigDecimal profitAfterTax = profitBeforeTax.subtract(totalTax);
        System.out.println("Прибыль после налога " + profitAfterTax.setScale(2,ROUND_CEILING));
    }
}
