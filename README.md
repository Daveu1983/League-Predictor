#League-Predictor

TODO:-
- Refactor so leagues are taken as a paramter so any leagues over any period of time can be predicted.
- Add tests

UPDATE 21/08
League table now predicted.

Not yet complete and there is an issue when moving from 94/95 season to 95/96 season as the number of teams in the league drops.
Ultimately I want a programme that will predict the premier league. I will do this by looking at previous years position for
a team and then seeing where the tea in that position has finished most often the year after.

UPDATE 3/1/18
Changed the structure so that each year will have it's own class, following on 93/94 season each class will be a subclass of 93/94 (may possibly add abstract class i the future). LeaguePredictor.java will be used to create league objects and apply methods to them.

UPDATE 5/1/18
Added two more seasons, method overridden in 94/95 season to take into account league dropping from 20 to 22 teams.
