package `in`.ehisab.distancematrix.api

import `in`.ehisab.distancematrix.datalayer.DistanceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap


interface Api {

    @GET("maps/api/distancematrix/json")
    fun getDistanceInfo(
        @QueryMap parameters: Map<String, String>
    ): Call<DistanceResponse>
}