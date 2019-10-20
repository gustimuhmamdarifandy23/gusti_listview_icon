package com.example.listview_icon

object Detail {
    private val foodName = arrayOf(
        "asam manis",
        "ayam dabu dabu",
        "ayam goreng lengkuas",
        "dendeng balado",
        "ikan bakar"

    )

    private val detail = arrayOf(
        "Saus asam manis adalah saus yang berasal dari masakan Tionghoa, dibuat dari air, cuka, saus tomat, gula, garam, dan tepung sebagai pengental yang dimasak di atas penggorengan",
        "Sambal dabu-dabu merupakan kuliner khas dari Manado sebagai salah satu kreasi menu sambal yang ada dan populer di Indonesia. ",
        "ayam goreng lengkuas adalah menu masakan ayam rumahan yang nikmatnya seperti ayam goreng restoran.",
        "Dendeng adalah daging yang dipotong tipis menjadi serpihan yang lemaknya dipangkas, dibumbui dengan saus asam, asin atau manis dengan dikeringkan dengan api kecil atau diasinkan dan dijemur.",
        "Ikan bakar adalah makanan yang bisa ditemui di banyak daerah, termasuk Kalimantan Tengah. Ikan bakar di Kalteng dipilih dari ikan sungai. "

    )

    private val foodPoster = intArrayOf(
        R.drawable.asammanis,
        R.drawable.ayamdabudabu,
        R.drawable.ayamgorenglengkuas,
        R.drawable.dendengbalado,
        R.drawable.ikanbakar
    )

    val listFood: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val food = Food()
                food.name = foodName[position]
                food.detail = detail[position]
                food.poster = foodPoster[position]
                list.add(food)
            }
            return list
        }
}