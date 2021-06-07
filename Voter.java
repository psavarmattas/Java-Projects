// Write a Program to store Voter detail as voter id, voter name & monthly income for a voter in a class. 
// Compute annual income & display the detail. Use parameterized constructor.



public class Voter {
    int vid, mi, ai;
    String nm;
    Voter(int vid1, String nm1, int mi1) { //parameterized constructor
        vid =vid1;
        nm=nm1;
        mi=mi1;
    }
    void compute( ) {
        ai=mi * 12;
    }
    void putdata( ) {
    System.out.println("voter id="+vid);
    System.out.println("voter name="+nm);
    System.out.println("annual income="+ai);
    }
}
class Example {
    public static void main (String str[ ]) {
        Voter v=new Voter(101, "Vedant", 15000);
        v.compute( );
        v.putdata( );
    }
}
