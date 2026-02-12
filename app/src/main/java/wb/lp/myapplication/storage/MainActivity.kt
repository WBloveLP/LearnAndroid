package wb.lp.myapplication.storage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import wb.lp.myapplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val dbHelper = MyDatabaseHelper(this, "BookStore.db", 1)
        val dbHelper = MyDatabaseHelper(this, "BookStore.db", 2)
        dbHelper.writableDatabase
    }

}