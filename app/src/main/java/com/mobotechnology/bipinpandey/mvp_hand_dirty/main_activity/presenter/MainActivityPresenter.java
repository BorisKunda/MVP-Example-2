package com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.presenter;

import android.util.Log;

import com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.model.User;

/**
 * Created by bpn on 11/30/17.
 *
 * 0. In MVP the presenter assumes the functionality of the "middle-man". All presentation logic is pushed to the presenter.
 * 1. Listens to user action and model updates
 * 2. Updates model and view
 */

public class MainActivityPresenter {

    private User user;
    private ViewInterface viewInterface;

    public MainActivityPresenter(ViewInterface view) {
        this.user = new User();
        this.viewInterface = view;
    }

    public void updateFullName(String fullName){
        Log.e("d","d" );
        user.setFullName(fullName);
        viewInterface.updateUserInfoTextView(user.toString());

    }

    public void updateEmail(String email){
        Log.e("d","d" );
        user.setEmail(email);
        viewInterface.updateUserInfoTextView(user.toString());

    }

    public interface ViewInterface{

        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();

    }
}
