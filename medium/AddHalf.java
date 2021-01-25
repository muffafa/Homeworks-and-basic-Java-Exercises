class AddHalf {
  public static void main(String[] args)
  {
    int firstValue = 2; 
    double resultValue = addHalf(firstValue); 
    System.out.println("Result is "+ resultValue);
  }

  public static double addHalf (int tagValue)  
  {
    double newValue = tagValue + 0.5; 
    return newValue;
  } 
}
