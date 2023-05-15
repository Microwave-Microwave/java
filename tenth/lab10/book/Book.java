package book;

public class Book
{
    public final String defaultAuthor = "default";
    public final String defaultTitle = "default";
    public final int defaultPageCount = 100;

    private String author;
    private String title;
    protected int pageCount;

    protected void initBook(String a, String t, int p)
    {
        author = a;
        title = t;
        pageCount = p;
    }

    public Book(String a, String t, int p)
    {
        checkInitData();
        try
        {
            checkInitData();
            initBook(a, t, p)

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public Book()
    {
        initBook(defaultAuthor, defaultTitle, defaultPageCount);
    }

    private void checkInitData(String a, String t, int p) throws IllegalArgumentException
    {
        if (a.length() < 2)
            throw new IllegalArgumentException("author name too short");
        if (t.length() < 4)
            throw new IllegalArgumentException("title too short");
        if (p < 1)
            throw new IllegalArgumentException("book too short");
    }

    public Book decode(String s)
    {
        s = s.strip();
        Book();   
    }

    public String createReference(String a, int n1, int n2)
    {
        return "";
    }

    

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setPageCount(int pageCount)
    {
        this.pageCount = pageCount;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    public String getPageCount()
    {
        return pageCount;
    }
}