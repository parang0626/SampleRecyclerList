package kr.co.openit.giparang.samplerecyclerlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    RecyclerView listView;
    RecyclerPersonAdapter mAdapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 리스트뷰와 어뎁터를 생성후 설정
        // linerlayoutManager manager = new LinearlayoutManager( 속성을 vertical에따라 변경가능
    }
}
