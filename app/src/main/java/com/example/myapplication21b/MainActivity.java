package com.example.myapplication21b;


import android.app.ActionBar;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import java.sql.SQLException;
import java.util.ArrayList;

import static android.view.Gravity.*;



public class MainActivity extends AppCompatActivity {


    TableLayout table_layout;
    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        table_layout = (TableLayout) findViewById(R.id.TableLayout);
        BuildTable();

    }

    private void BuildTable() {
        ArrayList<person> mCur=new ArrayList<>();
        ArrayList<TextView> felter=new ArrayList<>();
        person p=new person("1","Anne");
        person p1=new person("2","Bent");
        person p2=new person("3","Carl");
        person p3=new person("4","Dan");
        person p4=new person("5","Emma");
        person p5=new person("6","Frederik");
        mCur.add(p); mCur.add(p1); mCur.add(p2);mCur.add(p3);mCur.add(p4);mCur.add(p5);
        TableRow.LayoutParams lparams = new TableRow.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT);
        int rows = mCur.size();
        int cols =2;
        // outer for loop
        for (int i = 0; i < rows; i++) {

            TableRow row = new TableRow(this);
            //   row.setLayoutParams(new TableLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
            row.setLayoutParams(new TableLayout.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            row.setGravity(CENTER);
            row.setMinimumHeight(300);
            row.setBackgroundResource(R.drawable.table_row_bg);


            // inner for loop
            for (int j = 0; j < cols; j++) {

                TextView tv = new TextView(this);
                tv.setGravity(CENTER);
                tv.setBackgroundResource(R.drawable.table_cell_bg);
                tv.setTextSize(18);

                if(j==0)
                    tv.setText(mCur.get(i).getNr());
                else
                    tv.setText(mCur.get(i).getNavn());
                row.addView(tv);

            }
            table_layout.addView(row);
        }

    }
}