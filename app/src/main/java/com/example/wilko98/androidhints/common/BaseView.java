package com.example.wilko98.androidhints.common;

import com.arellomobile.mvp.MvpView;

/**
 * Created by Vladislav Falzan.
 */

public interface BaseView extends MvpView {

    void showRefresh();

    void hideRefresh();

    void showError();
}
