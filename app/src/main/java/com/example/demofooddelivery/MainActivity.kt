package com.example.demofooddelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.demofooddelivery.data.OrderState
import com.example.demofooddelivery.screens.ProductDetailsScreen
import com.example.demofooddelivery.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                var amount by remember { mutableIntStateOf(5) }
                val totalPrice by remember { derivedStateOf { amount * PRODUCT_PRICE_PER_UNIT } }

                ProductDetailsScreen(
                    orderState = OrderState(
                        amount = amount,
                        totalPrice = "$PRODUCT_CURRENCY${totalPrice}"
                    ),
                    onAddItemClicked = { amount = amount.inc() },
                    onRemoveItemClicked = { if (amount > 0) amount = amount.dec() }
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        ProductDetailsScreen(
            onAddItemClicked = {

            },
            onRemoveItemClicked = {

            },
            onCheckOutClicked = {

            }
        )
    }
}

private const val PRODUCT_PRICE_PER_UNIT = 5.25
private const val PRODUCT_CURRENCY = "$"