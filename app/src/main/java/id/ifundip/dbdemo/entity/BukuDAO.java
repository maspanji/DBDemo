package id.ifundip.dbdemo.entity;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface BukuDAO {

    @Query("SELECT * FROM Buku")
    List<Buku> getAllBuku();

    @Insert
    void insertAll(List<Buku> buku);

    @Insert
    void insertBuku(Buku buku);

    @Delete
    void delete(Buku buku);

    @Query("DELETE FROM Buku")
    void deleteAllBuku();
}
