package com.example.kartik.cblistvewcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Teacher> teacherList = Teacher.getTeacherdetails();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        MyCustomAdapter adapter = new MyCustomAdapter();
        listView.setAdapter(adapter);
    }

    public class MyCustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return teacherList.size();
        }

        @Override
        public Teacher getItem(int position) {
            return teacherList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View teacherItemView = getLayoutInflater().inflate(R.layout.list_item_teacher,parent,false);
            TextView teacherName = teacherItemView.findViewById(R.id.teacher_name);
            TextView teacherCourse = teacherItemView.findViewById(R.id.teacher_course);
            teacherName.setText(getItem(position).getName());
            teacherCourse.setText(getItem(position).getCourse());

            return teacherItemView;
        }
    }
}
