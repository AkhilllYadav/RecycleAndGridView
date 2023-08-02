package com.example.recycleandgridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // on below line we are creating variables
    // for our swipe to refresh layout,
    // recycler view, adapter and list.
    lateinit var courseRV: RecyclerView
    lateinit var courseRVAdapter: CourseRVAdapter
    lateinit var courseList: ArrayList<CourseRVModal>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // on below line we are initializing
        // our views with their ids.
        courseRV = findViewById(R.id.idRVCourses)

        // on below line we are initializing our list
        courseList = ArrayList()

        // on below line we are creating a variable
        // for our grid layout manager and specifying
        // column count as 2
        val layoutManager = GridLayoutManager(this, 2)

        courseRV.layoutManager = layoutManager

        // on below line we are initializing our adapter
        courseRVAdapter = CourseRVAdapter(courseList, this)

        // on below line we are setting
        // adapter to our recycler view.
        courseRV.adapter = courseRVAdapter

        // on below line we are adding data to our list
        courseList.add(CourseRVModal("Avatar", R.drawable.avatar))
        courseList.add(CourseRVModal("Batman", R.drawable.batman))
        courseList.add(CourseRVModal("End Game", R.drawable.end_game))
        courseList.add(CourseRVModal("Hulk", R.drawable.hulk))
        courseList.add(CourseRVModal("Inception", R.drawable.inception))
        courseList.add(CourseRVModal("Jumanji", R.drawable.jumanji))
        courseList.add(CourseRVModal("Jurasic", R.drawable.jurasic))
        courseList.add(CourseRVModal("Lucy", R.drawable.lucy))
        courseList.add(CourseRVModal("SpiderMan", R.drawable.spider_man))
        courseList.add(CourseRVModal("Venom", R.drawable.venom))

        // on below line we are notifying adapter
        // that data has been updated.
        courseRVAdapter.notifyDataSetChanged()

    }
}
