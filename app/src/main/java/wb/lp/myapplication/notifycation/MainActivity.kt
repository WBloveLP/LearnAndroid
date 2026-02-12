//import android.app.NotificationChannel
//import android.app.NotificationManager
//import android.app.PendingIntent
//import android.app.Service
//import android.content.Context
//import android.content.Intent
//import android.graphics.BitmapFactory
//import android.os.Build
//import android.os.IBinder
//import android.util.Log
//import androidx.core.app.NotificationCompat
//import androidx.core.app.ServiceCompat.startForeground
//import androidx.core.content.ContextCompat.getSystemService
//import wb.lp.myapplication.MainActivity
//import wb.lp.myapplication.R
//import kotlin.jvm.java
//
////import android.app.NotificationChannel
////import android.app.NotificationManager
////import android.content.Context
////import android.graphics.BitmapFactory
////import android.os.Build
////import android.os.Bundle
////import androidx.appcompat.app.AppCompatActivity
////import androidx.core.app.NotificationCompat
////
////class MainActivity : AppCompatActivity() {
////
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_main)
////        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as
////                NotificationManager
////        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
////            val channel = NotificationChannel(
////                "normal", "Normal", NotificationManager.IMPORTANCE_DEFAULT
////            )
////            manager.createNotificationChannel(channel)
////        }
////        sendNotice.setOnClickListener {
////            val notification = NotificationCompat.Builder(this, "normal")
////                .setContentTitle("This is content title")
////                .setContentText("This is content text")
////                .setSmallIcon(R.drawable.small_icon)
////                .setLargeIcon(
////                    BitmapFactory.decodeResource(resources,
////                    R.drawable.large_icon))
////                .build()
////            manager.notify(1, notification)
////        }
////    }
////
////}
//
//
////前台服务
//class MyService : Service() {
//    override fun onBind(intent: Intent?): IBinder? = null
//    override fun onCreate() {
//        super.onCreate()
//        Log.d("MyService", "onCreate executed")
//        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            val channel = NotificationChannel(
//                "my_service", "前台Service通知", NotificationManager.IMPORTANCE_DEFAULT
//            )
//            manager.createNotificationChannel(channel)
//        }
//        val intent = Intent(this, MainActivity::class.java)
//        val pi = PendingIntent.getActivity(this, 0, intent, 0)
//        val notification =
//            NotificationCompat.Builder(this, "my_service").setContentTitle("This is content title")
//                .setContentText("This is content text").setSmallIcon(R.drawable.small_icon)
//                .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.large_icon))
//                .setContentIntent(pi).build()
//        startForeground(1, notification)
//    }
//}