package com.example.myapplication.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("NAME: Omole Priscilla Obaloluwa\n"+
                "MATRIC NO: 17CJ022537\n" +
                "COURSE: CEN 414\n");
    }

    public LiveData<String> getText() {
        return mText;
    }
}