package com.example.last_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.last_project.ui.theme.Last_ProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Last_ProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JetComposeImage()
                    JetComposedDesc(title= stringResource(R.string.jetpack_compose_title), paragraph= stringResource(
                        R.string.paragraph1
                    ), paragraph2 = stringResource(R.string.paragraph2)
                           )
                }
            }
        }
    }
}



@Composable
fun JetComposedDesc(title:String,paragraph:String, paragraph2: String, modifier: Modifier = Modifier) {

    Column(verticalArrangement = Arrangement.Center,
        modifier = modifier) {

        Text(
            text = title,
            fontSize = 24.sp,
            lineHeight = 116.sp,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = paragraph,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)

        )

        Text(
            text = paragraph2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)

        )
    }
}


@Composable
fun JetComposeImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.jetpackcompose)

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 1F
        )

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Last_ProjectTheme {
        Column {
            JetComposeImage()
            JetComposedDesc(
                title = stringResource(R.string.jetpack_compose_title), paragraph = stringResource(
                    R.string.paragraph1
                ), paragraph2 = stringResource(R.string.paragraph2)
            )
        }
    }
}