import java.util.ArrayList;

public class LeaguePredictor {


    public static final String MANCHESTER_UNITED = "Manchester United";
    public static final String ARSESNAL = "Arsesnal";
    public static final String ASTON_VILLA = "Aston Villa";
    public static final String NEWCASTLE_UNITED = "Newcastle United";
    public static final String CHELSEA = LeaguePredictor.CHELSEA;
    public static final String LIVERPOOL = LeaguePredictor.LIVERPOOL;
    public static final String BLACKBURN_ROVERS = LeaguePredictor.BLACKBURN_ROVERS;

    public static void main (String[] args) {
    NineteenNinetyThree yearOne = new NineteenNinetyThree();
    ArrayList <String> yearOneTable = yearOne.createTable();
    NineteenNinetyFour yearTwo = new NineteenNinetyFour();
    ArrayList <String> yearTwoTable = yearTwo.createTable();
    String [] promotedYearOne = yearOne.createPromoted();
    ArrayList<String> yearOneReadyToCompare = yearOne.replaceRelegated(yearOneTable, promotedYearOne);
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

    NineteenNinetyEight yearSix = new NineteenNinetyEight();
    ArrayList <String> yearSixTable = yearSix.createTable();
    String [] promotedYearFive = yearFive.createPromoted();
    ArrayList<String> yearFiveReadyToCompare = yearFive.replaceRelegated(yearFiveTable, promotedYearFive);
    yearFour.positionDifference(yearFiveReadyToCompare, yearSixTable);
    System.out.println("");

    NineteenNinetyNine yearSeven = new NineteenNinetyNine();
    ArrayList <String> yearSevenTable = yearSeven.createTable();
    String [] promotedYearSix = yearSix.createPromoted();
    ArrayList<String> yearSixReadyToCompare = yearSix.replaceRelegated(yearSixTable, promotedYearSix);
    yearFour.positionDifference(yearSixReadyToCompare, yearSevenTable);
    System.out.println("");

    TwoThousand yearEight = new TwoThousand();
    ArrayList <String> yearEightTable = yearEight.createTable();
    String [] promotedYearSeven = yearSeven.createPromoted();
    ArrayList<String> yearSevenReadyToCompare = yearSeven.replaceRelegated(yearSevenTable, promotedYearSeven);
    yearFour.positionDifference(yearSevenReadyToCompare, yearEightTable);
    System.out.println("");

    TwoThousandOne yearNine = new TwoThousandOne();
    ArrayList <String> yearNineTable = yearNine.createTable();
    String [] promotedYearEight = yearEight.createPromoted();
    ArrayList<String> yearEightReadyToCompare = yearEight.replaceRelegated(yearEightTable, promotedYearEight);
    yearFour.positionDifference(yearEightReadyToCompare, yearNineTable);
    System.out.println("");

    TwoThousandTwo yearTen = new TwoThousandTwo();
    ArrayList <String> yearTenTable = yearTen.createTable();
    String [] promotedYearNine = yearNine.createPromoted();
    ArrayList<String> yearNineReadyToCompare = yearNine.replaceRelegated(yearNineTable, promotedYearNine);
    yearFour.positionDifference(yearNineReadyToCompare, yearTenTable);
    System.out.println("");

    TwoThousandThree yearEleven = new TwoThousandThree();
    ArrayList <String> yearElevenTable = yearEleven.createTable();
    String [] promotedYearTen = yearTen.createPromoted();
    ArrayList<String> yearTenReadyToCompare = yearTen.replaceRelegated(yearTenTable, promotedYearTen);
    yearFour.positionDifference(yearTenReadyToCompare, yearElevenTable);
    System.out.println("");

    TwoThousandFour yearTwelve = new TwoThousandFour();
    ArrayList <String> yearTwelveTable = yearTwelve.createTable();
    String [] promotedYearEleven = yearEleven.createPromoted();
    ArrayList<String> yearElevenReadyToCompare = yearEleven.replaceRelegated(yearTenTable, promotedYearEleven);
    yearFour.positionDifference(yearElevenReadyToCompare, yearTwelveTable);
    System.out.println("");

    }
    /*


   







    String [] twenty04 = {LeaguePredictor.ARSESNAL, LeaguePredictor.CHELSEA, LeaguePredictor.MANCHESTER_UNITED,
    LeaguePredictor.LIVERPOOL,
    LeaguePredictor.NEWCASTLE_UNITED, LeaguePredictor.ASTON_VILLA, "Charlton Athletic", "Bolton Wanderers",
    "Fulham", "Birmingham City", "Middlesborough", "Southampton", "Portsmouth",
    "Tottenham Hotspur", LeaguePredictor.BLACKBURN_ROVERS, "Manhester City", "Everton",
    "Leicester City", "Leeds United", "Wolverhampton Wanderers"};

    String [] twenty05 = {LeaguePredictor.CHELSEA, LeaguePredictor.ARSESNAL, LeaguePredictor.MANCHESTER_UNITED, "Everton",
    LeaguePredictor.LIVERPOOL, "Bolton Wanderers", "Middlesborough", "Manchester City",
    "Tottenham Hotspur", LeaguePredictor.ASTON_VILLA, "Charlton Athletic", "Birmingham City",
    "Fulham", LeaguePredictor.NEWCASTLE_UNITED, "Blakburn Rovers", "Portsmouth",
    "West Bromwich Albion", "Crystal Palace", "Norwich City", "Southampton"};

    String [] twenty06 = {LeaguePredictor.CHELSEA, LeaguePredictor.MANCHESTER_UNITED,
    LeaguePredictor.LIVERPOOL, LeaguePredictor.ARSESNAL,
    "Tottenham Hotspur", LeaguePredictor.BLACKBURN_ROVERS, LeaguePredictor.NEWCASTLE_UNITED,
    "Bolton Wanderers", 
    "West Ham United", "Wigan Athletic", "Everton", 
    "Fulham", "Charlton Athletic", 
    "Middlesborough", "Manchester City", LeaguePredictor.ASTON_VILLA, "Portsmouth",
    "Birmingham City", "West Bromwich Albion", "Sunderland"};

    String [] twenty07 = {LeaguePredictor.MANCHESTER_UNITED, LeaguePredictor.CHELSEA,
    LeaguePredictor.LIVERPOOL, LeaguePredictor.ARSESNAL,
    "Tottenham Hotspur", "Everton", "Bolton Wanderers", "Reading", "Portsmouth",
    LeaguePredictor.BLACKBURN_ROVERS, LeaguePredictor.ASTON_VILLA, "Middlesborough", LeaguePredictor.NEWCASTLE_UNITED,
    "Manchester City", "West Ham Unted", "Fulham", "Wigan Athletic", 
    "Sheffield United", "Charlton Athletic", "Watford"};

    String [] twenty08 = {LeaguePredictor.MANCHESTER_UNITED, LeaguePredictor.CHELSEA, LeaguePredictor.ARSESNAL, LeaguePredictor.LIVERPOOL,
    "Everton", LeaguePredictor.ASTON_VILLA, LeaguePredictor.BLACKBURN_ROVERS,
    "Portsmouth", "Manchester City",
    "West Ham United", "Tottenham Hotspur", LeaguePredictor.NEWCASTLE_UNITED,
    "Middlesborough", 
    "Wigan Athletic", "Sunderland", "Bolton Wanderers", "Fulham", "Reading", 
    "Birmingham City", "Derby County"};

    String [] twenty09 = {LeaguePredictor.MANCHESTER_UNITED, LeaguePredictor.LIVERPOOL, LeaguePredictor.CHELSEA,
    LeaguePredictor.ARSESNAL,
    "Everton", LeaguePredictor.ASTON_VILLA, "Fulham", "Tottenham Hotspur", "West Ham United",
    "Manchester City", "Wigan Athletic", "Stoke City", "Bolton Wanderers",
    "Portsmouth", LeaguePredictor.BLACKBURN_ROVERS, "Sunderland",
    "Hull City", LeaguePredictor.NEWCASTLE_UNITED,
    "Middlesborough", "West Bromwich Albion"};

    String [] twenty10 = {LeaguePredictor.CHELSEA, LeaguePredictor.MANCHESTER_UNITED, LeaguePredictor.ARSESNAL,
    "Tottenham Hotspur", "Manchester City", LeaguePredictor.ASTON_VILLA, LeaguePredictor.LIVERPOOL, "Everton",
    "Birmingham City", LeaguePredictor.BLACKBURN_ROVERS,
    "Stoke City", "Fulham", "Sunderland",
    "Bolton Wanderers", "Wolverhampton Wanderers", "Wigan Athletic", 
    "West Ham United", "Burnley", "Hull City", "Portsmouth"};

    String [] twenty11 = {LeaguePredictor.MANCHESTER_UNITED, LeaguePredictor.CHELSEA, "Manchester City",
    LeaguePredictor.ARSESNAL,
    "Tottenham Hotspur", LeaguePredictor.LIVERPOOL, "Everton", "Fulham", LeaguePredictor.ASTON_VILLA,
    "Sunderland", "West Bromwich Albion", LeaguePredictor.NEWCASTLE_UNITED, "Stoke City",
    "Bolton Wanderers", LeaguePredictor.BLACKBURN_ROVERS, "Wigan Athletic",
    "Wolverhampton Wanderers", "Birmingham City", "Blackpool", 
    "West Ham United"};

    String [] twenty12 = {"Manchester City", LeaguePredictor.MANCHESTER_UNITED, LeaguePredictor.ARSESNAL,
    "Tottenham Hotspur", LeaguePredictor.NEWCASTLE_UNITED, LeaguePredictor.CHELSEA, "Everton",
    LeaguePredictor.LIVERPOOL,
    "Fulham", "West Bromwich Albion", "Swansea City", "Norwich City", "Sunderland",
    "Stoke City", "Wigan Athletic", LeaguePredictor.ASTON_VILLA, "QPR", "Bolton Wanderers",
    LeaguePredictor.BLACKBURN_ROVERS, "Wolverhampton Wanderers"};

    String [] twenty13 = {LeaguePredictor.MANCHESTER_UNITED, "Manchester City",
    LeaguePredictor.CHELSEA, LeaguePredictor.ARSESNAL,
    "Tottenham Hotspur", "Everton", LeaguePredictor.LIVERPOOL, "West Bromwich Albion",
    "Swansea City", "West Ham United", "Norwich City", "Fulham", "Stoke City",
    "Southampton", LeaguePredictor.ASTON_VILLA, LeaguePredictor.NEWCASTLE_UNITED, "Sunderland",
    "Wigan Athletic", "Reading", "QPR"};

    String [] twenty14 = {"Manchester City", LeaguePredictor.LIVERPOOL, LeaguePredictor.CHELSEA, LeaguePredictor.ARSESNAL,
    "Everton", "Tottenham Hotspur", LeaguePredictor.MANCHESTER_UNITED, "Southampton",
    "Stoke City", LeaguePredictor.NEWCASTLE_UNITED, "Crystal Palace", "Swansea City",
    "West Ham United", "Sunderland", LeaguePredictor.ASTON_VILLA, "Hull City",
    "West Bromwih Albion", "Norwich City", "Fulham", "Cardiff City"};

    String [] twenty15 = {LeaguePredictor.CHELSEA, "Manchester City", LeaguePredictor.ARSESNAL,
    LeaguePredictor.MANCHESTER_UNITED, "Tottenham Hotspur", LeaguePredictor.LIVERPOOL, "Southampton",
    "Swansea City", "Stoke City", 
    "Crystal Palace", "Everton", "West Ham United", 
    "West Bromwich Albion", "Leicester City", LeaguePredictor.NEWCASTLE_UNITED, "Sunderland",
    LeaguePredictor.ASTON_VILLA, "Hull City", "Burnley", "QPR"};

    String [] twenty16 = {"Leicester City", LeaguePredictor.ARSESNAL, "Tottenham Hotspur",
    "Manchester City", LeaguePredictor.MANCHESTER_UNITED, "Southampton", "West Ham United",
    LeaguePredictor.LIVERPOOL, "Stoke City", LeaguePredictor.CHELSEA, "Everton", "Swansea City", "Watford",
    "West Bromwich Albion", "Crystal Palace", "AFC Bournemouth", "Sunderland",
    LeaguePredictor.NEWCASTLE_UNITED, "Norwich City", LeaguePredictor.ASTON_VILLA};

    String  [] twenty17 = {LeaguePredictor.CHELSEA, "Tottenham Hotspur", "Manchester City",
    LeaguePredictor.LIVERPOOL, LeaguePredictor.ARSESNAL, LeaguePredictor.MANCHESTER_UNITED, "Everton", "Southampton",
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
