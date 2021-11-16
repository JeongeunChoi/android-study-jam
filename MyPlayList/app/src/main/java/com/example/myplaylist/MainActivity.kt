package com.example.myplaylist

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myplaylist.adapter.ItemAdapter
import com.example.myplaylist.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newSong: EditText = findViewById(R.id.add_song)
        val newSinger: EditText = findViewById(R.id.add_singer)
        val addButton: Button = findViewById(R.id.add_button)
        // addButton.setOnClickListener { addPlayList() }

        // Datasource 인스턴스를 만들고 이 인스턴스에서 loadMyPlayList() 메서드를 호출
        // 반환된 확인 목록을 myDataset라는 val에 저장
        val myDataset = Datasource().loadMyPlayList()

        // 컨텍스트(this)와 myDataset를 매개변수로 새 ItemAdapter 인스턴스를 만들어
        // ItemAdapter 객체를 recyclerView의 adapter 속성에 할당
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}