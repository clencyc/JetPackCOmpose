package com.example.jpcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Imagea : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListPreview()
        }
    }
}


@Composable
fun SimpleImages() {
    Image(
        painter = painterResource(id = R.drawable.me),
        contentDescription = "Clency Christine",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )

}
@Composable
fun Buttonclick() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .padding(16.dp)
            .border(2.dp, SolidColor(Color.Black), RoundedCornerShape(20.dp))
            .size(150.dp, 50.dp) // width, height
    ) {
        Text(
            text = "Click me",
            modifier = Modifier.padding(horizontal = 17.dp) // inner padding
        )
    }}

@Composable
fun TextRnd() {
    Text(
        text = "Rounded Image",
        style = TextStyle(fontSize = 26.sp)

        )
}

@Composable
fun RoundImage() {
        Image(
            painter = painterResource(id = R.drawable.me),
            contentDescription = "Circle Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(128.dp)
                .clip(CircleShape)
                .border(5.dp, Color.Gray, CircleShape)
        )
}

@Composable
fun RoundedCorner() {
    Image(
        painter = painterResource(id = R.drawable.me),
        contentDescription = "RoundCorners",
        modifier = Modifier
            .size(128.dp)
            .clip(RoundedCornerShape(10))
            .border(5.dp, Color.Black, RoundedCornerShape(10))
    )
}

@Composable
fun ImagewithBackground() {
    Image(
        painter = painterResource(id = R.drawable.me),
        contentDescription = "background",
        // colorFilter = ColorFilter.tint(Color.Red),
        modifier = Modifier
            .size(150.dp)
            .background(Color.Black)
            .padding(20.dp)
    )
}

@Preview(showBackground = true,
    device = "spec:width=411dp,height=891dp", showSystemUi = true, backgroundColor = 0xFFFF5722
)
@Composable
fun ListPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        SimpleImages()
        Buttonclick()
        TextRnd()
        Row{
             //RoundImage()
            // RoundedCorner()

        }
        //ImagewithBackground()
    }

}

