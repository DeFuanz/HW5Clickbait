package com.example.hw5clickbait

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hw5clickbait.data.DataSource
import com.example.hw5clickbait.model.Article
import com.example.hw5clickbait.ui.theme.HW5ClickbaitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HW5ClickbaitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NewsAppLayout()
                }
            }
        }
    }
}

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsAppLayout() {
    Scaffold (
        topBar = {
            TopAppBar(
                title = {Text(text = "Top Headlines")}
            )
        }
    ) {
        LazyVerticalGrid(contentPadding = it, columns = GridCells.Fixed(2), modifier = Modifier.padding(8.dp), verticalArrangement = Arrangement.spacedBy(8.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            items(DataSource.articles) { article ->
                NewsCard(article)
            }
        }
    }
}

@Composable
fun NewsCard(article: Article, modifier: Modifier = Modifier) {
    Card() {
        Column (){
            Image(painter = painterResource(article.imageResourceId), contentDescription = null,
                modifier
                    .height(150.dp)
                    .fillMaxWidth(), contentScale = ContentScale.Crop)
            Text(text = article.newsName, style = MaterialTheme.typography.titleLarge, modifier = Modifier.padding(
                horizontal = 12.dp,
                vertical = 6.dp
            ))
            Text(text = stringResource(id = article.title), maxLines = 4, overflow = TextOverflow.Ellipsis, style = MaterialTheme.typography.bodyMedium, modifier = Modifier.padding(
                horizontal = 12.dp,
                vertical = 8.dp
            ))
            Divider(color = Color.White)
            Text(text = article.updated, style = MaterialTheme.typography.labelMedium, modifier = Modifier.padding(
                horizontal = 12.dp,
                vertical = 4.dp
            ))
        }
    }
}

@Preview
@Composable
fun NewsCardPreview() {
    NewsCard(DataSource.articles[0])
}

@Preview
@Composable
fun NewsCardPreviewDark() {
    HW5ClickbaitTheme (darkTheme = true) {
        NewsCard(DataSource.articles[1])
    }
}

@Preview
@Composable
fun NewsLayoutPreviewDark() {
    HW5ClickbaitTheme (darkTheme = true) {
        NewsAppLayout()
    }
}