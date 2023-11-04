package com.example.hw5clickbait.data

import com.example.hw5clickbait.R
import com.example.hw5clickbait.model.Article

object DataSource {
    val articles = listOf(
        Article(R.drawable.travel,"BuzzFeed", R.string.headline1, "22m ago"),
        Article(R.drawable.pet,"InfoFrenzyHub", R.string.headline2, "1h ago"),
        Article(R.drawable.fantasy,"ViralInsightGlobe", R.string.headline3, "16h ago"),
        Article(R.drawable.diy,"ViralInsightGlobe", R.string.headline4, "36m ago"),
        Article(R.drawable.cartoons,"CuriositySphere", R.string.headline5, "2d ago"),
        Article(R.drawable.pizza,"InfoFrenzyHub", R.string.headline6, "42m ago"),
        Article(R.drawable.celebrity,"TrendUnveilArena", R.string.headline7, "12m ago"),
        Article(R.drawable.junkfood,"BuzzFeed", R.string.headline8, "2h ago"),
        Article(R.drawable.soulmate,"CuriositySphere", R.string.headline9, "4h ago"),
        Article(R.drawable.lifehacks,"HuffPost", R.string.headline10, "51m ago"),
    )
}