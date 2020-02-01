package ir.hasan.bimarestammospring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Sapt {
    @Id
    private String id;
    private String name1 ;
    private String  namef;    private String  ozviat;    private String mahalkh ;
    private String nobimari;    private String tarmor;    private String bestari;    private String noestrhat;    private int tedadestrahat_sh;
    private int tedadestrahat_n;    private String taraz;    private String tarta;     private String saptkonandeh;
    private String DOKTOR;private String NOESTRAHATKH;private String SHSAPT;private String TARSAPT;private String toz;private String sazman;
   @Size(min=10,max = 10)
    private String  meli  ;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getNamef() {
        return namef;
    }

    public void setNamef(String namef) {
        this.namef = namef;
    }

    public String getOzviat() {
        return ozviat;
    }

    public void setOzviat(String ozviat) {
        this.ozviat = ozviat;
    }

    public String getMahalkh() {
        return mahalkh;
    }

    public void setMahalkh(String mahalkh) {
        this.mahalkh = mahalkh;
    }

    public String getNobimari() {
        return nobimari;
    }

    public void setNobimari(String nobimari) {
        this.nobimari = nobimari;
    }

    public String getTarmor() {
        return tarmor;
    }

    public void setTarmor(String tarmor) {
        this.tarmor = tarmor;
    }

    public String getBestari() {
        return bestari;
    }

    public void setBestari(String bestari) {
        this.bestari = bestari;
    }

    public String getNoestrhat() {
        return noestrhat;
    }

    public void setNoestrhat(String noestrhat) {
        this.noestrhat = noestrhat;
    }

    public int getTedadestrahat_sh() {
        return tedadestrahat_sh;
    }

    public void setTedadestrahat_sh(int tedadestrahat_sh) {
        this.tedadestrahat_sh = tedadestrahat_sh;
    }

    public int getTedadestrahat_n() {
        return tedadestrahat_n;
    }

    public void setTedadestrahat_n(int tedadestrahat_n) {
        this.tedadestrahat_n = tedadestrahat_n;
    }

    public String getTaraz() {
        return taraz;
    }

    public void setTaraz(String taraz) {
        this.taraz = taraz;
    }

    public String getTarta() {
        return tarta;
    }

    public void setTarta(String tarta) {
        this.tarta = tarta;
    }

    public String getMeli() {
        return meli;
    }

    public void setMeli(String meli) {
        this.meli = meli;
    }

    public String getSaptkonandeh() {
        return saptkonandeh;
    }

    public void setSaptkonandeh(String saptkonandeh) {
        this.saptkonandeh = saptkonandeh;
    }

    public String getDOKTOR() {
        return DOKTOR;
    }

    public void setDOKTOR(String DOKTOR) {
        this.DOKTOR = DOKTOR;
    }

    public String getNOESTRAHATKH() {
        return NOESTRAHATKH;
    }

    public void setNOESTRAHATKH(String NOESTRAHATKH) {
        this.NOESTRAHATKH = NOESTRAHATKH;
    }

    public String getSHSAPT() {
        return SHSAPT;
    }

    public void setSHSAPT(String SHSAPT) {
        this.SHSAPT = SHSAPT;
    }

    public String getTARSAPT() {
        return TARSAPT;
    }

    public void setTARSAPT(String TARSAPT) {
        this.TARSAPT = TARSAPT;
    }

    public String getToz() {
        return toz;
    }

    public void setToz(String toz) {
        this.toz = toz;
    }

    public String getSazman() {
        return sazman;
    }

    public void setSazman(String sazman) {
        this.sazman = sazman;
    }
}