package com.example.wilko98.androidhints.ui;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wilko98.androidhints.R;
import com.example.wilko98.androidhints.common.SingleFragmentActivity;

public class ContainerActivity extends SingleFragmentActivity {

    @Override
    protected Fragment getFragment() {
        return TopicsFragment.newInstance();
    }
}
