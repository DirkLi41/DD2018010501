package tw.com.pcschool.dd2018010501;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3,tv4;
    EditText ed1;
    int choice = -1;
    int finalC = -1;
    boolean[] choice2 = new boolean[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.textView);
        tv2 = (TextView)findViewById(R.id.textView2);
        tv3 = (TextView)findViewById(R.id.textView3);
        tv4 = (TextView)findViewById(R.id.textView4);
    }
    public void click1(View v)
    {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
        builder1.setTitle("Surprise~");
        builder1.setMessage("Mother Fucker~");
        builder1.setPositiveButton("下一步", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "下面沒有了", Toast.LENGTH_SHORT).show();
            }
        });
        builder1.setNegativeButton("上一步", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "上面沒有了", Toast.LENGTH_SHORT).show();
            }
        });
        builder1.setNeutralButton("中立", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "中壢扭", Toast.LENGTH_SHORT).show();
            }
        });
        builder1.show();
    }
    public void click2(View v)
    {
        AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this);
        builder2.setTitle("請輸入資料");
        ed1 = new EditText(MainActivity.this);
        builder2.setView(ed1);
        ed1.setText(tv1.getText().toString());
        builder2.setPositiveButton("下一步", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "下面沒有了", Toast.LENGTH_SHORT).show();
                tv1.setText(ed1.getText().toString());
            }
        });
        builder2.setNegativeButton("上一步", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "上面沒有了", Toast.LENGTH_SHORT).show();
                tv1.setText("");
            }
        });
        builder2.setNeutralButton("中立", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "中壢扭", Toast.LENGTH_SHORT).show();
                tv1.setText("Wow~you can really DANCE!");
            }
        });
        builder2.show();
    }
    public void click3(View v)
    {
        AlertDialog.Builder builder3 = new AlertDialog.Builder(MainActivity.this);
        builder3.setTitle("水果列表");
        final String[] fruit = {"蘋果", "香蕉", "水蜜桃"};
        builder3.setItems(fruit, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, fruit[i], Toast.LENGTH_SHORT).show();
                tv2.setText(fruit[i]);
            }
        });
        builder3.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "881", Toast.LENGTH_SHORT).show();
            }
        });
        builder3.setCancelable(false);
        builder3.show();
    }
    public void click4(View v)
    {
        AlertDialog.Builder builder4 = new AlertDialog.Builder(MainActivity.this);
        builder4.setTitle("水果列表(單選)");
        final String[] fruit = {"蘋果", "香蕉", "水蜜桃"};
        finalC = choice;
        builder4.setSingleChoiceItems(fruit, choice, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finalC = i;
            }
        });
        builder4.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                choice = finalC;
                tv3.setText(fruit[choice]);
            }
        });
        builder4.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder4.show();
    }
    public void click5(View v)
    {
        AlertDialog.Builder builder5 = new AlertDialog.Builder(MainActivity.this);
        builder5.setTitle("水果列表(多選)");
        final String[] fruit = {"蘋果", "香蕉", "水蜜桃", "甘蔗", "梨子"};
        builder5.setMultiChoiceItems(fruit, choice2, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

            }
        });
        builder5.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int position) {
                StringBuilder sb = new StringBuilder();
                for(int i = 0;i <= 4;i++)
                {
                    if(choice2[i])
                    {
                        sb.append(fruit[i] + ",");
                    }
                    tv4.setText(sb.toString());
                }
            }
        });
        builder5.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder5.show();
    }
    public void click6(View v)
    {
        AlertDialog.Builder builder6 = new AlertDialog.Builder(MainActivity.this);
        builder6.setTitle("Surprise~");
        LayoutInflater inf1 = LayoutInflater.from(MainActivity.this);
        View v1 = inf1.inflate(R.layout.layout1, null);

        final TextView tv1 = (TextView) v1.findViewById(R.id.textView5);
        Button btn1 = (Button)v1.findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("Hello,World!");
            }
        });

        builder6.setView(v1);
        builder6.setPositiveButton("下一步", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "下面沒有了", Toast.LENGTH_SHORT).show();
            }
        });
        builder6.setNegativeButton("上一步", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "上面沒有了", Toast.LENGTH_SHORT).show();
            }
        });
        builder6.setNeutralButton("中立", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "中壢扭", Toast.LENGTH_SHORT).show();
            }
        });
        builder6.show();
    }
}
