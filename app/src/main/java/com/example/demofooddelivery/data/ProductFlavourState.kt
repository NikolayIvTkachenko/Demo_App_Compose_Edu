package com.example.demofooddelivery.data

import androidx.annotation.DrawableRes
import com.example.demofooddelivery.R

data class ProductFlavourState(
    val name: String,
    val price: String,
    @DrawableRes val imgRes: Int,
) {
    val ProductFlavourData = listOf(
        ProductFlavourState(
            imgRes = R.drawable.img_cheese,
            name = "Chedder",
            price = "0.79$"
        ),
        ProductFlavourState(
            imgRes = R.drawable.img_bacon,
            name = "Bacon",
            price = "0.52$"
        ),
        ProductFlavourState(
            imgRes = R.drawable.img_onion,
            name = "Onion",
            price = "0.28$"
        )
    )
}