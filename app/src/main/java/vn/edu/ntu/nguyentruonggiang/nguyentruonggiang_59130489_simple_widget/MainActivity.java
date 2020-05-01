package vn.edu.ntu.nguyentruonggiang.nguyentruonggiang_59130489_simple_widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText tenten, dayday,txtthemthem;
    RadioGroup rdgsexsex;
    Button nutxacnhan;
    RadioButton rdbnam, rdbnu;
    CheckBox nutxemphim, nutnghenhac, nutcafe, nutAlone, nutnauan;
        //ghide
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addview();
        addEven();
    }


    private void addview(){
        tenten = findViewById(R.id.txtten);
        dayday = findViewById(R.id.dayday);
        rdbnu = findViewById(R.id.rdbgioitinhnu);
        nutxemphim= findViewById(R.id.nutxemphim);
        txtthemthem = findViewById(R.id.txtsothichkhac);
        nutcafe = findViewById(R.id.nutcafe);
        nutnauan = findViewById(R.id.bntcook);
        nutAlone = findViewById(R.id.bntamotminh);
        rdgsexsex = findViewById(R.id.rdggioitinh);
        nutxacnhan = findViewById(R.id.bntxacnhan);
        rdbnam = findViewById(R.id.rdbgioitinhnam);
        nutnghenhac = findViewById(R.id.nutnghenhac);

    }
    private  void addEven(){
        nutxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
    }
    private void show(){
        int sex = this.rdgsexsex.getCheckedRadioButtonId();
        String name = tenten.getText().toString().trim();
        String date = dayday.getText().toString().trim();
        RadioButton rdgsex = this.findViewById(sex);
        String ffff = "";
        if(nutxemphim.isChecked()){
            if (ffff.length()>0)
            {
                ffff += ",";
            }
            ffff += "Xem Phim";
        }
        if( nutnghenhac.isChecked()){
            if (ffff.length()>0){
                ffff+= ",";
            }
            ffff += "Nghe Nhạc";
        }
        if(nutcafe.isChecked()){
            if (ffff.length()>0){
                ffff+= ",";
            }
            ffff += "Đi cafe với bạn";
        }
        if(nutAlone.isChecked()){
            if (ffff.length()>0){
                ffff+= ",";
            }
            ffff += "Ở nhà một mình";
        }
        if(nutnauan.isChecked()){
            if (ffff.length()>0){
                ffff+= ",";
            }
            ffff += "Vào Bếp Nấu Ăn";
        }
        ffff +=",";
        ffff += txtthemthem.getText().toString().trim();
        String xuat = name + "\nNgày Sinh : " + date + "\nGiới Tính : " + rdgsex.getText() + "\nSở Thích : " + ffff ;
        Toast.makeText(getApplicationContext(), xuat, Toast.LENGTH_SHORT).show();
    }

}
