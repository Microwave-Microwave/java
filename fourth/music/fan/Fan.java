package music.fan;

public class Fan
{
    private String name;
    private music.recording.Artist favourite;
    private int moneySpent;

    public Fan(String n, music.recording.Artist f)
    {
        name = n;
        favourite = f;
    }

    public static void BuyMerchandise()
    {
        
    }

    public static String GetName()
    {
        return name;
    }
    public static void SetName(String n)
    {
        name = n;
    }

    public static int GetFavourite()
    {
        return favourite;
    }
    public static void SetFavourite(music.recording.Artist f)
    {
        favourite = f;
    }

    public static String GetMoneySpent()
    {
        return moneySpent;
    }
    public static void SetMoneySpent(int m)
    {
        moneySpent = m;
    }
}