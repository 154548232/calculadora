package com.example.calculadora2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    TextView buttonvista;


    float valor1, valor2;
    boolean suma, resta, multiplicacion, division;

    void assignId(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonvista = findViewById(R.id.buttonvista);

        valor1 = 0;
        valor2 = 0;
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;

    }

    public void sumar(View view) {
        if (buttonvista.getText().toString().equals("")) {
            buttonvista.setText("");
        } else {
            valor1 = Float.parseFloat(buttonvista.getText().toString());
            suma = true;
            buttonvista.setText("");
        }
    }

    public void restar(View view) {
        if (buttonvista.getText().toString().equals("")) {
            buttonvista.setText("");
        } else {
            valor1 = Float.parseFloat(buttonvista.getText().toString());
            resta = true;
            buttonvista.setText("");
        }
    }

    public void multiplicar(View view) {
        if (buttonvista.getText().toString().equals("")) {
            buttonvista.setText("");
        } else {
            valor1 = Float.parseFloat(buttonvista.getText().toString());
            multiplicacion = true;
            buttonvista.setText("");
        }
    }

    public void dividir(View view) {
        if (buttonvista.getText().toString().equals("")) {
            buttonvista.setText("");
        } else {
            valor1 = Float.parseFloat(buttonvista.getText().toString());
            division = true;
            buttonvista.setText("");
        }
    }

    public void resultadoigual(View view) {
        valor2 = Float.parseFloat(buttonvista.getText().toString());

        if (suma) {
            buttonvista.setText(String.valueOf(valor1 + valor2));
            suma = false;
        }

        if (resta) {
            buttonvista.setText(String.valueOf(valor1 - valor2));
            resta = false;
        }

        if (multiplicacion) {
            buttonvista.setText(String.valueOf(valor1 * valor2));
            multiplicacion = false;
        }

        if (division) {
            buttonvista.setText(String.valueOf(valor1 / valor2));
            division = false;
        }

    }

    public void limpiar(View view) {
        buttonvista.setText("");
    }

    public void borrar(View view) {
        String text = buttonvista.getText().toString(); buttonvista.setText(text.substring(0,text.length()-1));
    }


    public void punto(View view) {
        String str = buttonvista.getText().toString();
        if (str.contains(".")) {
            buttonvista.setText(str);
        } else {
            buttonvista.setText(str + ".");
        }
    }


    public void escribircero(View view) {

        buttonvista.setText(buttonvista.getText() + "0");
    }

    public void escribiruno(View view) {

        buttonvista.setText(buttonvista.getText() + "1");
    }

    public void escribirdos(View view) {

        buttonvista.setText(buttonvista.getText() + "2");
    }

    public void escribirtres(View view) {

        buttonvista.setText(buttonvista.getText() + "3");

    }

    public void escribircuatro(View view) {

        buttonvista.setText(buttonvista.getText() + "4");
    }
    public void escribircinco(View view) {

        buttonvista.setText(buttonvista.getText() + "5");
    }

    public void escribirseis(View view) {

        buttonvista.setText(buttonvista.getText() + "6");


    }

    public void escribirsiete(View view) {

        buttonvista.setText(buttonvista.getText() + "7");
    }
    public void escribirocho(View view) {

        buttonvista.setText(buttonvista.getText() + "8");
    }
    public void escribirnueve(View view) {

        buttonvista.setText(buttonvista.getText() + "9");
    }








}


