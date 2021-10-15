/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binatang.AdapterPattern;
/**
 *
 * @author Ibnu Fadillah
 */
public class KucingAdapter implements Singa {
    
    Kucing kucing;
    
    public KucingAdapter(Kucing kucing){
        this.kucing = kucing;
    }
    
    @Override
    public void Mengaum(){
        kucing.berSuara();
    }
}
