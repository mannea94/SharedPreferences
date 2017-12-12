package com.example.manne.sharedpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.firstName)
    EditText firstName;
    @BindView(R.id.lastName)
    EditText lastName;
    @BindView(R.id.age)
    EditText age;
    @BindView(R.id.radioGroup)
    RadioGroup radioGroup;
    @BindView(R.id.radioM)
    RadioButton radioM;
    @BindView(R.id.radioF)
    RadioButton radioF;
    @BindView(R.id.buttonSaveUser)
    Button buttonSave;
    @BindView(R.id.buttonContinue)
    Button buttonContinue;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.buttonSaveUser)
    public void onClickSave(){
//        PreferencesManager.setFirstName(this, firstName.getText().toString());
//        PreferencesManager.setLastName(this, lastName.getText().toString());
//        PreferencesManager.setAge(this, age.getText().toString());
//        if(radioM.isChecked()){
//            PreferencesManager.setPol(this, radioM.getText().toString());
//        }
//        if(radioF.isChecked()){
//            PreferencesManager.setPol(this, radioF.getText().toString());
//        }

        //        PreferencesManager.setIsMale(this, radioF.isChecked());


        user=new User();
        if(user!=null) {
            user.setAge(age.getText().toString());
            user.setFirstName(firstName.getText().toString());
            user.setLastName(lastName.getText().toString());
            if(radioM.isChecked()){
                user.setMale(true);
            }
            else{
                user.setMale(false);
            }
        }
        PreferencesManager.addUser(user, this);



        Toast.makeText(this, "User Details Saved", Toast.LENGTH_SHORT).show();
    }



    @OnClick(R.id.buttonContinue)
    public void onClickContinue(View view){
        startActivity(new Intent(MainActivity.this, MainActivity2.class));
    }

}
