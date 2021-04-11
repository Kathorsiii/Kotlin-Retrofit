package kotlincodes.com.retrofitwithkotlin.retrofit

import kotlincodes.com.retrofitwithkotlin.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("books")
    fun getPhotos(): Call<List<DataModel>>

}