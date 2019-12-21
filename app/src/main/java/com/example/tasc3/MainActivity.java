package com.example.tasc3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText semp,sdes,ssal,splc,scmpy,seml,smob;
Button button;
Model1 ob;
String temp,tdes,tsal,tplc,tcmpy,teml,tmob;
String e,d,s,p,c,emi,m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        semp=(EditText)findViewById(R.id.empname);
        sdes=(EditText)findViewById(R.id.desi);
        ssal=(EditText)findViewById(R.id.sal);
        splc=(EditText)findViewById(R.id.plce);
        scmpy=(EditText)findViewById(R.id.cmpnyname);
        seml =(EditText)findViewById(R.id.emil);
        smob=(EditText)findViewById(R.id.mob);
        button=(Button)findViewById(R.id.but);
        ob=new Model1();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp=semp.getText().toString().trim();
                tdes=sdes.getText().toString().trim();
                tsal=ssal.getText().toString().trim();
                tplc=splc.getText().toString().trim();
                tcmpy=scmpy.getText().toString().trim();
                teml=seml.getText().toString().trim();
                tmob=smob.getText().toString().trim();

                ob.setEmp(temp);
                ob.setDe(tdes);
                ob.setSa(tsal);
                ob.setPl(tplc);
                ob.setCmn(tcmpy);
                ob.setEm(teml);
                ob.setMo(tmob);

                e=ob.getEmp();
                d=ob.getDe();
                s=ob.getSa();
                p=ob.getPl();
                c=ob.getCmn();
                emi=ob.getEm();
                m=ob.getMo();
                Toast.makeText(getApplicationContext(),e+" "+d+" "+s+" "+p+" "+c+" "+emi+" "+m,Toast.LENGTH_SHORT).show();


            }
        });
    }
}
