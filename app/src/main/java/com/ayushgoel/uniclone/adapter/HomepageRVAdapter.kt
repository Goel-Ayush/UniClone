package com.ayushgoel.uniclone.adapter

import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ayushgoel.uniclone.R

class HomepageRVAdapter : RecyclerView.Adapter<IViewHolder>() {

    companion object{
        const val VIEW_TYPE_1 = 1
        const val VIEW_TYPE_2 = 2
        const val VIEW_TYPE_3 = 3
        const val VIEW_TYPE_4 = 4
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IViewHolder {
        return when(viewType){
            VIEW_TYPE_1 -> FirstViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_welcome_screen, parent, false))
            VIEW_TYPE_2 -> SecondViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_second_screen, parent, false))
            VIEW_TYPE_3 -> ThirdViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_third_screen, parent, false))
            else -> FourthViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_fourth_screen, parent, false))
        }
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: IViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemViewType(position: Int): Int {
        return if (position<1) VIEW_TYPE_1 else if (position == 1) VIEW_TYPE_2 else if(position == 2) VIEW_TYPE_3 else VIEW_TYPE_4
    }


}

abstract class IViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    abstract fun bind()
}


class FirstViewHolder(val view : View) : IViewHolder(itemView = view){
    override fun bind() {
        val texthtmlView = view.findViewById<TextView>(R.id.tv_desc_text)
        texthtmlView.text = Html.fromHtml(view.context.getString(R.string.foo))
    }

}

class SecondViewHolder(val view : View) : IViewHolder(itemView = view){
    override fun bind() {
        val texthtmlView = view.findViewById<TextView>(R.id.tv_desc)
        texthtmlView.text = Html.fromHtml(view.context.getString(R.string.one_assured_cb_html))
    }

}

class ThirdViewHolder(val view : View) : IViewHolder(itemView = view){
    override fun bind() {
        val texthtmlView = view.findViewById<TextView>(R.id.tv_desc)
        texthtmlView.text = Html.fromHtml(view.context.getString(R.string._1_assured_cb_html_3))
    }

}

class FourthViewHolder(val view : View) : IViewHolder(itemView = view){
    override fun bind() {
    }

}