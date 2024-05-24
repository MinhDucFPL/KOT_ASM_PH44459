package com.kot104.kot_asm_ph44459.src

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.kot104.kot_asm_ph44459.compose.CategoriesSection
import com.kot104.kot_asm_ph44459.compose.ProductSection


@Composable
fun Home(navControl: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 26.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 26.dp),
            verticalAlignment = Alignment.Top,
            horizontalArrangement =  Arrangement.SpaceBetween

        ) {
            Icon(
                Icons.Default.Search ,
                contentDescription = "",
                modifier = Modifier.size(30.dp),
            )
            Column {
                Text(text = "Make home", color = Color(0xff909090) )
                Text(text = "BEAUTIFUL")

            }
            Icon(Icons.Outlined.ShoppingCart,
                contentDescription = null,
                modifier = Modifier.size(30.dp))

        }

        CategoriesSection()
        ProductSection(navControl)

    }
}