package com.example.emi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class caluculator extends AppCompatActivity {
    TextView t11,t12,t13,t14,t15;
    TextView t21,t22,t23,t24,t25;
    TextView t31,t32,t33,t34,t35;
    TextView t41,t42,t43,t44,t45;
    TextView t51,t52,t53,t54,t55;
    TextView t61,t62,t63,t64,t65;

    String s11,s12,s13,s14,s15;
    String s21,s22,s23,s24,s25;
    String s31,s32,s33,s34,s35;
    String s41,s42,s43,s44,s45;
    String s51,s52,s53,s54,s55;
    String s61,s62,s63,s64,s65;
    Button b1;
    TextView tv,month1,month2,month3,month4,month5,month6;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caluculator);
        t11=(TextView)findViewById(R.id.r11);t12=(TextView)findViewById(R.id.r12);t13=(TextView)findViewById(R.id.r13);
        t14=(TextView)findViewById(R.id.r14);t15=(TextView)findViewById(R.id.r15);
        t21=(TextView)findViewById(R.id.r21);t22=(TextView)findViewById(R.id.r22);t23=(TextView)findViewById(R.id.r23);
        t24=(TextView)findViewById(R.id.r24);t25=(TextView)findViewById(R.id.r25);
        t31=(TextView)findViewById(R.id.r31);t32=(TextView)findViewById(R.id.r32);t33=(TextView)findViewById(R.id.r33);
        t34=(TextView)findViewById(R.id.r34);t35=(TextView)findViewById(R.id.r35);
        t41=(TextView)findViewById(R.id.r41);t42=(TextView)findViewById(R.id.r42);t43=(TextView)findViewById(R.id.r43);
        t44=(TextView)findViewById(R.id.r44);t45=(TextView)findViewById(R.id.r45);
        t51=(TextView)findViewById(R.id.r51);t52=(TextView)findViewById(R.id.r52);t53=(TextView)findViewById(R.id.r53);
        t54=(TextView)findViewById(R.id.r54);t55=(TextView)findViewById(R.id.r55);
        t61=(TextView)findViewById(R.id.r61);t62=(TextView)findViewById(R.id.r62);t63=(TextView)findViewById(R.id.r63);
        t64=(TextView)findViewById(R.id.r64);t65=(TextView)findViewById(R.id.r65);
        b1=(Button)findViewById(R.id.button2);tv=(TextView)findViewById(R.id.textView);
        month1=(TextView)findViewById(R.id.tv1);month2=(TextView)findViewById(R.id.tv2);month3=(TextView)findViewById(R.id.tv3);
        month4=(TextView)findViewById(R.id.tv4);month5=(TextView)findViewById(R.id.tv5);month6=(TextView)findViewById(R.id.tv6);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        s11=t11.getText().toString().replace(",","");s12=t12.getText().toString().replace(",","");s13=t13.getText().toString().replace(",","");
        s14=t14.getText().toString().replace(",","");s15=t15.getText().toString().replace(",","");
        s21=t21.getText().toString().replace(",","");s22=t22.getText().toString().replace(",","");s23=t23.getText().toString().replace(",","");
        s24=t24.getText().toString().replace(",","");s25=t25.getText().toString().replace(",","");
        s31=t31.getText().toString().replace(",","");s32=t32.getText().toString().replace(",","");s33=t33.getText().toString().replace(",","");
        s34=t34.getText().toString().replace(",","");s35=t35.getText().toString().replace(",","");
        s41=t41.getText().toString().replace(",","");s42=t42.getText().toString().replace(",","");s43=t43.getText().toString().replace(",","");
        s44=t44.getText().toString().replace(",","");s45=t45.getText().toString().replace(",","");
        s51=t51.getText().toString().replace(",","");s52=t52.getText().toString().replace(",","");s53=t53.getText().toString().replace(",","");
        s54=t54.getText().toString().replace(",","");s55=t55.getText().toString().replace(",","");
       s61=t61.getText().toString().replace(",","");s62=t62.getText().toString().replace(",","");s63=t63.getText().toString().replace(",","");
        s64=t64.getText().toString().replace(",","");s65=t65.getText().toString().replace(",","");


        double m1=avgmonth(s11,s12,s13,s14,s15);
        double m2=avgmonth(s21,s22,s23,s24,s25);
        double m3=avgmonth(s31,s32,s33,s34,s35);
        double m4=avgmonth(s41,s42,s43,s44,s45);
        double m5=avgmonth(s51,s52,s53,s54,s55);
        double m6=avgmonth(s61,s62,s63,s64,s65);
        String s1="Month 1 AQB :"+String.format("%2f",m1);String s2="Month 2 AQB :"+String.format("%2f",m2);String s3="Month 3 AQB :"+String.format("%2f",m3);String s4="Month 4 AQB :"+String.format("%2f",m4);String s5="Month 5 AQB :"+String.format("%2f",m5);String s6= "Month 6 AQB :"+String.format("%2f",m6);
        month1.setText(s1);month2.setText(s2);month3.setText(s3);
        month4.setText(s4);month5.setText(s5);month6.setText(s6);
       Double result= AQB(m1,m2,m3,m4,m5,m6);
       String res="AQB is :"+String.format("%2f",result);
       tv.setText(res);



    }
});

    }
    public double avgmonth(String a1,String a2,String a3,String a4,String a5){
        double i1,i2,i3,i4,i5;
        int count=5;
        double avg;
        double sum;
        sum=0.0;
        if(TextUtils.isEmpty(a1)){a1="0.0";}if(TextUtils.isEmpty(a2)){a2="0.0";}if(TextUtils.isEmpty(a3)){a3="0.0";}
        if(TextUtils.isEmpty(a4)){a4="0.0";}if(TextUtils.isEmpty(a5)){a5="0.0";}
        i1=Double.parseDouble(a1);i2=Double.parseDouble(a2);i3=Double.parseDouble(a3);
        i4=Double.parseDouble(a4);i5=Double.parseDouble(a5);
        if(i1==0.0){count=count-1;}if(i2==0.0){count=count-1;}if(i3==0.0){count=count-1;}
        if(i4==0.0){count=count-1;}if(i5==0.0){count=count-1;}

        if(count==0){ avg=0.0;
        }else{
            sum=i1+i2+i3+i4+i5;

            avg=sum/count;




        }
 return avg;
    }
    public double AQB(Double a1,Double a2,Double a3,Double a4,Double a5,Double a6){

        int count=6;
        double avg;
        double sum;
        sum=0.0;
        if(a1==0.0){count=count-1;}if(a2==0.0){count=count-1;}if(a3==0.0){count=count-1;}
        if(a4==0.0){count=count-1;}if(a5==0.0){count=count-1;}if(a6==0.0){count=count-1;}

        if(count==0){ avg=0.0;
        }else{
            sum=a1+a2+a3+a4+a5+a6;

            avg=sum/count;




        }
        return avg;
    }


}