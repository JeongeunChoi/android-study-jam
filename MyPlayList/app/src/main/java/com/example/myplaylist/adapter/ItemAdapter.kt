package com.example.myplaylist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myplaylist.MyPlayList
import com.example.myplaylist.R

class ItemAdapter(
    //MyPlayList List를 받을 변수 dataset과
    //각종 앱 관련 정보를 받을 context 객체를 생성자에 선언
    private val context: Context,
    private val dataset: List<MyPlayList>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val cover: ImageView = view.findViewById(R.id.item_cover)
        val singer: TextView = view.findViewById(R.id.item_singer)
        val song: TextView = view.findViewById(R.id.item_song)
    }
    //RecyclerView의 새 뷰 홀더를 만들기 위해 레이아웃 관리자가 호출
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        adapterLayout.accessibilityDelegate = Accessibility
        return ItemViewHolder(adapterLayout)
    }
    //목록 항목 뷰의 콘텐츠를 바꾸기 위해 레이아웃 관리자가 호출
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.cover.setImageResource(item.ImageResourceId)
        holder.singer.text = item.stringName
        holder.song.text = context.resources.getString(item.stringResourceId)
    }
    //데이터 세트의 크기를 반환
    override fun getItemCount(): Int {
        return dataset.size
    }
}