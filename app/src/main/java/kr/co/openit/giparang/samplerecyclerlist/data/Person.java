package kr.co.openit.giparang.samplerecyclerlist.data;

import android.graphics.drawable.Drawable;

/**
 * Created by Tacademy on 2016-07-15.
 */
public class Person {
    private String name;
    private int age;
    private String profileComment;
    private Drawable profileImage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfileComment() {
        return profileComment;
    }

    public void setProfileComment(String profileComment) {
        this.profileComment = profileComment;
    }

    public Drawable getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Drawable profileImage) {
        this.profileImage = profileImage;
    }
}
