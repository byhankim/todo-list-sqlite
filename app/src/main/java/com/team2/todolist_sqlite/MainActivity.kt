package com.team2.todolist_sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.team2.todolist_sqlite.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)

        with (binding.todoItemRV) {
            layoutManager = manager
                DividerItemDecoration(context, LinearLayoutManager.VERTICAL)
            adapter = ItemRecyclerViewAdaptor(randomListData(), this@MainActivity)
        }

        binding.addBtnVal.setOnClickListener {
            insertItem(it)
        }
//        binding.rmBtn.setOnClickListener { removeItem(it) }
    }

    private fun insertItem(view: View) {
        binding.todoItemRV
    }



    private fun saveDataOnInternalDevice() {
        TODO("TODOTDOTOD")
    }

    private fun randomListData() : MutableList<Item> {
//        TODO("HERE TO BRING SQLite")

        val ItemData = mutableListOf<Item>()
        ItemData.add(Item(true, "1 출근 30분 일찍 하기"))
        ItemData.add(Item(false, "2 출근 302분 일찍 하기"))
        ItemData.add(Item(true, "3 출근 320분 일찍 하기"))
        ItemData.add(Item(false, "4 출근 310분 일찍 하기"))
        ItemData.add(Item(false, "5 출근 340분 일찍 하기"))
        ItemData.add(Item(false, "6 출근 350분 일찍 하기"))
        ItemData.add(Item(false, "7 출근 370분 일찍 하기"))
        ItemData.add(Item(false, "8 출근 330분 일찍 하기"))
        ItemData.add(Item(false, "9 출근 320분 일찍 하기"))
        ItemData.add(Item(false, "10 출근 360분 일찍 하기"))
        ItemData.add(Item(false, "11 출근 380분 일찍 하기"))
        ItemData.add(Item(false, "12 출근 3660분 일찍 하기"))
        ItemData.add(Item(false, "13 출근 30444분 일찍 하기"))
        ItemData.add(Item(false, "14 출근 3320분 일찍 하기"))
        ItemData.add(Item(false, "15 출근 34360분 일찍 하기"))
        ItemData.add(Item(false, "16 출근 330분 일찍 하기"))
        ItemData.add(Item(false, "17 출근 2330분 일찍 하기"))
        ItemData.add(Item(false, "18 출근 330분 일찍 하기"))
        ItemData.add(Item(false, "19 출근 430분 일찍 하기"))
        ItemData.add(Item(false, "20 출근 230분 일찍 하기"))
        ItemData.add(Item(false, "21 출근 307분 일찍 하기"))
        ItemData.add(Item(false, "22 출근 306분 일찍 하기"))

        return ItemData
    }
}