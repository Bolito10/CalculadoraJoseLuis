package com.example.calculadorajoseluis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;


import static com.example.calculadorajoseluis.R.id.numero1;


public class MainActivity extends AppCompatActivity {

    TextView te1 ;
    String valor="", valor1="", valor2="";
    Integer operacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        te1=findViewById(numero1);




    }
    public  void ce(View view){
        te1.setText("0");
        valor = "";
    }

    public  void cero(View view){
        te1.setText(valor+"0");
        valor = valor + "0";
    }
    public  void punto(View view){
        te1.setText(valor+".");
        valor = valor + ".";
    }
    public  void uno(View view){
        te1.setText(valor+"1");
        valor = valor + "1";
    }
    public  void dos(View view){
        te1.setText(valor+"2");
        valor=valor+"2";
    }
    public  void tres(View view){
        te1.setText(valor+"3");
        valor=valor+"3";
    }
    public  void cuatro(View view){
        te1.setText(valor+"4");
        valor=valor+"4";
    }
    public  void cinco(View view){
        te1.setText(valor+"5");
        valor=valor+"5";
    }
    public  void seis(View view){
        te1.setText(valor+"6");
        valor=valor+"6";
    }
    public  void siete(View view){
        te1.setText(valor+"7");
        valor=valor+"7";
    }
    public  void ocho(View view){
        te1.setText(valor+"8");
        valor=valor+"8";
    }
    public void  nueve(View view){
        te1.setText(valor+"9");
        valor=valor+"9";
    }

    public  void suma(View view){
        operacion = 1;
        valor1=valor;
        valor="";

    }

    public  void resta(View view){
        operacion = 2;
        valor1=valor;
        valor="";
    }
    public  void multiplica(View view){
        operacion = 3;
        valor1=valor;
        valor="";
    }
    public  void divide(View view){
        operacion = 4;
        valor1=valor;
        valor="";
    }
    public  void igual(View view){
        /*
        int numEntero1 = Integer.parseInt(valor1);
        int numEntero2 = Integer.parseInt(valor);
        */
        float numEntero1 = Float.parseFloat(valor1);
        float numEntero2 = Float.parseFloat(valor);


        if ((numEntero1==0 && numEntero2 ==0 ) || (operacion < 1 || operacion > 4 ))
        {

            te1.setText("0");
        }


        if (operacion==1)
        {
            String valor= numEntero1+numEntero2+"";
            te1.setText(valor);
        }
        else
        {
            if(operacion==2)
            {
                String valor= numEntero1-numEntero2+"";
                te1.setText(valor);
            }
            else
            {
                if(operacion==3)
                {
                    String valor= numEntero1*numEntero2+"";
                    te1.setText(valor);
                }
                else
                {
                    if(operacion==4)
                    {
                        String valor= numEntero1/numEntero2+"";
                        te1.setText(valor);
                    }
                    else
                    {
                        te1.setText("0");
                    }

                }
            }
        }
        valor=te1.getText().toString();
    }


    /*
    int valor=numEntero1+numEntero2;
      te2.setVisibility(View.VISIBLE);
      te1.setVisibility(View.GONE);
    */

}