package `in`.ehisab.distancematrix.datalayer

import com.google.gson.annotations.SerializedName

data class DistanceResponse(
    @SerializedName("destination_addresses")
    var destinationAddresses: List<String?>? = null,
    @SerializedName("origin_addresses")
    val originAddresses: List<String>? = null,

    @SerializedName("rows")
    val rows: List<Row>? = null,

    @SerializedName("status")
    val status: String? = null
)

data class Row(

    @SerializedName("elements")
    var elements: List<Element?>? = null
)

data class Element(

    @SerializedName("distance")
    var distance: Distance? = null,
    @SerializedName("duration")
    val duration: Duration? = null,

    @SerializedName("status")
    val status: String? = null
)

data class Duration(

    @SerializedName("text")
    var text: String? = null,
    @SerializedName("value")
    val value: Int? = null
)

data class Distance(

    @SerializedName("text")
    var text: String? = null,
    @SerializedName("value")
    val value: Int? = null
)