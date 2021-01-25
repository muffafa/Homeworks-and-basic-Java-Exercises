class Overloading {
  public static void main(String[] args) {
    yaz("merhaba");
    String isim = " esmanur";
    yazb(isim); 

    yazb(100);
    int sayi =101;
    yaz(sayi);
  }
  public static void yaz (String s){
    System.out.print(s);
  }
  public static void yazb (String s){
    System.out.println(s);
  }
  public static void yaz (int i){
    System.out.print(i);
  }
  public static void yazb (int i){
    System.out.println(i);
  }
}
