package com.example.doctorsappointment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public
class MainActivity extends AppCompatActivity {

    EditText firstname, surname, age,date;
    DatabaseReference ApDB;
    Button            apBut, viewBut;

    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        firstname    = findViewById ( R.id.name );
        surname = findViewById ( R.id.surname );
        age     = findViewById ( R.id.age );
        date = findViewById ( R.id.date );

        apBut   = findViewById ( R.id.button );
        viewBut = findViewById ( R.id.button2 );


        ApDB = FirebaseDatabase.getInstance ( ).getReference ( ).child ( "user" );
        apBut.setOnClickListener ( v -> insertData ( ) );

        viewBut.setOnClickListener ( v -> {
            Intent intent = new Intent ( MainActivity.this , APList.class );
            startActivity ( intent );
        } );
    }

    private
    void insertData ( ) {

        String fname   = firstname.getText ( ).toString ( );
        String sname = surname.getText ( ).toString ( );
        String ag    = age.getText ( ).toString ( );
        String dat = date.getText ().toString ();

        user us = new user ( fname , sname , ag ,  dat);
        ApDB.push ( ).setValue ( us );
        Toast.makeText ( this , "DATA SUCCESSFULLY INSERTED" , Toast.LENGTH_SHORT ).show ( );


    }
}