public class StaticObj 
{
    static int count=0;
    StaticObj()
    {
        count++;
	System.out.println("Number of objects created:"+count);
    }
    public static void main(String[] args) 
    {
        StaticObj a1 = new StaticObj();
        StaticObj a2 = new StaticObj();
	StaticObj a3 = new StaticObj();
	StaticObj a4 = new StaticObj();
	StaticObj a5 = new StaticObj();
        
    }
}