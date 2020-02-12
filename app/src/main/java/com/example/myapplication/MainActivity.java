package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        Button btn1,btn2,btn3,btnadd,btn4,btn5,btn6,btnsub,btn7,btn8,btn9,btnmul,btndot,btnzero,btnequal,btndiv,btnclr;
        TextView textView;
        EditText editText;
        Float result1,result2;
        boolean Add,Sub,Mul,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
         textView=(TextView)findViewById(R.id.editText);
         editText=(EditText)findViewById(R.id.editText);
         btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btnadd=(Button)findViewById(R.id.btnAdd);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btnsub=(Button)findViewById(R.id.btnSub);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnmul=(Button)findViewById(R.id.btnMul);
        btndot=(Button)findViewById(R.id.btnDot);
        btnzero=(Button)findViewById(R.id.btnzero);
        btnequal=(Button)findViewById(R.id.btnEqual);
        btndiv=(Button)findViewById(R.id.btnDiv);
        btnclr=(Button)findViewById(R.id.btnClr);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"9");
            }
        });
        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText(" ");
                }
                else{
                    result1=Float.parseFloat(editText.getText()+" ");
                    Add=true;
                    editText.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText(" ");
                }
                else{
                    result1=Float.parseFloat(editText.getText()+" ");
                    Sub=true;
                    editText.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText(" ");
                }
                else{
                    result1=Float.parseFloat(editText.getText()+" ");
                    Mul=true;
                    editText.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText(" ");
                }
                else{
                    result1=Float.parseFloat(editText.getText()+" ");
                    Div=true;
                    editText.setText(null);
                }
            }
        });
       btnequal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               result2=Float.parseFloat(editText.getText()+" ");
               if(Add==true){
                   editText.setText(result1+result2+" ");
                   Add=false;
               }
               if(Sub==true){
                   editText.setText(result1+result2+" ");
                   Sub=false;
               }
               if(Mul==true){
                   editText.setText(result1+result2+" ");
                   Mul=false;
               }
               if(Div==true){
                   editText.setText(result1+result2+" ");
                   Div=false;
               }
           }
       });
       btnclr.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               editText.setText(" ");
           }
       });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        getSupportActionBar().setTitle("Simple Calculator");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
