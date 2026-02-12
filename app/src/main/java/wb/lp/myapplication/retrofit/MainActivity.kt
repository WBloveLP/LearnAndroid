package wb.lp.myapplication.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import wb.lp.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        testRetrofit()
    }

    private fun testRetrofit() {
        val retrofit =
            Retrofit.Builder().baseUrl(Api.HOST).addConverterFactory(GsonConverterFactory.create())
                .build()
        val appService = retrofit.create(AppService::class.java)
        appService.getAppData().enqueue(object : Callback<Info> {
            override fun onResponse(
                call: Call<Info?>, response: Response<Info?>
            ) {
                runOnUiThread {
                    binding.mtext.text = response.body()?.data
                }
            }

            override fun onFailure(
                call: Call<Info?>, t: Throwable
            ) {
                t.printStackTrace()
            }
        })
    }
}
