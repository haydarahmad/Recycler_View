package com.haydar.recycleview.secondrecyclerview

object HpData {

    private val title : Array<String> = arrayOf(
        "Iphone",
        "samsung",
        "realme",
    )

    private val image:  Array<String> = arrayOf(
        "https://cdn1.katadata.co.id/media/images/thumb/2021/10/28/iPhone_13_Pro-2021_10_28-14_49_09_14b4d070187b2b687fe2affe100d8934_400x267_thumb.png",
        "https://asset.kompas.com/crops/NIhp5axjr98e8ba4gTtx-TXgAR4=/0x0:2880x1920/750x500/data/photo/2022/03/25/623d2c36893ca.jpg",
        "https://cdn.eraspace.com/pub/media/catalog/product/r/e/realme-6-comet-blue-1.jpg",
    )

    val listHp: ArrayList<HpModel>
        get() {
            val list = arrayListOf<HpModel>()
            for (position in title.indices) {
                val Hp = HpModel(
                    title = title[position],
                    image = image[position]
                )
                list.add(Hp)
            }
            return list
        }
}