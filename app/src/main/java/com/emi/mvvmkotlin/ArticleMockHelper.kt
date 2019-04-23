package com.emi.mvvmkotlin

import java.util.*

object ArticleMockHelper{


    val mockArticleData : List<Article>
    get() {
        val list = ArrayList<Article>()
        for(i in 0..25){
            val article = Article()
            article.title = "Its a New Design"
            article.subtitle = "Es un nuevo Diseno"
            article.excerpt = "These are some of our reference designs.."
            article.date = Date()

            list.add(article)
        }
        return list
    }
}