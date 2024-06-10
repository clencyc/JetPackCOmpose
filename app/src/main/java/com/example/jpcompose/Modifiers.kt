package com.example.jpcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.SolidColor
import com.example.jpcompose.ui.theme.JPComposeTheme

class Modifiers : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutPrev()
        }
    }
}

@Preview( showBackground = true, showSystemUi = true)
@Composable
fun LayoutPrev() {
    TextWidthPadding()
    WidthnHeight()
    SizeModifier()
    Fillwidth()
    AlphaMod()
    FillmaxHeight()
}

@Composable
fun TextWidthPadding() {
    Text(
        "Padding and Margin with modifiers",
        Modifier
            .padding(32.dp) //outer padding
            .background(color = Color.Green)
            .padding(16.dp) // Inner padding
    )
}

@Composable
fun WidthnHeight() {
    Text(
        "This are width and height adjustments",
        color = Color.Black,
        modifier = Modifier
            .padding(100.dp)
            .background(Color.Blue)
            .width(200.dp)
            .height(300.dp)
            .padding(16.dp)

    )
}

@Composable
fun SizeModifier() {
    Text(
        text = "Text with Size",
        color = Color.Black,
        modifier = Modifier
            .background(Color.Cyan)
            .width(200.dp)
            .height(100.dp)
    )
}

@Composable
fun Fillwidth() {
    Text(
        text = "This is My Fill width text",
        color = Color.White,
        modifier = Modifier
            .background(Color.Blue)
            .padding(Dp(10f))
            .fillMaxWidth(1f)
    )
}

@Composable
fun FillmaxHeight() {
    Text(
        text = "Maximum height",
        color = Color.Black,
        modifier = Modifier
            .background(Color.Magenta)
            .fillMaxHeight(0.50f)
    )
}
@Composable
fun AlphaMod() {
    Box(

        Modifier
            .padding(100.dp)
            .rotate(45f)
            .background(Color.Red)
            .alpha(1f)
            .height(100.dp)
            .width(100.dp)

    )
}
@Preview( showBackground = true, showSystemUi = true, name = "WeightMod")
@Composable
fun WeightModifier(){
    Row() {
        Column(
            Modifier
                .weight(1f)
                .background(Color.Red)){
            Text(text = "Weight = 1", color = Color.White)
        }
        Column(
            Modifier
                .weight(1f)
                .background(Color.Blue)){
            Text(text = "Weight = 1", color = Color.White)
        }
        Column(
            Modifier
                .weight(2f)
                .background(Color.Green)
        ) {
            Text(text = "Weight = 2")
        }

    }

    Text(
        text = "Text with Red Border",
        modifier = Modifier
            .padding(20.dp)
            .background(Color.Yellow)
            .border(2.dp, Color.Red)
            .padding(10.dp)
    )
    Text(
        text = "Text with round border",
        modifier = Modifier
            .padding(70.dp)
            .border(2.dp, SolidColor(Color.Green), RoundedCornerShape(20.dp))
            .padding(10.dp)
            .padding(start = 5.dp)
    )
    Text(
        text = "Text with Clipped background",
        color = Color.White,
        modifier = Modifier
            .padding(Dp(10f))
            .clip(RoundedCornerShape(25.dp))
            .background(Color.Blue)
            .padding(Dp(15f))
    )
}
@Preview( showBackground = true, showSystemUi = true, name = "WeightMod")
@Composable
fun CustomButton() {
    Button(
        onClick = { /* TODO: handle click */ },
        modifier = Modifier
            .padding(100.dp)
            .border(2.dp, SolidColor(Color.Black), RoundedCornerShape(20.dp))
            .size(110.dp, 50.dp) // width, height
    ) {
        Text(
            text = "Click me",
            modifier = Modifier.padding(horizontal = 17.dp) // inner padding
        )
    }}
// Text with border

// CLIP MODIFIER
// RectangleShape
// CircleShape
//RoundedCornerShape
//CutCornerShape