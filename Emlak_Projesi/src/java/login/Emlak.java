/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author asus
 */
public class Emlak {
    	protected int id;
	protected String il;
	protected String ilce;
	protected float fiyat;
        protected String ozellik;

    public Emlak() {
    }

    public Emlak(int id) {
        this.id = id;
    }
    

    public Emlak(int id, String il, String ilce, float fiyat, String ozellik) {
        this.id = id;
        this.il = il;
        this.ilce = ilce;
        this.fiyat = fiyat;
        this.ozellik = ozellik;
    }

    public Emlak(String il, String ilce, float fiyat, String ozellik) {
        this.il = il;
        this.ilce = ilce;
        this.fiyat = fiyat;
        this.ozellik = ozellik;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public String getOzellik() {
        return ozellik;
    }

    public void setOzellik(String ozellik) {
        this.ozellik = ozellik;
    }
       
        
}
    