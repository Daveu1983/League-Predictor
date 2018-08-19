import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LeaguePredictor {

    public static ArrayList<Integer> leaguePredicted = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrOneFinishedNextYear = new ArrayList<>();
    public static ArrayList<Integer> whereNumbrTwoFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrThreeFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrFourFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrFiveFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrSixFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrSevenFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrEightFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrNineFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrTenFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrElevenFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrTwelveFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrThirteenFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrFourteenFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrFifteenFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrSixteenFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrSeventeenFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrEighteenFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrNineteenFinishedNextYear = new ArrayList<Integer>();
    public static ArrayList<Integer> whereNumbrTwentyFinishedNextYear = new ArrayList<Integer>();

    public static final String MANCHESTER_UNITED = "Manchester United";
    public static final String ARSESNAL = "Arsesnal";
    public static final String ASTON_VILLA = "Aston Villa";
    public static final String NEWCASTLE_UNITED = "Newcastle United";
    public static final String CHELSEA = "Chelsea";
    public static final String LIVERPOOL = "Liverpool";
    public static final String BLACKBURN_ROVERS = "Blackburn Rovers";


    public static void main(String[] args) {
        NineteenNinetyThree yearOne = new NineteenNinetyThree();
        ArrayList<String> yearOneTable = yearOne.createTable();
        NineteenNinetyFour yearTwo = new NineteenNinetyFour();
        ArrayList<String> yearTwoTable = yearTwo.createTable();
        String[] promotedYearOne = yearOne.createPromoted();
        ArrayList<String> yearOneReadyToCompare = yearOne.replaceRelegated(yearOneTable, promotedYearOne);
        yearTwo.positionDifference(yearOneReadyToCompare, yearTwoTable);
        NineteenNinetyThree.storeDifference(yearOneReadyToCompare, yearTwoTable);
        System.out.println("");

        NineteenNinetyFive yearThree = new NineteenNinetyFive();
        ArrayList<String> yearThreeTable = yearThree.createTable();
        String[] promotedYearTwo = yearTwo.createPromoted();
        ArrayList<String> yearTwoReadyToCompare = yearTwo.replaceRelegated(yearTwoTable, promotedYearTwo);
        yearThree.positionDifference(yearTwoReadyToCompare, yearThreeTable);
        NineteenNinetyThree.storeDifference(yearTwoReadyToCompare, yearThreeTable);
        System.out.println("");

        NineteenNinetySix yearFour = new NineteenNinetySix();
        ArrayList<String> yearFourTable = yearFour.createTable();
        String[] promotedYearThree = yearThree.createPromoted();
        ArrayList<String> yearThreeReadyToCompare = yearThree.replaceRelegated(yearThreeTable, promotedYearThree);
        yearFour.positionDifference(yearThreeReadyToCompare, yearFourTable);
        NineteenNinetyThree.storeDifference(yearThreeReadyToCompare, yearFourTable);
        System.out.println("");

        NineteenNinetySeven yearFive = new NineteenNinetySeven();
        ArrayList<String> yearFiveTable = yearFive.createTable();
        String[] promotedYearFour = yearFour.createPromoted();
        ArrayList<String> yearFourReadyToCompare = yearFour.replaceRelegated(yearFourTable, promotedYearFour);
        yearFive.positionDifference(yearFourReadyToCompare, yearFiveTable);
        NineteenNinetyThree.storeDifference(yearFourReadyToCompare, yearFiveTable);
        System.out.println("");

        NineteenNinetyEight yearSix = new NineteenNinetyEight();
        ArrayList<String> yearSixTable = yearSix.createTable();
        String[] promotedYearFive = yearFive.createPromoted();
        ArrayList<String> yearFiveReadyToCompare = yearFive.replaceRelegated(yearFiveTable, promotedYearFive);
        yearSix.positionDifference(yearFiveReadyToCompare, yearSixTable);
        NineteenNinetyThree.storeDifference(yearFiveReadyToCompare, yearSixTable);
        System.out.println("");

        NineteenNinetyNine yearSeven = new NineteenNinetyNine();
        ArrayList<String> yearSevenTable = yearSeven.createTable();
        String[] promotedYearSix = yearSix.createPromoted();
        ArrayList<String> yearSixReadyToCompare = yearSix.replaceRelegated(yearSixTable, promotedYearSix);
        yearSeven.positionDifference(yearSixReadyToCompare, yearSevenTable);
        NineteenNinetyThree.storeDifference(yearSixReadyToCompare, yearSevenTable);
        System.out.println("");

        TwoThousand yearEight = new TwoThousand();
        ArrayList<String> yearEightTable = yearEight.createTable();
        String[] promotedYearSeven = yearSeven.createPromoted();
        ArrayList<String> yearSevenReadyToCompare = yearSeven.replaceRelegated(yearSevenTable, promotedYearSeven);
        yearEight.positionDifference(yearSevenReadyToCompare, yearEightTable);
        NineteenNinetyThree.storeDifference(yearSevenReadyToCompare, yearEightTable);
        System.out.println("");

        TwoThousandOne yearNine = new TwoThousandOne();
        ArrayList<String> yearNineTable = yearNine.createTable();
        String[] promotedYearEight = yearEight.createPromoted();
        ArrayList<String> yearEightReadyToCompare = yearEight.replaceRelegated(yearEightTable, promotedYearEight);
        yearNine.positionDifference(yearEightReadyToCompare, yearNineTable);
        NineteenNinetyThree.storeDifference(yearEightReadyToCompare, yearNineTable);
        System.out.println("");

        TwoThousandTwo yearTen = new TwoThousandTwo();
        ArrayList<String> yearTenTable = yearTen.createTable();
        String[] promotedYearNine = yearNine.createPromoted();
        ArrayList<String> yearNineReadyToCompare = yearNine.replaceRelegated(yearNineTable, promotedYearNine);
        yearTen.positionDifference(yearNineReadyToCompare, yearTenTable);
        NineteenNinetyThree.storeDifference(yearNineReadyToCompare, yearTenTable);
        System.out.println("");

        TwoThousandThree yearEleven = new TwoThousandThree();
        ArrayList<String> yearElevenTable = yearEleven.createTable();
        String[] promotedYearTen = yearTen.createPromoted();
        ArrayList<String> yearTenReadyToCompare = yearTen.replaceRelegated(yearTenTable, promotedYearTen);
        yearEleven.positionDifference(yearTenReadyToCompare, yearElevenTable);
        NineteenNinetyThree.storeDifference(yearTenReadyToCompare, yearElevenTable);
        System.out.println("");

        TwoThousandFour yearTwelve = new TwoThousandFour();
        ArrayList<String> yearTwelveTable = yearTwelve.createTable();
        String[] promotedYearEleven = yearEleven.createPromoted();
        ArrayList<String> yearElevenReadyToCompare = yearEleven.replaceRelegated(yearElevenTable, promotedYearEleven);
        yearTwelve.positionDifference(yearElevenReadyToCompare, yearTwelveTable);
        NineteenNinetyThree.storeDifference(yearElevenReadyToCompare, yearTwelveTable);
        System.out.println("");

        TwoThousandFive yearThirteen = new TwoThousandFive();
        ArrayList<String> yearThirteenTable = yearThirteen.createTable();
        String[] promotedYearTwelve = yearTwelve.createPromoted();
        ArrayList<String> yearTwelveReadyToCompare = yearTwelve.replaceRelegated(yearTwelveTable, promotedYearTwelve);
        yearThirteen.positionDifference(yearTwelveReadyToCompare, yearThirteenTable);
        NineteenNinetyThree.storeDifference(yearTwelveReadyToCompare, yearThirteenTable);
        System.out.println("");

        TwoThousandSix yearFourteen = new TwoThousandSix();
        ArrayList<String> yearFourteenTable = yearFourteen.createTable();
        String[] promotedYearThirteen = yearThirteen.createPromoted();
        ArrayList<String> yearThirteenReadyToCompare = yearThirteen.replaceRelegated(yearThirteenTable, promotedYearThirteen);
        yearFourteen.positionDifference(yearThirteenReadyToCompare, yearFourteenTable);
        NineteenNinetyThree.storeDifference(yearThirteenReadyToCompare, yearFourteenTable);
        System.out.println("");

        TwoThousandSeven yearFifteen = new TwoThousandSeven();
        ArrayList<String> yearFifteenTable = yearFifteen.createTable();
        String[] promotedYearFourteen = yearFourteen.createPromoted();
        ArrayList<String> yearFourteenReadyToCompare = yearFourteen.replaceRelegated(yearFourteenTable, promotedYearFourteen);
        yearFifteen.positionDifference(yearFourteenReadyToCompare, yearFifteenTable);
        NineteenNinetyThree.storeDifference(yearFourteenReadyToCompare, yearFifteenTable);
        System.out.println("");

        TwoThousandEight yearSixteen = new TwoThousandEight();
        ArrayList<String> yearSixteenTable = yearSixteen.createTable();
        String[] promotedYearFifteen = yearFifteen.createPromoted();
        ArrayList<String> yearFifteenReadyToCompare = yearFifteen.replaceRelegated(yearFifteenTable, promotedYearFifteen);
        yearSixteen.positionDifference(yearFifteenReadyToCompare, yearSixteenTable);
        NineteenNinetyThree.storeDifference(yearFifteenReadyToCompare, yearSixteenTable);
        System.out.println("");

        TwoThousandNine yearSeventeen = new TwoThousandNine();
        ArrayList<String> yearSeventeenTable = yearSeventeen.createTable();
        String[] promotedYearSixteen = yearSixteen.createPromoted();
        ArrayList<String> yearSixteenReadyToCompare = yearSixteen.replaceRelegated(yearSixteenTable, promotedYearSixteen);
        yearSeventeen.positionDifference(yearSixteenReadyToCompare, yearSeventeenTable);
        NineteenNinetyThree.storeDifference(yearSixteenReadyToCompare, yearSeventeenTable);
        System.out.println("");

        TwoThousandTen yearEighteen = new TwoThousandTen();
        ArrayList<String> yearEighteenTable = yearEighteen.createTable();
        String[] promotedYearSeventeen = yearSeventeen.createPromoted();
        ArrayList<String> yearSeventeenReadyToCompare = yearSeventeen.replaceRelegated(yearSeventeenTable, promotedYearSeventeen);
        yearEighteen.positionDifference(yearSeventeenReadyToCompare, yearEighteenTable);
        NineteenNinetyThree.storeDifference(yearSeventeenReadyToCompare, yearEighteenTable);
        System.out.println("");

        TwoThousandEleven yearNineteen = new TwoThousandEleven();
        ArrayList<String> yearNineteenTable = yearNineteen.createTable();
        String[] promotedYearEighteen = yearEighteen.createPromoted();
        ArrayList<String> yearEighteenReadyToCompare = yearEighteen.replaceRelegated(yearEighteenTable, promotedYearEighteen);
        yearNineteen.positionDifference(yearEighteenReadyToCompare, yearNineteenTable);
        NineteenNinetyThree.storeDifference(yearEighteenReadyToCompare, yearNineteenTable);
        System.out.println("");

        TwoThousandTwelve yearTwenty = new TwoThousandTwelve();
        ArrayList<String> yearTwentyTable = yearTwenty.createTable();
        String[] promotedYearNineteen = yearNineteen.createPromoted();
        ArrayList<String> yearNineteenReadyToCompare = yearNineteen.replaceRelegated(yearNineteenTable, promotedYearNineteen);
        yearTwenty.positionDifference(yearNineteenReadyToCompare, yearTwentyTable);
        NineteenNinetyThree.storeDifference(yearNineteenReadyToCompare, yearTwentyTable);
        System.out.println("");

        TwoThousandThirteen yearTwentyOne = new TwoThousandThirteen();
        ArrayList<String> yearTwentyOneTable = yearTwentyOne.createTable();
        String[] promotedYearTwenty = yearTwenty.createPromoted();
        ArrayList<String> yearTwentyReadyToCompare = yearTwenty.replaceRelegated(yearTwentyTable, promotedYearTwenty);
        yearTwentyOne.positionDifference(yearTwentyReadyToCompare, yearTwentyOneTable);
        NineteenNinetyThree.storeDifference(yearTwentyReadyToCompare, yearTwentyOneTable);
        System.out.println("");

        TwoThousandFourteen yearTwentyTwo = new TwoThousandFourteen();
        ArrayList<String> yearTwentyTwoTable = yearTwentyTwo.createTable();
        String[] promotedYearTwentyOne = yearTwentyOne.createPromoted();
        ArrayList<String> yearTwentyOneReadyToCompare = yearTwentyOne.replaceRelegated(yearTwentyOneTable, promotedYearTwentyOne);
        yearTwentyTwo.positionDifference(yearTwentyOneReadyToCompare, yearTwentyTwoTable);
        NineteenNinetyThree.storeDifference(yearTwentyOneReadyToCompare, yearTwentyTwoTable);
        System.out.println("");

        TwoThousandFifteen yearTwentyThree = new TwoThousandFifteen();
        ArrayList<String> yearTwentyThreeTable = yearTwentyThree.createTable();
        String[] promotedYearTwentyTwo = yearTwentyTwo.createPromoted();
        ArrayList<String> yearTwentyTwoReadyToCompare = yearTwentyTwo.replaceRelegated(yearTwentyTwoTable, promotedYearTwentyTwo);
        yearTwentyThree.positionDifference(yearTwentyTwoReadyToCompare, yearTwentyThreeTable);
        NineteenNinetyThree.storeDifference(yearTwentyTwoReadyToCompare, yearTwentyThreeTable);
        System.out.println("");

        TwoThousandSixteen yearTwentyFour = new TwoThousandSixteen();
        ArrayList<String> yearTwentyFourTable = yearTwentyFour.createTable();
        String[] promotedYearTwentyThree = yearTwentyThree.createPromoted();
        ArrayList<String> yearTwentyThreeReadyToCompare = yearTwentyThree.replaceRelegated(yearTwentyThreeTable, promotedYearTwentyThree);
        yearTwentyFour.positionDifference(yearTwentyThreeReadyToCompare, yearTwentyFourTable);
        NineteenNinetyThree.storeDifference(yearTwentyThreeReadyToCompare, yearTwentyFourTable);
        System.out.println("");

        TwoThousandSeventeen yearTwentyFive = new TwoThousandSeventeen();
        ArrayList<String> yearTwentyFiveTable = yearTwentyFive.createTable();
        String[] promotedYearTwentyFour = yearTwentyFour.createPromoted();
        ArrayList<String> yearTwentyFourReadyToCompare = yearTwentyFour.replaceRelegated(yearTwentyFourTable, promotedYearTwentyFour);
        yearTwentyFive.positionDifference(yearTwentyFourReadyToCompare, yearTwentyFiveTable);
        NineteenNinetyThree.storeDifference(yearTwentyFourReadyToCompare, yearTwentyFiveTable);
        System.out.println("");

        TwoThousandEighteen yearTwentySix = new TwoThousandEighteen();
        ArrayList<String> yearTwentySixTable = yearTwentySix.createTable();
        String[] promotedYearTwentyFive = yearTwentyFive.createPromoted();
        ArrayList<String> yearTwentyFiveReadyToCompare = yearTwentyFive.replaceRelegated(yearTwentyFiveTable, promotedYearTwentyFive);
        yearTwentySix.positionDifference(yearTwentyFiveReadyToCompare, yearTwentySixTable);
        NineteenNinetyThree.storeDifference(yearTwentyFiveReadyToCompare, yearTwentySixTable);
        System.out.println("");

        String[] promotedYearTwentySix = yearTwentySix.createPromoted();
        ArrayList<String> yearTwentySixReadyToCompare = yearTwentyFive.replaceRelegated(yearTwentySixTable, promotedYearTwentySix);
        //System.out.println(yearTwentySixReadyToCompare);


        NineteenNinetyThree print = new NineteenNinetyThree();
        // print.printArray(whereNumbrOneFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereOneWillFini = NineteenNinetyThree.printMostOften(whereNumbrOneFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereTwoWillFini = NineteenNinetyThree.printMostOften(whereNumbrTwoFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereThreeWillFini = NineteenNinetyThree.printMostOften(whereNumbrThreeFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereFourWillFini = NineteenNinetyThree.printMostOften(whereNumbrFourFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereFiveWillFini = NineteenNinetyThree.printMostOften(whereNumbrFiveFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereSixWillFini = NineteenNinetyThree.printMostOften(whereNumbrSixFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereSevenWillFini = NineteenNinetyThree.printMostOften(whereNumbrSevenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereEightWillFini = NineteenNinetyThree.printMostOften(whereNumbrEightFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereNineWillFini = NineteenNinetyThree.printMostOften(whereNumbrNineFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereTenWillFini = NineteenNinetyThree.printMostOften(whereNumbrTenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereElevenWillFini = NineteenNinetyThree.printMostOften(whereNumbrElevenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereTwelveWillFini = NineteenNinetyThree.printMostOften(whereNumbrTwelveFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereThirteenWillFini = NineteenNinetyThree.printMostOften(whereNumbrThirteenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereFourteenWillFini = NineteenNinetyThree.printMostOften(whereNumbrFourteenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereFifteenWillFini = NineteenNinetyThree.printMostOften(whereNumbrFifteenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereSixteenWillFini = NineteenNinetyThree.printMostOften(whereNumbrSixteenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereSeventeenWillFini = NineteenNinetyThree.printMostOften(whereNumbrSeventeenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereEighteenWillFini = NineteenNinetyThree.printMostOften(whereNumbrEighteenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereNineteenWillFini = NineteenNinetyThree.printMostOften(whereNumbrNineteenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereTwentyWillFini = NineteenNinetyThree.printMostOften(whereNumbrTwentyFinishedNextYear);

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : whereOneWillFini) {

            if (entry.equals(whereOneWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
        i = 0;
        for (Map.Entry<Integer, Integer> entry : whereTwoWillFini) {

            if (entry.equals(whereTwoWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
        i = 0;
        for (Map.Entry<Integer, Integer> entry : whereThreeWillFini) {

            if (entry.equals(whereThreeWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
        i = 0;
        for (Map.Entry<Integer, Integer> entry : whereFourWillFini) {

            if (entry.equals(whereFourWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
        for (Map.Entry<Integer, Integer> entry : whereFiveWillFini) {

            if (entry.equals(whereFiveWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
        i = 0;
        for (Map.Entry<Integer, Integer> entry : whereSixWillFini) {

            if (entry.equals(whereSixWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
        i = 0;
        for (Map.Entry<Integer, Integer> entry : whereSevenWillFini) {

            if (entry.equals(whereSevenWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
        i = 0;
        for (Map.Entry<Integer, Integer> entry : whereEightWillFini) {

            if (entry.equals(whereEightWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
            i = 0;
        for (Map.Entry<Integer, Integer> entry : whereNineWillFini) {

            if (entry.equals(whereNineWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
        i = 0;
        for (Map.Entry<Integer, Integer> entry : whereTenWillFini) {

            if (entry.equals(whereTenWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
        i = 0;
        for (Map.Entry<Integer, Integer> entry : whereElevenWillFini) {

            if (entry.equals(whereElevenWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
        i = 0;
        for (Map.Entry<Integer, Integer> entry : whereTwelveWillFini) {

            if (entry.equals(whereTwelveWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
            i = 0;
        for (Map.Entry<Integer, Integer> entry : whereThirteenWillFini) {

            if (entry.equals(whereThirteenWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
            i = 0;
            for (Map.Entry<Integer, Integer> entry : whereFourteenWillFini) {

                if (entry.equals(whereFourteenWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                    leaguePredicted.add(entry.getKey());
                    break;
                } else {
                    i++;
                }
            }
            i = 0;
            for (Map.Entry<Integer, Integer> entry : whereFifteenWillFini) {

                if (entry.equals(whereFifteenWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                    leaguePredicted.add(entry.getKey());
                    break;
                } else {
                    i++;
                }
            }
            i = 0;
            for (Map.Entry<Integer, Integer> entry : whereSixteenWillFini) {

                if (entry.equals(whereSixteenWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                    leaguePredicted.add(entry.getKey());
                    break;
                    } else {
                    i++;
                    }
            }
            i = 0;
            for (Map.Entry<Integer, Integer> entry : whereSeventeenWillFini) {

                if (entry.equals(whereSeventeenWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                    leaguePredicted.add(entry.getKey());
                    break;
                    }
                    else {
                    i++;
                    }
            }
            i = 0;
            for (Map.Entry<Integer, Integer> entry : whereEighteenWillFini) {

                if (entry.equals(whereEighteenWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))) {
                    leaguePredicted.add(entry.getKey());
                    break;
                    } else {
                    i++;
                    }
            }
            i = 0;
            for (Map.Entry<Integer, Integer> entry : whereNineteenWillFini) {

                if (entry.equals(whereNineteenWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))&& (entry.getKey()<21)) {
                    leaguePredicted.add(entry.getKey());
                    break;
                    } else {
                    i++;
                    }
            }
            i = 0;
            for (Map.Entry<Integer, Integer> entry : whereTwentyWillFini) {
                if (entry.equals(whereTwentyWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())))&&(entry.getKey() < 21)) {
                    leaguePredicted.add(entry.getKey());
                    break;
                    } else {
                    i++;
                    }
            }
            System.out.println(leaguePredicted);
            i = 0;
            for (String entry :yearTwentySixTable){
                for(String team : leaguePredicted){
                     

                }
            }

    }
}
