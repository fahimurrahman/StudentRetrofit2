package com.hod.fahim.studentretrofit2;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.hod.fahim.studentretrofit2.response.StudentResponse;
import com.squareup.picasso.Picasso;

public class StudentDetails extends AppCompatActivity {

    protected TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        ImageView imageView = findViewById(R.id.stu_imageView);
        textView = findViewById(R.id.stu_textView);

        StudentResponse studentResponse = (StudentResponse) getIntent().getSerializableExtra("Student");

        String photoString = studentResponse.getImages();
        Uri photoUri = Uri.parse(MainActivity.BASE_URL+"newImagess/"+photoString);
        Picasso.get().load(photoUri).into(imageView);

        textView.setText(studentResponse.getName()+"\n"+studentResponse.getAddress()+"\n"+studentResponse.getPhone());

    }
}
