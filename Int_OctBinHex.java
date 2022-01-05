class Int_OctBinHex
{
  public static void main(String args[])
  {
  int num=Integer.parseInt(args[0]);
  String h= Integer.toHexString(num);
  System.out.println("HexaDecimal = "+h);
  String o= Integer.toOctalString(num);
  System.out.println("Octal = "+o);
  String b= Integer.toBinaryString(num);
  System.out.println("Binary = "+b);
}
}