package com.example.jpcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jpcompose.ui.theme.JPComposeTheme

class LazyColNrOW : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                    ListScopeSample()
                    SimpleList()
        }
    }
}
//LazyColumn - Vertical RecyclerView
//LazyRow - Horizontal RecyclerView

@Preview(showBackground = true, showSystemUi = true,
    device = "spec:id=reference_phone,shape=Normal,width=411,height=891,unit=dp,dpi=420"
)
@Composable
fun ListScopeSample() {
    LazyColumn {
        item {
            Text(text = "First Item")
        }
        item {
            Text(text = "Second Item")
        }
        items(3) { index ->
            Text(text = "First List items :$index")
        }
        items(2) { index ->
            Text(text = "Second List items :$index")

        }
        item {
            Text(text = "Footer")
        }
    }
}

//first write an object
private val countryList =
    mutableListOf("India", "Pakistan", "China", "United States")

private val listModifier = Modifier
    .fillMaxSize()
    .background(Color.Blue)
    .padding(16.dp)
private val textStyle = TextStyle(
    color = Color.Black,
    fontSize = 20.sp
)
@Preview(showBackground = true, showSystemUi = true,
    device = "spec:id=reference_phone,shape=Normal,width=411,height=891,unit=dp,dpi=420"
)
@Composable
fun SimpleList() {
    LazyColumn(modifier = listModifier) {
        items(countryList) { country ->
            Text(text = country, style = textStyle)
        }

    }

}


//@Preview(showBackground = true, showSystemUi = true,
//    device = "spec:id=reference_phone,shape=Normal,width=411,height=891,unit=dp,dpi=420"
//)
//// Displaying fruit names with images
//

