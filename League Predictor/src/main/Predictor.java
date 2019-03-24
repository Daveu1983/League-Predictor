import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

class Predictor {
    private static ArrayList<Integer> leaguePredicted = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrOneFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrTwoFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrThreeFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrFourFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrFiveFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrSixFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrSevenFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrEightFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrNineFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrTenFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrElevenFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrTwelveFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrThirteenFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrFourteenFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrFifteenFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrSixteenFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrSeventeenFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrEighteenFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrNineteenFinishedNextYear = new ArrayList<>();
    private static ArrayList<Integer> whereNumbrTwentyFinishedNextYear = new ArrayList<>();
    private static Map<String, Integer> theLeague = new HashMap();

    static void predict() {
        compareOneSeasonToTheNextAndStoreDifference();
        getMostCommonNextYearPosition();
        predictLeagueFromCurrentLastTable();
    }

    private static void compareOneSeasonToTheNextAndStoreDifference() {
        NineteenNinetyThree[] seasons = createLeagueYears();

        ArrayList<String> currentTable;
        String[] promoted;
        ArrayList<String> currentTableWithPromoted;
        ArrayList<String> nextTable;

        for (int i = 0; i < (seasons.length-1); i++) {
            currentTable = seasons[i].createTable();
            nextTable = seasons[i+1].createTable();
            promoted = seasons[i].createPromoted();
            currentTableWithPromoted = seasons[i].replaceRelegated(currentTable,promoted);
            storeDifference(currentTableWithPromoted,nextTable);
        }
    }

    private static NineteenNinetyThree[] createLeagueYears() {
        NineteenNinetyThree yearOne = new NineteenNinetyThree();
        NineteenNinetyFour yearTwo = new NineteenNinetyFour();
        NineteenNinetyFive yearThree = new NineteenNinetyFive();
        NineteenNinetySix yearFour = new NineteenNinetySix();
        NineteenNinetySeven yearFive = new NineteenNinetySeven();
        NineteenNinetyEight yearSix = new NineteenNinetyEight();
        NineteenNinetyNine yearSeven = new NineteenNinetyNine();
        TwoThousand yearEight = new TwoThousand();
        TwoThousandOne yearNine = new TwoThousandOne();
        TwoThousandTwo yearTen = new TwoThousandTwo();
        TwoThousandThree yearEleven = new TwoThousandThree();
        TwoThousandFour yearTwelve = new TwoThousandFour();
        TwoThousandFive yearThirteen = new TwoThousandFive();
        TwoThousandSix yearFourteen = new TwoThousandSix();
        TwoThousandSeven yearFifteen = new TwoThousandSeven();
        TwoThousandEight yearSixteen = new TwoThousandEight();
        TwoThousandNine yearSeventeen = new TwoThousandNine();
        TwoThousandTen yearEighteen = new TwoThousandTen();
        TwoThousandEleven yearNineteen = new TwoThousandEleven();
        TwoThousandTwelve yearTwenty = new TwoThousandTwelve();
        TwoThousandThirteen yearTwentyOne = new TwoThousandThirteen();
        TwoThousandFourteen yearTwentyTwo = new TwoThousandFourteen();
        TwoThousandFifteen yearTwentyThree = new TwoThousandFifteen();
        TwoThousandSixteen yearTwentyFour = new TwoThousandSixteen();
        TwoThousandSeventeen yearTwentyFive = new TwoThousandSeventeen();
        TwoThousandEighteen yearTwentySix = new TwoThousandEighteen();

        NineteenNinetyThree[] seasons = new NineteenNinetyThree[26];
        seasons[0] = yearOne;
        seasons[1] = yearTwo;
        seasons[2] = yearThree;
        seasons[3] = yearFour;
        seasons[4] = yearFive;
        seasons[5] = yearSix;
        seasons[6] = yearSeven;
        seasons[7] = yearEight;
        seasons[8] = yearNine;
        seasons[9] = yearTen;
        seasons[10] = yearEleven;
        seasons[11] = yearTwelve;
        seasons[12] = yearThirteen;
        seasons[13] = yearFourteen;
        seasons[14] = yearFifteen;
        seasons[15] = yearSixteen;
        seasons[16] = yearSeventeen;
        seasons[17] = yearEighteen;
        seasons[18] = yearNineteen;
        seasons[19] = yearTwenty;
        seasons[20] = yearTwentyOne;
        seasons[21] = yearTwentyTwo;
        seasons[22] = yearTwentyThree;
        seasons[23] = yearTwentyFour;
        seasons[24] = yearTwentyFive;
        seasons[25] = yearTwentySix;
        return seasons;
    }
   private static void storeDifference(ArrayList<String> previousYear, ArrayList<String> currentYear) {
        for (int j = 0; j < currentYear.size(); j++) {
            for (int i = 0; i < previousYear.size(); i++) {
                if (previousYear.get(i) == currentYear.get(j)) {
                    Integer k = j + 1;

                    if (i == 0) {
                        whereNumbrOneFinishedNextYear.add(k);
                    }
                    if (i == 1) {
                        whereNumbrTwoFinishedNextYear.add(k);
                    }
                    if (i == 2) {
                        whereNumbrThreeFinishedNextYear.add(k);
                    }
                    if (i == 3) {
                        whereNumbrFourFinishedNextYear.add(k);
                    }
                    if (i == 4) {
                        whereNumbrFiveFinishedNextYear.add(k);
                    }
                    if (i == 5) {
                        whereNumbrSixFinishedNextYear.add(k);
                    }
                    if (i == 6) {
                        whereNumbrSevenFinishedNextYear.add(k);
                    }
                    if (i == 7) {
                        whereNumbrEightFinishedNextYear.add(k);
                    }
                    if (i == 8) {
                        whereNumbrNineFinishedNextYear.add(k);
                    }
                    if (i == 9) {
                        whereNumbrTenFinishedNextYear.add(k);
                    }
                    if (i == 10) {
                        whereNumbrElevenFinishedNextYear.add(k);
                    }
                    if (i == 11) {
                        whereNumbrTwelveFinishedNextYear.add(k);
                    }
                    if (i == 12) {
                        whereNumbrThirteenFinishedNextYear.add(k);
                    }
                    if (i == 13) {
                        whereNumbrFourteenFinishedNextYear.add(k);
                    }
                    if (i == 14) {
                        whereNumbrFifteenFinishedNextYear.add(k);
                    }
                    if (i == 15) {
                        whereNumbrSixteenFinishedNextYear.add(k);
                    }
                    if (i == 16) {
                        whereNumbrSeventeenFinishedNextYear.add(k);
                    }
                    if (i == 17) {
                        whereNumbrEighteenFinishedNextYear.add(k);
                    }
                    if (i == 18) {
                        whereNumbrNineteenFinishedNextYear.add(k);
                    }
                    if (i == 19) {
                        whereNumbrTwentyFinishedNextYear.add(k);
                    }


                }
            }
        }
    }
    private static void getMostCommonNextYearPosition() {
        List<Map.Entry<Integer, Integer>> whereOneWillFini = storeMostOften(whereNumbrOneFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereTwoWillFini = storeMostOften(whereNumbrTwoFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereThreeWillFini = storeMostOften(whereNumbrThreeFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereFourWillFini = storeMostOften(whereNumbrFourFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereFiveWillFini = storeMostOften(whereNumbrFiveFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereSixWillFini = storeMostOften(whereNumbrSixFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereSevenWillFini = storeMostOften(whereNumbrSevenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereEightWillFini = storeMostOften(whereNumbrEightFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereNineWillFini = storeMostOften(whereNumbrNineFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereTenWillFini = storeMostOften(whereNumbrTenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereElevenWillFini = storeMostOften(whereNumbrElevenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereTwelveWillFini = storeMostOften(whereNumbrTwelveFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereThirteenWillFini = storeMostOften(whereNumbrThirteenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereFourteenWillFini = storeMostOften(whereNumbrFourteenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereFifteenWillFini = storeMostOften(whereNumbrFifteenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereSixteenWillFini = storeMostOften(whereNumbrSixteenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereSeventeenWillFini = storeMostOften(whereNumbrSeventeenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereEighteenWillFini = storeMostOften(whereNumbrEighteenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereNineteenWillFini = storeMostOften(whereNumbrNineteenFinishedNextYear);
        List<Map.Entry<Integer, Integer>> whereTwentyWillFini = storeMostOften(whereNumbrTwentyFinishedNextYear);

        wherePosistionFinishedNextYear(whereOneWillFini);
        wherePosistionFinishedNextYear(whereTwoWillFini);
        wherePosistionFinishedNextYear(whereThreeWillFini);
        wherePosistionFinishedNextYear(whereFourWillFini);
        wherePosistionFinishedNextYear(whereFiveWillFini);
        wherePosistionFinishedNextYear(whereSixWillFini);
        wherePosistionFinishedNextYear(whereSevenWillFini);
        wherePosistionFinishedNextYear(whereEightWillFini);
        wherePosistionFinishedNextYear(whereNineWillFini);
        wherePosistionFinishedNextYear(whereTenWillFini);
        wherePosistionFinishedNextYear(whereElevenWillFini);
        wherePosistionFinishedNextYear(whereTwelveWillFini);
        wherePosistionFinishedNextYear(whereThirteenWillFini);
        wherePosistionFinishedNextYear(whereFourteenWillFini);
        wherePosistionFinishedNextYear(whereFifteenWillFini);
        wherePosistionFinishedNextYear(whereSixteenWillFini);
        wherePosistionFinishedNextYear(whereSeventeenWillFini);
        wherePosistionFinishedNextYear(whereEighteenWillFini);
        wherePosistionFinishedNextYear(whereNineteenWillFini);
        wherePosistionFinishedNextYear(whereTwentyWillFini);
    }

    public static List<Map.Entry<Integer,Integer>> storeMostOften(ArrayList<Integer> mostOften) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int m = 0; m < mostOften.size(); m++) {
            Integer count = map.get(mostOften.get(m));
            map.put(mostOften.get(m), count == null ? 1 : count + 1);

        }

        List<Map.Entry<Integer, Integer>> sorted_map =
                map.entrySet()
                        .stream()
                        .sorted(reverseOrder(Map.Entry.comparingByValue()))
                        .collect(Collectors.toList());
        return sorted_map;
    }

    private static void predictLeagueFromCurrentLastTable() {
        TwoThousandEighteen tableToPredict = new TwoThousandEighteen();
        ArrayList<String> lastTable = tableToPredict.createTable();
        String[] lastPromoted = tableToPredict.createPromoted();
        ArrayList<String> lastTableToCompare = tableToPredict.replaceRelegated(lastTable,lastPromoted);

        for (int d = 0; d < lastTableToCompare.size(); d++) {

            theLeague.put(lastTableToCompare.get(d), leaguePredicted.get(d));


        }

        List<Map.Entry<String, Integer>> theLeagueSorted =
                theLeague.entrySet()
                        .stream()
                        .sorted((Map.Entry.comparingByValue()))
                        .collect(Collectors.toList());

        for (Map.Entry<String, Integer> entry : theLeagueSorted) {

            System.out.println(entry);
        }
    }

    private static void wherePosistionFinishedNextYear(List<Map.Entry<Integer, Integer>> wherePositionWillFini) {
        int i;
        i = 0;
        for (Map.Entry<Integer, Integer> entry : wherePositionWillFini) {
            if (isaBoolean(wherePositionWillFini, i, entry)) {
                leaguePredicted.add(entry.getKey());
                break;
            } else {
                i++;
            }
        }
    }

    private static boolean isaBoolean(List < Map.Entry < Integer, Integer >> wherePositionWillFini,int i, Map.
            Entry<Integer, Integer> entry){
        return entry.equals(wherePositionWillFini.get(i)) && (!(leaguePredicted.contains(entry.getKey())));
    }

}

