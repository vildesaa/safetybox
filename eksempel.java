
class Eksempel{

public static void main(String[] args){

  Narkotisk narkostiskLegemiddel = new Narkotisk("Morfin", 200, 10, 5);
  Spesialister lege2 = new Spesialister("Kari Nordmann", "ABAB");
  MilResept mResept = new MilResept(narkostiskLegemiddel, lege1, 123, 2);


  }
}
