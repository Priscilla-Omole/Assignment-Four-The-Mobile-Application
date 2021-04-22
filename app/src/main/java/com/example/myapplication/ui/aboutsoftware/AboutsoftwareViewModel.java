package com.example.myapplication.ui.aboutsoftware;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutsoftwareViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AboutsoftwareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Faac allocation\n" +
                "This is an act to prescribe the basis for distribution of revenue accruing to the Federation Account between the Federal and State Governments and Local Government Councils in the States; the formula for distribution amongst the states. This is the proportion of the total revenue of each state to be contributed to the state joint local government account.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}