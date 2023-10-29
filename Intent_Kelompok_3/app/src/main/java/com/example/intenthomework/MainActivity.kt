package com.example.intenthomework

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.*
import com.example.intenthomework.ui.theme.IntentHomeworkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntentHomeworkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {
    val context = LocalContext.current
    val intent = Intent(context, SecondActivity::class.java)
    val intent2 = Intent(context, SecondActivity2::class.java)
    val intent3 = Intent(context, SecondActivity3::class.java)
    val intent4 = Intent(context, SecondActivity4::class.java)
    val intent5 = Intent(context, SecondActivity5::class.java)
    val intent6 = Intent(context, SecondActivity6::class.java)
    val intent7 = Intent(context, SecondActivity7::class.java)
    val intent8 = Intent(context, SecondActivity8::class.java)

    Column {
        TopAppBar(
            title = { Text(text = "Philipp Lackner - VIDEO TUTORIAL")},
            modifier = Modifier.fillMaxWidth()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.banner1),
                contentDescription = "Thumbnail",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = "Video Part 1 - 8",
                modifier = Modifier.padding(16.dp),
                style = TextStyle(fontSize = 18.sp)
            )
            Row {
                Button(
                    onClick = {
                        startActivity(context, intent, null)
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Part 1")
                }
                Button(
                    onClick = {
                        startActivity(context, intent2, null)
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Part 2")
                }
            }
            Row {
                Button(
                    onClick = {
                        startActivity(context, intent3, null)
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Part 3")
                }
                Button(
                    onClick = {
                        startActivity(context, intent4, null)
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Part 4")
                }
            }
            Row {
                Button(
                    onClick = {
                        startActivity(context, intent5, null)
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Part 5")
                }
                Button(
                    onClick = {
                        startActivity(context, intent6, null)
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Part 6")
                }
            }
            Row {
                Button(
                    onClick = {
                        startActivity(context, intent7, null)
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Part 7")
                }
                Button(
                    onClick = {
                        startActivity(context, intent8, null)
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Part 8")
                }
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IntentHomeworkTheme {
        Greeting()
    }
}