package mx.itesm.acmjscb.metodosnumericos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {

    private View btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }
    public void irAGauss(View view){
        //Intent intent = new Intent(this,Gauss.class);
        Toast toast = Toast.makeText(this,"Voy a ir a gauss", Toast.LENGTH_LONG);
        toast.show();
        Intent intent = new Intent(this,ActGauss.class);
        startActivity(intent);

    }

    public void irAGaussJordan(View view){
        //Intent intent = new Intent(this,Gauss.class);
        Toast toast = Toast.makeText(this,"Voy a ir a gauss jordan", Toast.LENGTH_LONG);
        toast.show();
        Intent intent = new Intent(this,ActGaussJordan.class);
        startActivity(intent);

    }

    public void irACramer(View view){
        //Intent intent = new Intent(this,Gauss.class);
        Toast toast = Toast.makeText(this,"Voy a ir a cramer", Toast.LENGTH_LONG);
        toast.show();
        Intent intent = new Intent(this,ActCramer.class);
        startActivity(intent);

    }

    public void irAMatrizInversa(View view){
        Toast toast = Toast.makeText(this,"Voy a ir a matriz inversa", Toast.LENGTH_LONG);
        toast.show();
        //Intent intent = new Intent(this,ActGauss.class);
        //startActivity(intent);
        Intent intent = new Intent(this,ActMatrizInversa.class);
        startActivity(intent);

    }

    public void irAQuinto(View view){
        //Intent intent = new Intent(this,Gauss.class);
        //Toast toast = Toast.makeText(this,"Voy a ir a gauss", Toast.LENGTH_LONG);
        //toast.show();
        Intent intent = new Intent(this,ActGaussJordan.class);
        startActivity(intent);

    }
}
