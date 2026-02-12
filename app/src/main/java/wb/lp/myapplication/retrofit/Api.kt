package wb.lp.myapplication.retrofit

import retrofit2.Call
import retrofit2.http.GET

object Api {
    const val HOST: String = "http://192.168.100.101:8080"
}

class Info(val data: String, val msg: String, val code: Int)

interface AppService {
    @GET("/testDocker/666")
    fun getAppData(): Call<Info>
}