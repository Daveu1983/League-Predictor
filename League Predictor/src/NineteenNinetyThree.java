import java.util.ArrayList;

public class NineteenNinetyThree {
	
	public ArrayList<String> createTable() {
	 
	ArrayList<String> nineteen93 = new ArrayList<String>(); {  
	    
	    nineteen93.add("Manchester United"); 
	    nineteen93.add("Aston Villa");
	    nineteen93.add("Norwich City");
	    nineteen93.add("Blackburn Rovers"); 
	    nineteen93.add("QPR");
	    nineteen93.add("Liverpool"); 
	    nineteen93.add("Sheffield Wednesday");
	    nineteen93.add("Tottenham Hotspur");
	    nineteen93.add("Manchester City");
	    nineteen93.add("Arsesnal");
	    nineteen93.add("Chelsea");
	    nineteen93.add("Wimbledon");
	    nineteen93.add("Everton"); 
	    nineteen93.add("Sheffield United");
	    nineteen93.add("Coventry City");
	    nineteen93.add("Ipswich Town"); 
	    nineteen93.add("Leeds United"); 
	    nineteen93.add("Southampton"); 
	    nineteen93.add("Oldham Athletic");
	    nineteen93.add("Crystal Palace"); 
	    nineteen93.add("Middlesborough"); 
	    nineteen93.add("Nottingham Forest");
	    return nineteen93;
		}
	}
	public void printTable (ArrayList<String>year){
		for(String item:year) {
	    	System.out.println(item);
		}
	}
	
	public String [] createPromoted(){
		String[] promoted1993  = {"NewCastle United", "West Ham United", "Swindon Town"};
			return promoted1993;
		
	}
	public ArrayList<String> replaceRelegated(ArrayList<String>readyToCompareNextYear, String[]promoted){
		int numberOfTeams = readyToCompareNextYear.size();
		int numberOfPromoted = promoted.length;
		numberOfTeams -= numberOfPromoted;
		for(int i = 0; i < promoted.length; i++){
			readyToCompareNextYear.set(numberOfTeams, promoted[i]);
			numberOfTeams++;
			}
		return readyToCompareNextYear;
		
	}
	public void positionDifference (ArrayList<String>previousYear, ArrayList<String>currentYear){
		String [] currentYearList = currentYear.toArray(new String[0]);
		String [] previousYearList = previousYear.toArray(new String[0]);
		int k = 0;
		for(int j = 0; j < currentYearList.length; j++){
			for (int i = 0; i < previousYearList.length; i++){
				if (previousYearList[i] == currentYearList[j]){
					if (i == j){
						System.out.println(previousYearList[i] + " has stayed in the same position");
					}
					if (i > j){
						k = i - j;
						System.out.println(previousYearList[i] + " has moved up " +k + " places");
					}
					if (i < j){
						k = j - i;
						System.out.println(previousYearList[i] + " has moved down " +k + " places");
					}
				}		
			}
			
		}
	}
}




