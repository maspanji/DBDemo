package id.ifundip.dbdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import id.ifundip.dbdemo.entity.AppDatabase;
import id.ifundip.dbdemo.entity.Buku;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "Buku").build();
                Log.d("TAG","INSERTING");
                appDatabase.bukuDAO().insertAll(getDataBuku());
                appDatabase.bukuDAO().insertBuku(new Buku(3,"Kotlin for Dummies"));
                int recordSize = appDatabase.bukuDAO().getAllBuku().size();

                Log.d("TAG","DISPLAY RECORD SIZE: "+recordSize);
                Log.d("TAG","DELETE ALL DATA ");
                appDatabase.bukuDAO().deleteAllBuku();
                recordSize = appDatabase.bukuDAO().getAllBuku().size();
                Log.d("TAG","DISPLAY RECORD SIZE: "+recordSize);
            }
        });
    }

    private List<Buku> getDataBuku(){
        Buku buku1 = new Buku(1,"Java for Dummies");
        Buku buku2 = new Buku(2,"Android for Dummies");
        List<Buku> listBuku = new ArrayList<>();
        listBuku.add(buku1);listBuku.add(buku2);
        return listBuku;
    }
}
