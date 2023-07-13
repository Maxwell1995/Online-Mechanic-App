package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EventsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>
    lateinit var detailList: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)

           imageList = arrayOf(
            R.drawable.landcruiser,
            R.drawable.cmc,
            R.drawable.cmc,
            R.drawable.wrc,
            R.drawable.landcruiser,
            R.drawable.landcruiser,
            R.drawable.cmc,
            R.drawable.landcruiser,
            R.drawable.wrc,
            R.drawable.landcruiser,
            R.drawable.landcruiser,
            )

        titleList = arrayOf(
            "LANDCRUISER KENYA",
            "THE NEW NISSAN NAVARA ARRIVES IN 2021, DESIGNED ",
            "WRC - KENYAN PRESIDENT WILLIAM RUTO WAVES OFF SAFARI RALLY’S 70TH EDITION",
            "LANDCRUISER KENYA",
            "LANDCRUISER KENYA",
            "LANDCRUISER KENYA",
            "LANDCRUISER KENYA",
            "LANDCRUISER KENYA",
            "LANDCRUISER KENYA",
            "LANDCRUISER KENYA",
            "LANDCRUISER KENYA",
            "LANDCRUISER KENYA",
            "LANDCRUISER KENYA",
            "LANDCRUISER KENYA",
        )

        detailList = arrayOf(

            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",
            "Nissan knows its customers loved the NP300 Hardbody, and it was that loyalty that allowed it to become one of the best-selling Nissan vehicles in African markets.",

        )

        recyclerView = findViewById(R.id.rcEvents)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataClass>()
        getData()

    }
//for loop for elements in the dataclass in the same order
    //i is the index value for the elements
    //data list is an array list of dataclass
    //set data to the recyclerview
    private fun getData() {
        for (i in imageList.indices) {
            val dataClass = DataClass(imageList[i], titleList[i], detailList[i])
            dataList.add(dataClass)
        }
    recyclerView.adapter = RecyclerViewAdapter(dataList)
    }
}