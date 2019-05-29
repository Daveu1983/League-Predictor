import java.util.*;
import java.util.stream.Collectors;
import static java.util.Collections.reverseOrder;

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

}


