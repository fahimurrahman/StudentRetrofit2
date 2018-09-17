package com.hod.fahim.studentretrofit2.Service;

import com.hod.fahim.studentretrofit2.response.StudentResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StudentService {

    @GET("newConnection/newconnection.php")
    Call<List<StudentResponse>> getAllStudent();
}
