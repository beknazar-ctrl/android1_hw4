package com.example.android1_hw4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;


import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView consL;
    MainAdapter mainAdapter;
    ArrayList<ItemModel> list;
    Button button;
    EditText editTextFirst, editTextSecond;
    boolean notEmpty = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn1);
        editTextFirst = findViewById(R.id.eddt1);
        editTextSecond = findViewById(R.id.eddt2);
        consL = findViewById(R.id.recycler);
        mainAdapter = new MainAdapter();
        consL.setAdapter(mainAdapter);


        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        consL.setLayoutManager(manager);

        list = new ArrayList<>();

        editTextFirst.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        button.setBackgroundColor(Color.BLUE);

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        if (s.toString().isEmpty()) {
                            button.setBackgroundColor(Color.GRAY);
                            notEmpty = false;

                        } else {
                            notEmpty = true;
                            button.setEnabled(true);
                        }

                    }
                }
        );

        button.setOnClickListener(v -> {
            String firstEditValue = null;
            String secondEditValue = null;
            if (editTextFirst != null && editTextSecond != null) {
                firstEditValue = editTextFirst.getText().toString();
                secondEditValue = editTextSecond.getText().toString();
            }

            long currentInMillis = System.currentTimeMillis();
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyy");
            String formatDate = date.format(currentInMillis);
            if (!firstEditValue.equals("") && !secondEditValue.equals("")) {
                mainAdapter.addItem(new ItemModel(firstEditValue, secondEditValue, formatDate));
            }

        });
    }
}