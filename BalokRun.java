public class BalokRun {
    public static void main (String []args){

        Balok balokl = new Balok();
        balokl.lebar = 20;
        balokl.tinggi = 30;
        balokl.panjang = 10;

        double p, l, t, v;
        p = 10;
        l = 5;
        t = 15;
    
          v = p * l * t;
        
        System.out.println("Volume Balok = "+balokl.hitungVolume());
        System.out.println("Volume balok dengan panjang " + p + ", lebar " + l + " dan tinggi " + t + " adalah "+ v);  
    }
}
