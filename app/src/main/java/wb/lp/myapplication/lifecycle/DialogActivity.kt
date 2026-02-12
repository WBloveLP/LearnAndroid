package wb.lp.myapplication.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import wb.lp.myapplication.R


/*
        <activity
            android:name=".lifecycle.DialogActivity"
            android:theme="@style/Theme.AppCompat.Dialog"
            android:exported="false" />
 */

class DialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
    }
}