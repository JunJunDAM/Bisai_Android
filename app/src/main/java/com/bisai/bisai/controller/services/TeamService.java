package com.bisai.bisai.controller.services;

import com.bisai.bisai.model.Equipo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by DAM on 3/5/17.
 */

public interface TeamService {

    @GET("/api/teams")
    Call<List<Equipo>> getAllTeams(
            @Header("Authorization") String Authorization
    );

    @POST("api/teams")
    Call<Equipo> createTeam(
            @Header("Authorization") String Authorization,
            @Body Equipo equipo
    );

    @PUT("api/teams")
    Call<Equipo> updateUsers(
            @Header("Autorization") String Authorization,
            @Body Equipo equipo
    );
}
