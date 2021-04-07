package com.example.study4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    int iClass1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタン
        Button button = findViewById(R.id.button1);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // Hello World!って書いてるテキスト
        TextView textView = findViewById(R.id.textView1);
        //入力値
        int iInputnum;
        String string2 ="";



        //　入力値
        EditText editText = findViewById(R.id.editText1);
        SpannableStringBuilder sb = (SpannableStringBuilder)editText.getText();
        String string1 = sb.toString();
        iInputnum = Integer.parseInt(string1);

        SampleA miyawaki = new SampleA(iInputnum); //sampleA()は非表示のメソッド

        string2 = miyawaki.MakeString();

     //   string2 = "Number:" + String.valueOf(iInputnum);

        // string1をテキストを設定して表示
        textView.setText(string2);
    }
}