import java.io.*;
public class CatNotFoundException extends RuntimeException{
    int ruaTimes;
    public CatNotFoundException(int ruaTimes)
    {
        this.ruaTimes = ruaTimes;
    }
    public double getRuaTimes()
    {
        return ruaTimes;
    }
}
