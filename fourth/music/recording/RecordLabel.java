package music.recording;

public class RecordLabel
{
    private String name;
    private int cash;

    public RecordLabel(String n, int c)
    {
        name = n;
        cash = c;
    }

    public static void gotIncome(int n)
    {
        //??????????
    }

    public static String GetName()
    {
        return name;
    }
    public static void SetName(String n)
    {
        name = n;
    }

    public static int GetCashe()
    {
        return cashe;
    }
    public static void SetCashe(RecordLabel c)
    {
        cashe = c;
    }
}