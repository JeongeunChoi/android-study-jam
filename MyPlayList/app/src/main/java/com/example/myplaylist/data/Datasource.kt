package com.example.myplaylist.data

import com.example.myplaylist.MyPlayList
import com.example.myplaylist.R

class Datasource {

    fun loadMyPlayList(): MutableList<MyPlayList> {
        return mutableListOf<MyPlayList>(
            MyPlayList("이무진", R.string.이무진, R.drawable.song1),
            MyPlayList("잔나비", R.string.잔나비, R.drawable.song2),
            MyPlayList("SG워너비", R.string.SG워너비, R.drawable.song3),
            MyPlayList("이무진", R.string.이무진, R.drawable.song1),
            MyPlayList("잔나비", R.string.잔나비, R.drawable.song2),
            MyPlayList("SG워너비", R.string.SG워너비, R.drawable.song3),
            MyPlayList("이무진", R.string.이무진, R.drawable.song1),
            MyPlayList("잔나비", R.string.잔나비, R.drawable.song2),
            MyPlayList("SG워너비", R.string.SG워너비, R.drawable.song3),
            MyPlayList("이무진", R.string.이무진, R.drawable.song1),
            MyPlayList("잔나비", R.string.잔나비, R.drawable.song2),
            MyPlayList("SG워너비", R.string.SG워너비, R.drawable.song3),
            MyPlayList("이무진", R.string.이무진, R.drawable.song1),
            MyPlayList("잔나비", R.string.잔나비, R.drawable.song2),
            MyPlayList("SG워너비", R.string.SG워너비, R.drawable.song3),
            MyPlayList("이무진", R.string.이무진, R.drawable.song1),
            MyPlayList("잔나비", R.string.잔나비, R.drawable.song2),
            MyPlayList("SG워너비", R.string.SG워너비, R.drawable.song3),
            MyPlayList("이무진", R.string.이무진, R.drawable.song1),
            MyPlayList("잔나비", R.string.잔나비, R.drawable.song2),
            MyPlayList("SG워너비", R.string.SG워너비, R.drawable.song3)
        )
    }
}