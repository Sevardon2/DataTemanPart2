package com.engga.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_myfriends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman : ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman = ArrayList()
        listTeman.add(
            MyFriend("Kharisma Dharma Putra", "Laki-Laki", "kharisma@gmail.com",
        "085777111555", "Singapore")
        )
        listTeman.add(
            MyFriend("Indah Kurniani", "Perempuan", "indah@gmail.com",
            "082111666000", "Malaysia")
        )
        listTeman.add(
            MyFriend("Mochammad Khafidz", "Laki-Laki", "khafidz@gmail.com",
            "089444777222", "Thailand")
        )
        listTeman.add(
            MyFriend("Arhamiz Zakiyah Mika", "Perempuan", "mika@gmail.com",
            "081999000444", "Filipina")
        )
        listTeman.add(
            MyFriend("Fahrul Tovan Malik", "Laki-Laki", "fahrul@gmail.com",
            "083444111666", "Vietnam")
        )
        listTeman.add(
            MyFriend("Ira Kestina Damayanti", "Perempuan", "maya@gmail.com",
            "089555333999", "Brunei Darussalam")
        )
        listTeman.add(
            MyFriend("Muhamad Muhajirin", "Laki-Laki", "muhajirin@gmail.com",
            "0821555000222", "Laos")
        )
        listTeman.add(
            MyFriend("Veti Ningrum", "Perempuan", "veti@gmail.com",
            "085111888000", "Kamboja")
        )
        listTeman.add(
            MyFriend("Feri Efendi", "Laki-Laki", "feri@gmail.com",
            "081000555222", "Indonesia")
        )
    }

    private fun tampilTeman(){
        rv_listmyfriends.layoutManager = LinearLayoutManager(activity)
        rv_listmyfriends.adapter = MyFriendAdapter(requireActivity(), listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_myfriends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}