package com.team2.todolist_sqlite

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import java.lang.Math.E

class ItemRecyclerViewAdaptor (
    private val ItemList: MutableList<Item>,
    private val owner: Activity
): RecyclerView.Adapter<ItemRecyclerViewAdaptor.ItemHolder>() {
    inner class ItemHolder(rowRoot: View): RecyclerView.ViewHolder(rowRoot) {
        val itemCB: CheckBox = rowRoot.findViewById(R.id.item_toggle_cb)
        val itemTV: TextView = rowRoot.findViewById(R.id.item_content_tv)
        val itemBTN: Button = rowRoot.findViewById(R.id.item_remove_btn)

        // data 하나 빼주기 용
        val rootView = rowRoot as RelativeLayout

        // click listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.list_rv_item, parent, false)
        return ItemHolder(view)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val ItemData = ItemList[position]

        with (holder) {
            itemCB.isChecked = ItemData.isComplete
            itemTV.text = ItemData.content
        }
        holder.itemBTN.setOnClickListener {
            ItemList.removeAt(position)
            Log.e("@@@@", "아이템을 지웁니다................")

            // 데이터셋 변경됨 알림
            notifyDataSetChanged()
        }
        holder.itemCB.setOnClickListener {
            ItemData.isComplete = holder.itemCB.isChecked

            notifyDataSetChanged()
        }
    }

    override fun getItemCount() = ItemList.size

    fun addItem(item: Item) {
        ItemList.add(item)
    }

    fun rmItem(position: Int) {
        ItemList.removeAt(position)
    }

    fun updateItem(task: String, position: Int) {
        ItemList[position].content = task
    }

    fun refreshDataset() {
        notifyDataSetChanged()

    }
}