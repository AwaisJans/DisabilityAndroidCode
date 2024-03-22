package com.jans.disability.android.code

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    var adapter: ImageGalleryAdapter2? = null
    var recyclerView: RecyclerView? = null
    var listiner: ClickListiner? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Disability in Android"

        val list: List<examData?>?
        list = getData()

        recyclerView = findViewById<View>(
            R.id.rvList
        ) as RecyclerView
        listiner = ClickListiner { index ->
            Toast.makeText(this@MainActivity, "clicked item index is $index", Toast.LENGTH_LONG).show() }
        adapter = ImageGalleryAdapter2(
            list, application, listiner
        )
        recyclerView!!.adapter = adapter
        recyclerView!!.layoutManager = LinearLayoutManager(this@MainActivity)


    }


    private fun getData(): List<examData>? {
        val list: MutableList<examData> = ArrayList()
        list.add(
            examData(
                "First Exam",
                "May 23, 2015",
                "Best Of Luck"
            )
        )
        list.add(
            examData(
                "SecondSecondSecondSecondSecondSecond" +
                        "SecondSecondSecondSecond" +
                        "SecondSecondSecond" +
                        "SecondSecondSecond Exam",
                "June 09, 2015",
                "b of l"
            )
        )
        list.add(
            examData(
                "My TesSecondSecondSecond" +
                        "SecondSecondSecond" +
                        "SecondSecondSecond" +
                        "SecondSecondSecond" +
                        "t Exam",
                "April 27, 2017",
                "This is testing exam .."
            )
        )
        list.add(
            examData(
                "My Test Exam",
                "April 27SecondSecondSecondSecond" +
                        "SecondSecondSecond" +
                        "SecondSecondSecond, 2017",
                "This is testing exam .."
            )
        )
        list.add(
            examData(
                "My Test Exam",
                "April 27, 2017",
                "This is testing exam .."
            )
        )

        list.add(
            examData(
                "My Test Exam",
                "April 27, 2017",
                "This is testing exam .."
            )
        )
        list.add(
            examData(
                "My Test Exam",
                "April 27, 2017",
                "This is testing exam .."
            )
        )
        list.add(
            examData(
                "My Test Exam",
                "April 27, 2017",
                "This is testing exam .."
            )
        )
        list.add(
            examData(
                "My Test Exam",
                "April 27, 2017",
                "This is testing exam .."
            )
        )
        list.add(
            examData(
                "My Test Exam",
                "April 27, 2017",
                "This is testing exam .."
            )
        )
        list.add(
            examData(
                "My Test Exam",
                "April 27, 2017",
                "This is testing exam .."
            )
        )
        list.add(
            examData(
                "My Test Exam",
                "April 27, 2017",
                "This is testing exam .."
            )
        )

        return list
    }

}