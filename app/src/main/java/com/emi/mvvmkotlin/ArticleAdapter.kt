package com.emi.mvvmkotlin

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.emi.mvvmkotlin.databinding.RowItemBinding

class ArticleAdapter(private val mArticle : List<Article>) : RecyclerView.Adapter<ArticleAdapter.BindingHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingHolder {
        val binding = DataBindingUtil.inflate<RowItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.row_item, parent, false)

        return BindingHolder(binding)
    }

    override fun onBindViewHolder(holder: BindingHolder, position: Int) {
       val binding = holder.binding
        binding.mvm = ViewModel(mArticle[position])
    }

    override fun getItemCount(): Int {
        return mArticle.size
    }

    class BindingHolder(val binding : RowItemBinding) : RecyclerView.ViewHolder(binding.mainLayout)
}