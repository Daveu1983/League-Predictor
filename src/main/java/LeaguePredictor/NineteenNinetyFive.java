package LeaguePredictor;

import java.util.ArrayList;
public class NineteenNinetyFive extends NineteenNinetyThree {
	public ArrayList<String> createTable() {
		 ArrayList<String> nineteen95 = new ArrayList<>();
		 nineteen95.add(LeaguePredictor.BLACKBURN_ROVERS);
		 nineteen95.add(LeaguePredictor.MANCHESTER_UNITED);
		 nineteen95.add(LeaguePredictor.NOTTINGHAM_FOREST);
		 nineteen95.add(LeaguePredictor.LIVERPOOL);
		 nineteen95.add(LeaguePredictor.LEEDS_UNITED);
		 nineteen95.add(LeaguePredictor.NEWCASTLE);
		 nineteen95.add(LeaguePredictor.TOTTENHAM_HOTSPUR);
		 nineteen95.add(LeaguePredictor.QPR);
		 nineteen95.add(LeaguePredictor.WIMBLEDON);
		 nineteen95.add(LeaguePredictor.SOUTHAMPTON);
		 nineteen95.add(LeaguePredictor.CHELSEA);
		 nineteen95.add(LeaguePredictor.ARSENAL);
		 nineteen95.add(LeaguePredictor.SHEFFIELD_WEDNESDAY);
		 nineteen95.add(LeaguePredictor.WEST_HAM_UNITED);
		 nineteen95.add(LeaguePredictor.EVERTON);
		 nineteen95.add(LeaguePredictor.COVENTRY_CITY);
		 nineteen95.add(LeaguePredictor.MANCHESTER_CITY);
		 nineteen95.add(LeaguePredictor.ASTON_VILLA);
		 nineteen95.add(LeaguePredictor.CRYSTAL_PALACE);
		 nineteen95.add(LeaguePredictor.NORWICH_CITY);
		 nineteen95.add(LeaguePredictor.LEICESTER_CITY);
		 nineteen95.add(LeaguePredictor.IPSWICH_TOWN);
		 return nineteen95;
	}			 
	public String [] createPromoted(){
		return new String[]{LeaguePredictor.MIDDLESBOROUGH, LeaguePredictor.BOLTON_WANDERERS};
	}

	public ArrayList<String> replaceRelegated(ArrayList<String>readyToCompareNextYear, String[]promoted){
		readyToCompareNextYear.remove(21);
		readyToCompareNextYear.remove(20);
		int numberOfTeams = readyToCompareNextYear.size();
		int numberOfPromoted = promoted.length;
		numberOfTeams -= numberOfPromoted;
		for (String s : promoted) {
			readyToCompareNextYear.set(numberOfTeams, s);
			numberOfTeams++;
		}
		return readyToCompareNextYear;

	}
}


