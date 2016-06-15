package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText etPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String previous = getIntent().getStringExtra("previous");
        etPrevious = (EditText) findViewById(R.id.etPrevious);
        etPrevious.setText(previous);


    }


    public void onSubmit(View v) {

        Intent data = new Intent();
        data.putExtra("newTask", etPrevious.getText().toString());


        int position = getIntent().getIntExtra("position", 5);
        data.putExtra("position", position);
        setResult(RESULT_OK, data);
        finish();
    }

}
