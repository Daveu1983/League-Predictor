import java.util.ArrayList;

public class LeaguePredictor {


    public static void main (String[] args) {
    NineteenNinetyThree yearOne = new NineteenNinetyThree();
    ArrayList <String> yearOneTable = yearOne.createTable(); 
   // yearOne.printTable(yearOneTable);
    NineteenNinetyFour yearTwo = new NineteenNinetyFour();
    ArrayList <String> yearTwoTable = yearTwo.createTable();
   // yearTwo.printTable(yearTwoTable);
    String [] promotedYearOne = yearOne.createPromoted();
    ArrayList<String> yearOneReadyToCompare = yearOne.replaceRelegated(yearOneTable, promotedYearOne);
   // yearOne.printTable(yearOneReadyToCompare);
    yearOne.positionDifference(yearOneReadyToCompare, yearTwoTable);
    System.out.println("");
    NineteenNinetyFive yearThree = new NineteenNinetyFive();
    ArrayList <String> yearThreeTable = yearThree.createTable();
    String [] promotedYearTwo = yearTwo.createPromoted();
    ArrayList<String> yearTwoReadyToCompare = yearTwo.replaceRelegated(yearTwoTable, promotedYearTwo);
    yearTwo.positionDifference(yearTwoReadyToCompare, yearThreeTable);
    System.out.println("");
    NineteenNinetySix yearFour = new NineteenNinetySix();
    ArrayList <String> yearFourTable = yearFour.createTable();
    String [] promotedYearThree = yearThree.createPromoted();
    ArrayList<String> yearThreeReadyToCompare = yearThree.replaceRelegated(yearThreeTable, promotedYearThree);
    yearThree.positionDifference(yearThreeReadyToCompare, yearFourTable);
    System.out.println("");
    NineteenNinetySeven yearFive = new NineteenNinetySeven();
    ArrayList <String> yearFiveTable = yearFive.createTable();
    String [] promotedYearFour = yearFour.createPromoted();
    ArrayList<String> yearFourReadyToCompare = yearFour.replaceRelegated(yearFourTable, promotedYearFour);
    yearFour.positionDifference(yearFourReadyToCompare, yearFiveTable);
    System.out.println("");
    }
    /*


   



    String [] nineteen98 = {"Arsenal", "Manchester United",
    "Liverpool", "Chelsea", 
    "Leeds United", "Blackburn Rovers", "Aston Villa", "West Ham United", 
    "Derby County", "Leicester City", "Coventry City", "Southampton", 
    "Newcastle United", "Tottenham Hotspur", "Wimbledon", "Sheffield Wednesday",
    "Everton", "Bolton Wanderers", "Barnsley", "Crystal Palace"};

    String [] nineteen99 = {"Manchester United", 
    "Arsenal", "Chelsea", "Leeds United", 
    "West Ham United", "Aston Villa", "Liverpool", 
    "Derby County", "Middlesborough",
    "Leicester City", "Tottenham Hotspur", "Sheffield Wednesday", 
    "Newcastle United", "Everton", "Coventry City", "Wimbledon", "Southampton",
    "Charlton Athletic", "Blackburn Rovers", "Nottingham Forest"};

    String [] twenty00 = {"Manchester United", "Arsenal", 
    "Leeds United", "Liverpool",
    "Chelsea", "Aston Villa", "Sunderland", "Leicester City", "West Ham United", 
    "Tottenham Hotspur", "Newcastle United", "Middlesborough", "Everton", 
    "Coventry City", "Southampton", "Derby County", 
    "Bradford City", "Wimbledon",
    "Sheffield Wednesday", "Watford"};

    String [] twenty01 = {"Manchester United", "Arsenal", 
    "Liverpool", "Leeds United", 
    "Ipswich Town", "Chelsea", "Sunderland", "Aston Villa", "Charlton Athletic",
    "Southampton", "Newcastle United", "Tottenham Hotspur", "Leicester City", 
    "Middlesborough", "West Ham United", "Everton", "Derby County",
    "Manchester City",
    "Coventry City", "Bradford City"};

    String [] twenty02 = {"Arsenal", "Liverpool", "Manchester United", 
    "Newcastle United", "Leeds United", "Chelsea", 
    "West Ham United", "Aston Villa",
    "Tottenham Hotspur", "Blackburn Rovers", "Southampton", "Middlesborough", 
    "Fulham", "Charlton Athletic", "Everton", "Bolton Wanderers", "Sunderland", 
    "Ipswich Town", "Derby County", "Leicester City"};

    String [] twenty03 = {"Manchester United", "Arsenal", "Newastle United",
    "Chelsea",
    "Liverpool", "Blackburn Rovers", "Everton", "Southampton",
    "Manchester City", 
    "Tottenham Hotspur", "Middlesborough", "Charlton Atheltic",
    "Birmingam City",
    "Fulham", "Leeds United", "Aston Villa", 
    "Bolton Wanderers", "West Ham United",
    "West Bromwich Albion", "Sunderland"};

    String [] twenty04 = {"Arsenal", "Chelsea", "Manchester United", 
    "Liverpool",
    "Newcastle United", "Aston Villa", "Charlton Athletic", "Bolton Wanderers",
    "Fulham", "Birmingham City", "Middlesborough", "Southampton", "Portsmouth",
    "Tottenham Hotspur", "Blackburn Rovers", "Manhester City", "Everton", 
    "Leicester City", "Leeds United", "Wolverhampton Wanderers"};

    String [] twenty05 = {"Chelsea", "Arsenal", "Manchester United", "Everton", 
    "Liverpool", "Bolton Wanderers", "Middlesborough", "Manchester City",
    "Tottenham Hotspur", "Aston Villa", "Charlton Athletic", "Birmingham City",
    "Fulham", "Newcastle United", "Blakburn Rovers", "Portsmouth",
    "West Bromwich Albion", "Crystal Palace", "Norwich City", "Southampton"};

    String [] twenty06 = {"Chelsea", "Manchester United", 
    "Liverpool", "Arsenal", 
    "Tottenham Hotspur", "Blackburn Rovers", "Newcastle United", 
    "Bolton Wanderers", 
    "West Ham United", "Wigan Athletic", "Everton", 
    "Fulham", "Charlton Athletic", 
    "Middlesborough", "Manchester City", "Aston Villa", "Portsmouth", 
    "Birmingham City", "West Bromwich Albion", "Sunderland"};

    String [] twenty07 = {"Manchester United", "Chelsea", 
    "Liverpool", "Arsenal",
    "Tottenham Hotspur", "Everton", "Bolton Wanderers", "Reading", "Portsmouth",
    "Blackburn Rovers", "Aston Villa", "Middlesborough", "Newcastle United", 
    "Manchester City", "West Ham Unted", "Fulham", "Wigan Athletic", 
    "Sheffield United", "Charlton Athletic", "Watford"};

    String [] twenty08 = {"Manchester United", "Chelsea", "Arsenal", "Liverpool", 
    "Everton", "Aston Villa", "Blackburn Rovers", 
    "Portsmouth", "Manchester City",
    "West Ham United", "Tottenham Hotspur", "Newcastle United", 
    "Middlesborough", 
    "Wigan Athletic", "Sunderland", "Bolton Wanderers", "Fulham", "Reading", 
    "Birmingham City", "Derby County"};

    String [] twenty09 = {"Manchester United", "Liverpool", "Chelsea", 
    "Arsenal", 
    "Everton", "Aston Villa", "Fulham", "Tottenham Hotspur", "West Ham United", 
    "Manchester City", "Wigan Athletic", "Stoke City", "Bolton Wanderers",
    "Portsmouth", "Blackburn Rovers", "Sunderland", 
    "Hull City", "Newcastle United",
    "Middlesborough", "West Bromwich Albion"};

    String [] twenty10 = {"Chelsea", "Manchester United", "Arsenal", 
    "Tottenham Hotspur", "Manchester City", "Aston Villa", "Liverpool", "Everton",
    "Birmingham City", "Blackburn Rovers", 
    "Stoke City", "Fulham", "Sunderland",
    "Bolton Wanderers", "Wolverhampton Wanderers", "Wigan Athletic", 
    "West Ham United", "Burnley", "Hull City", "Portsmouth"};

    String [] twenty11 = {"Manchester United", "Chelsea", "Manchester City",
    "Arsenal", 
    "Tottenham Hotspur", "Liverpool", "Everton", "Fulham", "Aston Villa", 
    "Sunderland", "West Bromwich Albion", "Newcastle United", "Stoke City", 
    "Bolton Wanderers", "Blackburn Rovers", "Wigan Athletic", 
    "Wolverhampton Wanderers", "Birmingham City", "Blackpool", 
    "West Ham United"};

    String [] twenty12 = {"Manchester City", "Manchester United", "Arsenal",
    "Tottenham Hotspur", "Newcastle United", "Chelsea", "Everton", 
    "Liverpool",
    "Fulham", "West Bromwich Albion", "Swansea City", "Norwich City", "Sunderland",
    "Stoke City", "Wigan Athletic", "Aston Villa", "QPR", "Bolton Wanderers",
    "Blackburn Rovers", "Wolverhampton Wanderers"};

    String [] twenty13 = {"Manchester United", "Manchester City", 
    "Chelsea", "Arsenal", 
    "Tottenham Hotspur", "Everton", "Liverpool", "West Bromwich Albion",
    "Swansea City", "West Ham United", "Norwich City", "Fulham", "Stoke City",
    "Southampton", "Aston Villa", "Newcastle United", "Sunderland", 
    "Wigan Athletic", "Reading", "QPR"};

    String [] twenty14 = {"Manchester City", "Liverpool", "Chelsea", "Arsenal",
    "Everton", "Tottenham Hotspur", "Manchester United", "Southampton",
    "Stoke City", "Newcastle United", "Crystal Palace", "Swansea City",
    "West Ham United", "Sunderland", "Aston Villa", "Hull City", 
    "West Bromwih Albion", "Norwich City", "Fulham", "Cardiff City"};

    String [] twenty15 = {"Chelsea", "Manchester City", "Arsenal",
    "Manchester United", "Tottenham Hotspur", "Liverpool", "Southampton", 
    "Swansea City", "Stoke City", 
    "Crystal Palace", "Everton", "West Ham United", 
    "West Bromwich Albion", "Leicester City", "Newcastle United", "Sunderland",
    "Aston Villa", "Hull City", "Burnley", "QPR"};

    String [] twenty16 = {"Leicester City", "Arsenal", "Tottenham Hotspur",
    "Manchester City", "Manchester United", "Southampton", "West Ham United",
    "Liverpool", "Stoke City", "Chelsea", "Everton", "Swansea City", "Watford",
    "West Bromwich Albion", "Crystal Palace", "AFC Bournemouth", "Sunderland",
    "Newcastle United", "Norwich City", "Aston Villa"};

    String  [] twenty17 = {"Chelsea", "Tottenham Hotspur", "Manchester City",
    "Liverpool", "Arsenal", "Manchester United", "Everton", "Southampton",
    "AFC Bournemouth", "West Bromwich Albion",
    "West Ham United", "Leicester City",
    "Stoke City", "Crystal Palace", "Swansea City", "Burnley", "Watford", 
    "Hull City", "Middlesborough", "Sunderland"};
    
    String [][] years = {nineteen93, nineteen94, nineteen95, nineteen96,
    nineteen97, nineteen98, nineteen99, twenty00, twenty01, twenty02, twenty03,
    twenty04, twenty05, twenty06, twenty07, twenty08, twenty09, twenty10,
    twenty11, twenty12, twenty13, twenty14, twenty15, twenty16, twenty17};
 
    int countThroughYears = 0;
    int countTH
    		
    while (countThroughYears < years.length){
    	System.out.println("Team is: ", +years[countThroughYears][])
    }
  
}*/
}
