package com.dagger.example.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dagger.example.R;
import com.dagger.example.data.Person;
import com.dagger.example.data.Role;
import com.dagger.example.presenter.MainPresenter;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Inject
    MainPresenter presenter;

    @Inject
    Person person;

    @Inject
    Role role;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);

        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.text);
        tv.setText("Presenter : " + presenter + "\n Person : " + person.toString() + "\n Role : " + role.toString());
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onClick();
            }
        });
    }

}
