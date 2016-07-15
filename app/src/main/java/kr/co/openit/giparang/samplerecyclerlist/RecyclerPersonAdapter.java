package kr.co.openit.giparang.samplerecyclerlist;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kr.co.openit.giparang.samplerecyclerlist.data.Person;

/**
 * Created by Tacademy on 2016-07-15.
 */
public class RecyclerPersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    //리스트만들고
    // 데이터 추가하는 함수 만들고
    List<Person> personList = new ArrayList<>();

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // 뷰를 하나 만들어야되는데 이건 인플레이터로 만든다.
        // 인플레이트를 사용 할때 액티비티에서 릴레이티브를 wrap content로 바꺼야됨 null을 넣을경우 둘다 워랩으로됨 집가면 해보좡좡

        return null;
    } // 뷰홀더를 호출하라면 애를 하고

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.setPerson(person);

    } // 뷰홀더에 내용을 체우려면 애를 이용

    @Override
    public int getItemCount() {
        return personList.size();
    }
}
 //레이아웃 매니저를 통해

// 리사이클러 리스트를쓰면 아이템 클릭하는 이미지 클릭후 이미지 디바이더 등등을 설정해야된다.
