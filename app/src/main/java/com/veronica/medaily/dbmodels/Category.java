package com.veronica.medaily.dbmodels;

import android.os.Parcel;
import android.os.Parcelable;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Veronica on 10/8/2016.
 */
public class Category extends SugarRecord implements Parcelable {

    User user;
    String name;
    String description;
    int color;


    List<Note> getNotes() {
        return Note.find(Note.class, "category = ?",String.valueOf(getId()));
    }

    public Category(){

    }

    public Category(User user, String title,String description,int color) {
        this.user = user;
        this.name = title;
        this.description = description;
        this.color = color;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    protected Category(Parcel in) {
        user = (User) in.readValue(User.class.getClassLoader());
        name = in.readString();
        description = in.readString();
        color = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(user);
        dest.writeString(name);
        dest.writeInt(color);
        dest.writeString(description);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Category> CREATOR = new Parcelable.Creator<Category>() {
        @Override
        public Category createFromParcel(Parcel in) {
            return new Category(in);
        }

        @Override
        public Category[] newArray(int size) {
            return new Category[size];
        }
    };
}