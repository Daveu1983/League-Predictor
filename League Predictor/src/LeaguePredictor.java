import java.util.ArrayList;

public class LeaguePredictor {


    public static final String MANCHESTER_UNITED = "Manchester United";
    public static final String ARSESNAL = "Arsesnal";
    public static final String ASTON_VILLA = "Aston Villa";
    public static final String NEWCASTLE_UNITED = "Newcastle United";
    public static final String CHELSEA = "Chelsea";
    public static final String LIVERPOOL = "Liverpool";
    public static final String BLACKBURN_ROVERS ="Blackburn Rovers";

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
    ArrayList<String> yearElevenReadyToCompare = yearEleven.replaceRelegated(yearElevenTable, promotedYearEleven);
    yearFour.positionDifference(yearElevenReadyToCompare, yearTwelveTable);
    System.out.println("");

    TwoThousandFive yearThirteen = new TwoThousandFive();
    ArrayList <String> yearThirteenTable = yearThirteen.createTable();
    String [] promotedYearTwelve = yearTwelve.createPromoted();
    ArrayList<String> yearTwelveReadyToCompare = yearTwelve.replaceRelegated(yearTwelveTable, promotedYearTwelve);
    yearFour.positionDifference(yearTwelveReadyToCompare, yearThirteenTable);
    System.out.println("");

    TwoThousandSix yearFourteen = new TwoThousandSix();
    ArrayList <String> yearFourteenTable = yearFourteen.createTable();
    String [] promotedYearThirteen = yearThirteen.createPromoted();
    ArrayList<String> yearThirteenReadyToCompare = yearThirteen.replaceRelegated(yearThirteenTable, promotedYearThirteen);
    yearFour.positionDifference(yearThirteenReadyToCompare, yearFourteenTable);
    System.out.println("");

    TwoThousandSeven yearFifteen = new TwoThousandSeven();
    ArrayList <String> yearFifteenTable = yearFifteen.createTable();
    String [] promotedYearFourteen = yearFourteen.createPromoted();
    ArrayList<String> yearFourteenReadyToCompare = yearFourteen.replaceRelegated(yearFourteenTable, promotedYearFourteen);
    yearFour.positionDifference(yearFourteenReadyToCompare, yearFifteenTable);
    System.out.println("");

    TwoThousandEight yearSixteen = new TwoThousandEight();
    ArrayList <String> yearSixteenTable = yearSixteen.createTable();
    String [] promotedYearFifteen = yearFifteen.createPromoted();
    ArrayList<String> yearFifteenReadyToCompare = yearFifteen.replaceRelegated(yearFifteenTable, promotedYearFifteen);
    yearFour.positionDifference(yearFifteenReadyToCompare, yearSixteenTable);
    System.out.println("");

    TwoThousandNine yearSeventeen = new TwoThousandNine();
    ArrayList <String> yearSeventeenTable = yearSeventeen.createTable();
    String [] promotedYearSixteen = yearSixteen.createPromoted();
    ArrayList<String> yearSixteenReadyToCompare = yearSixteen.replaceRelegated(yearSixteenTable, promotedYearSixteen);
    yearFour.positionDifference(yearSixteenReadyToCompare, yearSeventeenTable);
    System.out.println("");

    TwoThousandTen yearEighteen = new TwoThousandTen();
    ArrayList <String> yearEighteenTable = yearEighteen.createTable();
    String [] promotedYearSeventeen = yearSeventeen.createPromoted();
    ArrayList<String> yearSeventeenReadyToCompare = yearSeventeen.replaceRelegated(yearSeventeenTable, promotedYearSeventeen);
    yearFour.positionDifference(yearSeventeenReadyToCompare, yearEighteenTable);
    System.out.println("");

    TwoThousandEleven yearNineteen = new TwoThousandEleven();
    ArrayList <String> yearNineteenTable = yearNineteen.createTable();
    String [] promotedYearEighteen = yearEighteen.createPromoted();
    ArrayList<String> yearEighteenReadyToCompare = yearEighteen.replaceRelegated(yearEighteenTable, promotedYearEighteen);
    yearFour.positionDifference(yearEighteenReadyToCompare, yearNineteenTable);
    System.out.println("");

    TwoThousandTwelve yearTwenty = new TwoThousandTwelve();
    ArrayList <String> yearTwentyTable = yearTwenty.createTable();
    String [] promotedYearNineteen = yearNineteen.createPromoted();
    ArrayList<String> yearNineteenReadyToCompare = yearNineteen.replaceRelegated(yearNineteenTable, promotedYearNineteen);
    yearFour.positionDifference(yearNineteenReadyToCompare, yearTwentyTable);
    System.out.println("");

    TwoThousandThirteen yearTwentyOne = new TwoThousandThirteen();
    ArrayList <String> yearTwentyOneTable = yearTwentyOne.createTable();
    String [] promotedYearTwenty = yearTwenty.createPromoted();
    ArrayList<String> yearTwentyReadyToCompare = yearTwenty.replaceRelegated(yearTwentyTable, promotedYearTwenty);
    yearFour.positionDifference(yearTwentyReadyToCompare, yearTwentyOneTable);
    System.out.println("");

    TwoThousandFourteen yearTwentyTwo = new TwoThousandFourteen();
    ArrayList <String> yearTwentyTwoTable = yearTwentyTwo.createTable();
    String [] promotedYearTwentyOne = yearTwentyOne.createPromoted();
    ArrayList<String> yearTwentyOneReadyToCompare = yearTwentyOne.replaceRelegated(yearTwentyOneTable, promotedYearTwentyOne);
    yearFour.positionDifference(yearTwentyOneReadyToCompare, yearTwentyTwoTable);
    System.out.println("");

    }



    /*


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

    }
  
}*/
}
