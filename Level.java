public class Level  
{  
    private int points;
    private boolean goal;
    public boolean goalReached()  
    {
        return goal;
    }   
      
/** Returns the number of points (a positive integer) recorded for this level */  
    public int getPoints()  
    {
        return points;
    }  

    public void setPoints(int p)
    {
        points = p;
    }

    public void reached()
    {
        goal = true;
    }
} 