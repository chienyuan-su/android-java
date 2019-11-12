package com.amber.androidex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amber.androidex.listview.ListViewActivity;
import com.amber.androidex.recycleview.RecycleViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnGoLayoutView;
    private Button mBtnGotoTextView;
    private Button mBtnGoBtnView;
    private Button mBtnGoListView;
    private Button mBtnGoRecycleView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnGoLayoutView = findViewById(R.id.btn_go_layout);
        mBtnGotoTextView = findViewById(R.id.btn_go_text_view);
        mBtnGoBtnView = findViewById(R.id.btn_go_btn_view);
        mBtnGoListView = findViewById(R.id.btn_go_list_view);
        mBtnGoRecycleView = findViewById(R.id.btn_go_recycle_view);
        this.setListeners();
    }

    private void setListeners() {
        OnClick onClick = new OnClick();

        mBtnGoLayoutView.setOnClickListener(onClick);
        mBtnGotoTextView.setOnClickListener(onClick);
        mBtnGoBtnView.setOnClickListener(onClick);
        mBtnGoListView.setOnClickListener(onClick);
        mBtnGoRecycleView.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_go_layout:
                    intent = new Intent(MainActivity.this, LayoutActivity.class);
                    break;
                case R.id.btn_go_text_view:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_go_btn_view:
                    intent = new Intent(MainActivity.this, BtnViewActivity.class);
                    break;
                case R.id.btn_go_list_view:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_go_recycle_view:
                    intent = new Intent(MainActivity.this, RecycleViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
