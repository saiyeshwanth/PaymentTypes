package com.example.android.paymenttypes

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.indview.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myadapter = object : BaseAdapter() {

            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                val inflater = LayoutInflater.from(this@MainActivity)
                val v = inflater.inflate(R.layout.indview, null)

                Glide.with(this@MainActivity).load(R.drawable.cash).into(v.iview)
                Glide.with(this@MainActivity).load(R.drawable.paytm).into(v.iview)
                Glide.with(this@MainActivity).load(R.drawable.phonepe).into(v.iview)
                Glide.with(this@MainActivity).load(R.drawable.googlepay).into(v.iview)


                return v
            }
            override fun getCount(): Int {
                return 0
            }

            override fun getItem(position: Int): Any {
                return 0
            }

            override fun getItemId(position: Int): Long {
                return 0
            }

        }
        lview.adapter = myadapter
    }
}
