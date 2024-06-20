package com.example.jpcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun CustomeList(model: FruitModel) {
    val fruitsList = mutableListOf<FruitModel>()

    fruitsList.add(FruitModel("Apple", R.drawable.me))
    fruitsList.add(FruitModel("Banana", R.drawable.me))
    fruitsList.add(FruitModel("Orange", R.drawable.me))
    fruitsList.add(FruitModel("Mango", R.drawable.me))
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.Gray)
    ) {
        Image(
            painter = painterResource(id = R.drawable.me),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
        )
        Text(
            text = model.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White
            )
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        items(fruitsList) { model ->
            CustomeList(model = model)
        }
    }
}


//LazyColumn(
//contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
//) {
//    // ...
//}


//LazyRow(
//verticalArrangement = Arrangement.spacedBy(4.dp),
//) {
//    // ...
//}