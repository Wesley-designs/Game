import java.util.Scanner;

public class Game
{
private Level levelOne;
private Level levelTwo;
private Level levelThree;
private boolean bonus;
private int score;
/** Postcondition: All instance variables have been initialized. */
public Game()
{
    levelOne = new Level();
    levelTwo = new Level();
    levelThree = new Level();
}
/** Returns true if this game is a bonus game and returns false otherwise */
public boolean isBonus()
{
    return bonus;
}
/** Simulates the play of this Game (consisting of three levels) and updates all relevant
* game data
*/
public void play()
{
    System.out.println("Enter # of points:");
    Scanner s = new Scanner(System.in);
    levelOne.setPoints(s.nextInt());
    levelOne.reached();
}
/** Returns the score earned in the most recently played game, as described in part (a) */
public int getScore()
{
    int a = 0;
    if (levelOne.goalReached()){
        a += levelOne.getPoints();
        if (levelTwo.goalReached()){
            a += levelTwo.getPoints();
            if (levelThree.goalReached()){
                a += levelThree.getPoints();
            }
        }
    }
    if (isBonus()) return a*3;
    return a;
}
/** Simulates the play of num games and returns the highest score earned, as
* described in part (b)
* Precondition: num > 0
*/
public int playManyTimes(int num)
{
    int max = 0;
    while (num > 0){
        play();
        int score = getScore();
        if (score > max){
            max = score;
        }
        num--;
    }
    return max;
}
public Level getLevel(int i)
{
    if (i == 1) return levelOne;
    if (i == 2) return levelTwo;
     if (i == 3) return levelThree;
    return null;
}
public void makeBonus()
{
    bonus = true;
}
// There may be instance variables, constructors, and methods that are not shown.
}