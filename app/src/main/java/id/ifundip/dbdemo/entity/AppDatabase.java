package id.ifundip.dbdemo.entity;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Buku.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BukuDAO bukuDAO();
}
