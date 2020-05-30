package `in`.ehisab.distancematrix

import `in`.ehisab.distancematrix.api.RetrofitClient
import `in`.ehisab.distancematrix.datalayer.DistanceResponse
import `in`.ehisab.distancematrix.datalayer.Element
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val tagName = "MainActivityTag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapQuery = HashMap<String, String>()

        mapQuery["units"] = "imperial"
        mapQuery["origins"] = "26.930813,80.9260976"
        mapQuery["destinations"] = "26.930813,80.9260976"
        mapQuery["key"] = "API"

        RetrofitClient.instance.getDistanceInfo(mapQuery)
            .enqueue(object : Callback<DistanceResponse> {
                override fun onFailure(call: Call<DistanceResponse>, t: Throwable) {
                    Log.d(tagName, "onFailure 1 : ${t.message}")
                }

                override fun onResponse(
                    call: Call<DistanceResponse>,
                    response: Response<DistanceResponse>
                ) {
                    Log.d(tagName, "onResponse 1 : ${response.body()}")


                }
            })
    }


}