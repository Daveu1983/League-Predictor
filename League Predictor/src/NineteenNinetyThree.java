


import java.util.*;
import java.util.stream.Collectors;
import static java.util.Collections.reverseOrder;

import static java.lang.Integer.parseInt;

public class NineteenNinetyThree {


    public ArrayList<String> createTable() {

        ArrayList<String> nineteen93 = new ArrayList<String>();
        {

            nineteen93.add(LeaguePredictor.MANCHESTER_UNITED);
            nineteen93.add(LeaguePredictor.ASTON_VILLA);
            nineteen93.add(LeaguePredictor.NORWICH_CITY);
            nineteen93.add(LeaguePredictor.BLACKBURN_ROVERS);
            nineteen93.add(LeaguePredictor.QPR);
            nineteen93.add(LeaguePredictor.LIVERPOOL);
            nineteen93.add(LeaguePredictor.SHEFFIELD_WEDNESDAY);
            nineteen93.add(LeaguePredictor.TOTTENHAM_HOTSPUR);
            nineteen93.add(LeaguePredictor.MANCHESTER_CITY);
            nineteen93.add(LeaguePredictor.ARSENAL);
            nineteen93.add(LeaguePredictor.CHELSEA);
            nineteen93.add(LeaguePredictor.WIMBLEDON);
            nineteen93.add(LeaguePredictor.EVERTON);
            nineteen93.add(LeaguePredictor.SHEFFIELD_UNITED);
            nineteen93.add(LeaguePredictor.COVENTRY_CITY);
            nineteen93.add(LeaguePredictor.IPSWICH_TOWN);
            nineteen93.add(LeaguePredictor.LEEDS_UNITED);
            nineteen93.add(LeaguePredictor.SOUTHAMPTON);
            nineteen93.add(LeaguePredictor.OLDHAM_ATHLETIC);
            nineteen93.add(LeaguePredictor.CRYSTAL_PALACE);
            nineteen93.add(LeaguePredictor.MIDDLESBOROUGH);
            nineteen93.add(LeaguePredictor.NOTTINGHAM_FOREST);
            return nineteen93;
        }
    }

    public void printArray(ArrayList<Integer> year) {
        for (Integer item : year) {
            System.out.println(item);
        }
    }

    public String[] createPromoted() {
        String[] promoted1993 = {LeaguePredictor.NEWCASTLE, LeaguePredictor.WEST_HAM_UNITED, LeaguePredictor.SWINDON_TOWN};
        return promoted1993;

    }

    public ArrayList<String> replaceRelegated(ArrayList<String> readyToCompareNextYear, String[] promoted) {
        int numberOfTeams = readyToCompareNextYear.size();
        int numberOfPromoted = promoted.length;
        numberOfTeams -= numberOfPromoted;
        for (int i = 0; i < promoted.length; i++) {
            readyToCompareNextYear.set(numberOfTeams, promoted[i]);
            numberOfTeams++;
        }
        return readyToCompareNextYear;

    }

    public void positionDifference(ArrayList<String> previousYear, ArrayList<String> currentYear) {
        String[] currentYearList = currentYear.toArray(new String[0]);
        String[] previousYearList = previousYear.toArray(new String[0]);
        int k = 0;
        for (int j = 0; j < currentYearList.length; j++) {
            for (int i = 0; i < previousYearList.length; i++) {
                if (previousYearList[i] == currentYearList[j]) {
                    if (i == j) {
                        System.out.println(previousYearList[i] + " has stayed in the same position");
                    }
                    if (i > j) {
                        k = i - j;
                        System.out.println(previousYearList[i] + " has moved up " + k + " places");
                    }
                    if (i < j) {
                        k = j - i;
                        System.out.println(previousYearList[i] + " has moved down " + k + " places");
                    }
                }
            }

        }
    }

    public static void storeDifference(ArrayList<String> previousYear, ArrayList<String> currentYear) {
        String[] currentYearList = currentYear.toArray(new String[0]);
        String[] previousYearList = previousYear.toArray(new String[0]);
        for (int j = 0; j < currentYearList.length; j++) {
            for (int i = 0; i < previousYearList.length; i++) {
                if (previousYearList[i] == currentYearList[j]) {
                    Integer k = j + 1;

                    if (i == 0) {
                        LeaguePredictor.whereNumbrOneFinishedNextYear.add(k);
                    }
                    if (i == 1) {
                        LeaguePredictor.whereNumbrTwoFinishedNextYear.add(k);
                    }
                    if (i == 2) {
                        LeaguePredictor.whereNumbrThreeFinishedNextYear.add(k);
                    }
                    if (i == 3) {
                        LeaguePredictor.whereNumbrFourFinishedNextYear.add(k);
                    }
                    if (i == 4) {
                        LeaguePredictor.whereNumbrFiveFinishedNextYear.add(k);
                    }
                    if (i == 5) {
                        LeaguePredictor.whereNumbrSixFinishedNextYear.add(k);
                    }
                    if (i == 6) {
                        LeaguePredictor.whereNumbrSevenFinishedNextYear.add(k);
                    }
                    if (i == 7) {
                        LeaguePredictor.whereNumbrEightFinishedNextYear.add(k);
                    }
                    if (i == 8) {
                        LeaguePredictor.whereNumbrNineFinishedNextYear.add(k);
                    }
                    if (i == 9) {
                        LeaguePredictor.whereNumbrTenFinishedNextYear.add(k);
                    }
                    if (i == 10) {
                        LeaguePredictor.whereNumbrElevenFinishedNextYear.add(k);
                    }
                    if (i == 11) {
                        LeaguePredictor.whereNumbrTwelveFinishedNextYear.add(k);
                    }
                    if (i == 12) {
                        LeaguePredictor.whereNumbrThirteenFinishedNextYear.add(k);
                    }
                    if (i == 13) {
                        LeaguePredictor.whereNumbrFourteenFinishedNextYear.add(k);
                    }
                    if (i == 14) {
                        LeaguePredictor.whereNumbrFifteenFinishedNextYear.add(k);
                    }
                    if (i == 15) {
                        LeaguePredictor.whereNumbrSixteenFinishedNextYear.add(k);
                    }
                    if (i == 16) {
                        LeaguePredictor.whereNumbrSeventeenFinishedNextYear.add(k);
                    }
                    if (i == 17) {
                        LeaguePredictor.whereNumbrEighteenFinishedNextYear.add(k);
                    }
                    if (i == 18) {
                        LeaguePredictor.whereNumbrNineteenFinishedNextYear.add(k);
                    }
                    if (i == 19) {
                        LeaguePredictor.whereNumbrTwentyFinishedNextYear.add(k);
                    }


                }
            }
        }
    }

    public static List<Map.Entry<Integer,Integer>> printMostOften(ArrayList<Integer> mostOften) {
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
       // System.out.println(sorted_map);
        return sorted_map;
    }
}


