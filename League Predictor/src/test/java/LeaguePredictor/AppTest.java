package LeaguePredictor;

import static org.junit.Assert.*;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        List<Map.Entry<String, Integer>> theLeagueSorted = Predictor.predict();
        List<Map.Entry<String, Integer>> theLeagueSortedControl = new ArrayList<Map.Entry<String, Integer>>();

        Integer count = new Integer(1);

        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Liverpool", count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Manchester City", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Tottenham Hotspur",++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Chelsea", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Aston Villa", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Arsenal", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Wolverhampton Wanderers", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Manchester United", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Crystal Palace",++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("AFC Bournemouth", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Watford", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Leicester City", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("West Ham United", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Newcastle", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Everton", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Southampton", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Burnley", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Norwich City", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Sheffield United", ++count));
        theLeagueSortedControl.add(new AbstractMap.SimpleEntry<String, Integer>("Brighton & Hove Albion", ++count));
        

        
        assertEquals( theLeagueSortedControl,theLeagueSorted );
    }
}
