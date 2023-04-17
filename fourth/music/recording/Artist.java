package music.recording;

public class Artist
{
    private String name;
    private RecordLabel label;

    public Artist(String n, RecordLabel l)
    {
        name = n;
        label = l;
    }

    public static String GetName()
    {
        return name;
    }
    public static void SetName(String n)
    {
        name = n;
    }

    public static RecordLabel GetLabel()
    {
        return label;
    }
    public static void SetLabel(RecordLabel l)
    {
        label = l;
    }
}