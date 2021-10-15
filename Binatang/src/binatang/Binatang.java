package binatang;

//import binatang.AdapterPattern.*; // Import Semua yang ada atau bisa juga dengan yang dibawah
import binatang.AdapterPattern.KucingAdapter;
import binatang.AdapterPattern.KucingJantan;
import binatang.AdapterPattern.Singa;
import binatang.AdapterPattern.SingaJantan;

/**
 *
 * @author Ibnu Fadillah
 */
public class Binatang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KucingJantan KucingLaki = new KucingJantan();
        Singa singa = new SingaJantan();
        Singa kucingAdapter = new KucingAdapter(KucingLaki);
  
        System.out.println("Kucing Jantan");
        KucingLaki.berJalan();
        KucingLaki.berSuara();
        
        System.out.println("Singa");
        singa.Mengaum();
  
        // toy duck behaving like a bird 
        System.out.println("KucingAdapter");
        kucingAdapter.Mengaum();
    }
    
}
