class Akk
{
static int first;

static String second;

static
{
System.out.println(1);

first = 100;
}

static
{
System.out.println(2);

second = "SECOND";
}
}

public class StaticInitializationBlock2
{
static
{
System.out.println(3);
}

public static void main(String[] args)
{
System.out.println(4);

System.out.println(Akk.first);

System.out.println(Akk.second);
}
}