package kotlincodes.com.retrofitwithkotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class DataModel(
        @Expose
        @SerializedName("title")
        val title: String,
        @Expose
        @SerializedName("author")
        val author: String,
        @Expose
        @SerializedName("summary")
        val summary: String
)