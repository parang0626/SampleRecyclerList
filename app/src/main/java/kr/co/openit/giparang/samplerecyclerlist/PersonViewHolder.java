package kr.co.openit.giparang.samplerecyclerlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import kr.co.openit.giparang.samplerecyclerlist.data.Person;

/**
 * Created by Tacademy on 2016-07-15.
 */
public class PersonViewHolder extends RecyclerView.ViewHolder {
    // 이미지뷰 텍스트뷰
    ImageView personImageView;
    TextView personNameView;
    TextView personAgeView;
    TextView personCommentView;
    Person person;


    //리스너를 만들어주자
    public interface OnPersonItemClickListener
    {
        public void onPesonItemClick() // 넘기고싶은 인자를넣자
    }

    // 셋리스너 만들자

    //데이터상의 포지션은 어뎁터의 포지션 레이아웃은 보이는거안에서 포지션(인덱스)
    public PersonViewHolder(View itemView) {
        super(itemView);
        personImageView = (ImageView) itemView.findViewById(R.id.imageView_PersonImage);
        personNameView = (TextView) itemView.findViewById(R.id.textView_PersonName);
        personAgeView = (TextView) itemView.findViewById(R.id.textView_PersonAge);
        personCommentView = (TextView) itemView.findViewById(R.id.textView_Comment);
        // itemView를 통해 person 을 찾음 (xml이랑 데이터만들기)
        // view가 넘어와 인플레이터가 따로 필요없당
    }

    public void setPerson(Person person){
        this.person = person;
        personImageView.setImageDrawable(person.getProfileImage());
        personNameView.setText(person.getName());
        personAgeView.setText(""+person.getAge());
        personCommentView.setText(person.getProfileComment());
    }
}



/*

인터페이스를 2개 등록하고

선택햇을시 물방울 효과를 만들기위해
드로워블 하나를 만들어준다. 리소스에

 */