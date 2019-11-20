package id.ifundip.dbdemo.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Buku {

    @PrimaryKey
    private int bukuId;
    private String  judul;

    public Buku(int bukuId, String judul){
        this.bukuId = bukuId;
        this.judul = judul;
    }

    public int getBukuId() {
        return bukuId;
    }

    public void setBukuId(int bukuId) {
        this.bukuId = bukuId;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}
