import java.util.ArrayList;
public class NineteenNinetyFour extends NineteenNinetyThree {
	public ArrayList<String> createTable() {
		
		ArrayList<String> nineteen94 = new ArrayList<String>(); {
    
		nineteen94.add("Manchester United");
		nineteen94.add("Blackburn Rovers");
		nineteen94.add("Newcastle");
		nineteen94.add("Arsesnal");
		nineteen94.add("Leeds United");
		nineteen94.add("Wimbledon"); 
		nineteen94.add("Sheffield Wednesday");
		nineteen94.add("Liverpool"); 
		nineteen94.add("QPR");
		nineteen94.add("Aston Villa");
		nineteen94.add("Coventry City");
		nineteen94.add("Norwich City"); 
		nineteen94.add("West Ham United"); 
		nineteen94.add("Chelsea");
		nineteen94.add("Tottenham Hotspur");
		nineteen94.add("Manchester City");
		nineteen94.add("Everton");
		nineteen94.add("Southampton");
		nineteen94.add("Ipswich Town"); 
		nineteen94.add("Sheffied United");
		nineteen94.add("Oldham Athletic");
		nineteen94.add("Swindon Town");
		return nineteen94;
		}
	}
	public String [] createPromoted(){
		String[] promoted1993  = {"Crystal Palace", "Nottingham Forest", "Leicester City"};
			return promoted1993;
	}
	public ArrayList<String> replaceRelegated(ArrayList<String>readyToCompareNextYear, String[]promoted){
		readyToCompareNextYear.remove(21);
		readyToCompareNextYear.remove(20);
		int numberOfTeams = readyToCompareNextYear.size();
		int numberOfPromoted = promoted.length;
		numberOfTeams -= numberOfPromoted;
		for(int i = 0; i < promoted.length; i++){
			readyToCompareNextYear.set(numberOfTeams, promoted[i]);
			numberOfTeams++;
			}
		return readyToCompareNextYear;
		
	}
}
