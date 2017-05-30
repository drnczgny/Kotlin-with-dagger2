package com.adrian.kotlinwithdagger

/**
 * Created by cadri on 2017. 05. 29..
 */

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.news_fragment.*


class NewsFragment : Fragment() {

    private val newsList by lazy {
        news_list
    }

    companion object {
        fun newInstance(param1: String, param2: String): NewsFragment {
            val fragment = NewsFragment()
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.news_fragment, container, false)
        newsList.setHasFixedSize(true)
        newsList.layoutManager = LinearLayoutManager(context)
        return view
    }

}
