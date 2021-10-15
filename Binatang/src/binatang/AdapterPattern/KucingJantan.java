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
public class KucingJantan implements Kucing {
    @Override
    public void berJalan(){
        System.out.println("Berjalan");
    }
    
    @Override
    public void berSuara(){
        System.out.println("Meong...");
    }
}
