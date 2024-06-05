package com.example.jpcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.jpcompose.ui.theme.JPComposeTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutPreview()
        }
    }
}


val  redTextStyle = TextStyle(color = Color.Red,fontSize = 30.sp)
@Preview( showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Row {
        LayoutPreview()
    }
}
@Composable
fun LayoutPreview() {
    //LayoutCont()
//    TextWithSize("Big Text", 40.sp)
//    ColorText()
//    Boldtext()
//    ItalicText()
//    MaxLines()
//    Overflow()
//    SelectableText()
    TextDeco()
}
//
//@Composable
//fun TextWithSize(label : String, size : TextUnit) {
//    androidx.compose.material.Text(label, fontSize = size)
//}
//@Composable
//fun ColorText() {
//    androidx.compose.material.Text("Color text", color = Color.Blue)
//}
//
//@Composable
//fun Boldtext() {
//    androidx.compose.material.Text("Bold text", fontWeight = FontWeight.Bold)
//}
//
//@Composable
//fun ItalicText() {
//    androidx.compose.material.Text("Italic Text", fontStyle = FontStyle.Italic)
//}
//
//@Composable
//fun MaxLines() {
//    androidx.compose.material.Text("hello ".repeat(50), maxLines = 2)
//}
//
//@Composable
//fun Overflow() {
//    androidx.compose.material.Text(
//        "Hello Compose ".repeat(50),
//        maxLines = 2,
//        overflow = TextOverflow.Ellipsis
//    )
//}
//
//@Composable
//fun SelectableText() {
//    SelectionContainer {
//        androidx.compose.material.Text("This text is selectable")
//    }
//}

@Composable
fun TextDeco() {
    Column {
        Text(
            text = "Text with Underline",
            style = TextStyle(
                color = Color.Black, fontSize = 56.sp,
                textDecoration = TextDecoration.Underline
            )
        )
        Text(
            text = "Text with shadow",
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Black,
                    offset = Offset(5f, 5f),
                    blurRadius = 5f
                )
            )
        )
        Text(
            text = "My School is amazing",
            style = TextStyle(
                color = Color.Blue,
                textDecoration = TextDecoration.LineThrough,
                fontSize = 30.sp
            )
        )
        Text(
            text = "Heading 3",
            style = MaterialTheme.typography.displayLarge
        )
    }
}