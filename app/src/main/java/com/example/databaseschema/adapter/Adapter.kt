package com.example.databaseschema.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.databaseschema.R
import com.example.databaseschema.model.Post
import kotlinx.android.synthetic.main.row_layout.view.*
class Adapter: RecyclerView.Adapter<Adapter.MyViewHolder>() {



    private var list = emptyList<Post>()
    val str1 : String = "GOLD"

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false))

    }


    override fun getItemCount():Int{
        return Math.min(list.size, 1);

    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.userRank_txt.text = list [1].rank.toString()
        holder.itemView.userTier_txt.text = list [1].tier.toString()


        if (holder.itemView.userTier_txt.text == str1){
            holder.itemView.answerTxt.text="Lassb er i plat"

            Log.d("True","sølv")
        }
        else{
            holder.itemView.answerTxt.text="Nej selvfølgelig ikke"

            Log.d("False", str1)
        }
    }

    fun setData(newList: List<Post>){
        list = newList
        notifyDataSetChanged()
    }
}