package com.emi.mvvmkotlin
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.emi.mvvmkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val layoutManager = LinearLayoutManager(this)
        binding.contactList.layoutManager = layoutManager

        val articles = ArticleMockHelper.mockArticleData

        val adapter = ArticleAdapter(articles)
        binding.contactList.adapter = adapter
    }

}
