package com.example.manne.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity2 extends AppCompatActivity {
    @BindView(R.id.firstName)
    TextView firstName;
    @BindView(R.id.lastName)
    TextView lastName;
    @BindView(R.id.age)
    TextView age;
    @BindView(R.id.pol)
    TextView pol;
    @BindView(R.id.buttonLoad)
    Button buttonLoad;
    String sex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonLoad)
    public void buttonLoad(View view){
//        firstName.setText(PreferencesManager.getFirstName(this));
//        lastName.setText(PreferencesManager.getLastname(this));
//        age.setText(PreferencesManager.getAge(this));
//        sex=(PreferencesManager.getPol(this));
//        if(sex.equals("M")){
//            pol.setText("Male");
//        }
//        else{
//            pol.setText("Female");
//        }
        //        pol.setText(PreferencesManager.getIsMale(this, true));

        User user = PreferencesManager.getUser(this);
        if(user!=null){
            firstName.setText(user.getFirstName());
            lastName.setText(user.getLastName());
            age.setText(user.getAge());
            boolean sex=user.isMale;
            if(sex){
                pol.setText("Male");
            }
            else{
                pol.setText("Female");
            }
        }

    }

}
