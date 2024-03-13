package com.example.stats3x3proba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Activity3 extends AppCompatActivity {

    public void upisiIgrace (TextView[] txtImena, Igrac[] igraci){
        for (int i = 0; i < igraci.length; i++) {
            txtImena[i].setText(igraci[i].getIme());
        }
    }

    public void upisiSutZa1 (TextView[] txtSutZa1, Igrac[] igraci) {
        for (int i = 0; i < igraci.length; i++) {
            txtSutZa1[i].setText(igraci[i].getPogodio1() + " / " + (igraci[i].getPogodio1() + igraci[i].getPromasio1()));
        }
    }

    public void upisiSutZa2 (TextView[] txtSutZa2, Igrac[] igraci) {
        for (int i = 0; i < igraci.length; i++) {
            txtSutZa2[i].setText(igraci[i].getPogodio2() + " / " + (igraci[i].getPogodio2() + igraci[i].getPromasio2()));
        }
    }

    public void upisiAsist (TextView[] txtAsist, Igrac[] igraci){
        for (int i = 0; i < igraci.length; i++) {
            txtAsist[i].setText(""+ igraci[i].getAsistencije());
        }
    }

    public void upisiSkok (TextView[] txtSkok, Igrac[] igraci){
        for (int i = 0; i < igraci.length; i++) {
            txtSkok[i].setText("" + igraci[i].getSkokovi());
        }
    }

    public void upisiPoene (TextView[] txtPoeni, Igrac[] igraci){
        for (int i = 0; i < igraci.length; i++) {
            txtPoeni[i].setText("" + igraci[i].getPoeni());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Intent intent = getIntent();
        Igrac igrac1 = intent.getParcelableExtra("igrac1");
        Igrac igrac2 = intent.getParcelableExtra("igrac2");
        Igrac igrac3 = intent.getParcelableExtra("igrac3");
        Igrac igrac4 = intent.getParcelableExtra("igrac4");
        Igrac igrac5 = intent.getParcelableExtra("igrac5");
        Igrac igrac6 = intent.getParcelableExtra("igrac6");

        Igrac igraci[] = {igrac1, igrac2, igrac3, igrac4, igrac5, igrac6};

        // INIT TEXT VIeW

        TextView txtPoeniPrvogTima = findViewById(R.id.txtPoeniPrvogTima);
        TextView txtPoeniDrugogTima = findViewById(R.id.txtPoeniDrugogTima);

        txtPoeniPrvogTima.setText("" + (igrac1.getPoeni() + igrac2.getPoeni() + igrac3.getPoeni()));
        txtPoeniDrugogTima.setText("" + (igrac4.getPoeni() + igrac5.getPoeni() + igrac6.getPoeni()));


        TextView txtIme1 = findViewById(R.id.txtIme1);
        TextView txtIme2 = findViewById(R.id.txtIme2);
        TextView txtIme3 = findViewById(R.id.txtIme3);
        TextView txtIme4 = findViewById(R.id.txtIme4);
        TextView txtIme5 = findViewById(R.id.txtIme5);
        TextView txtIme6 = findViewById(R.id.txtIme6);

        TextView txtImena[] = {txtIme1, txtIme2, txtIme3, txtIme4, txtIme5, txtIme6};

        TextView txtIgrac1SutZa1 = findViewById(R.id.txtigrac1sutZa1);
        TextView txtIgrac2SutZa1 = findViewById(R.id.txtigrac2sutZa1);
        TextView txtIgrac3SutZa1 = findViewById(R.id.txtigrac3sutZa1);
        TextView txtIgrac4SutZa1 = findViewById(R.id.txtigrac4sutZa1);
        TextView txtIgrac5SutZa1 = findViewById(R.id.txtigrac5sutZa1);
        TextView txtIgrac6SutZa1 = findViewById(R.id.txtigrac6sutZa1);

        TextView txtIgraciSutZa1[] = {txtIgrac1SutZa1, txtIgrac2SutZa1, txtIgrac3SutZa1, txtIgrac4SutZa1, txtIgrac5SutZa1, txtIgrac6SutZa1};

        TextView txtIgrac1SutZa2 = findViewById(R.id.txtIgrac1sutZa2);
        TextView txtIgrac2SutZa2 = findViewById(R.id.txtIgrac2sutZa2);
        TextView txtIgrac3SutZa2 = findViewById(R.id.txtIgrac3sutZa2);
        TextView txtIgrac4SutZa2 = findViewById(R.id.txtIgrac4sutZa2);
        TextView txtIgrac5SutZa2 = findViewById(R.id.txtIgrac5sutZa2);
        TextView txtIgrac6SutZa2 = findViewById(R.id.txtIgrac6sutZa2);

        TextView txtIgraciSutZa2[] = {txtIgrac1SutZa2, txtIgrac2SutZa2, txtIgrac3SutZa2, txtIgrac4SutZa2, txtIgrac5SutZa2, txtIgrac6SutZa2};

        TextView txtIgrac1Asist = findViewById(R.id.txtIgrac1Asist);
        TextView txtIgrac2Asist = findViewById(R.id.txtIgrac2Asist);
        TextView txtIgrac3Asist = findViewById(R.id.txtIgrac3Asist);
        TextView txtIgrac4Asist = findViewById(R.id.txtIgrac4Asist);
        TextView txtIgrac5Asist = findViewById(R.id.txtIgrac5Asist);
        TextView txtIgrac6Asist = findViewById(R.id.txtIgrac6Asist);

        TextView txtIgraciAsist[] = {txtIgrac1Asist, txtIgrac2Asist, txtIgrac3Asist, txtIgrac4Asist, txtIgrac5Asist, txtIgrac6Asist};

        TextView txtIgrac1Skok = findViewById(R.id.txtIgrac1Skok);
        TextView txtIgrac2Skok = findViewById(R.id.txtIgrac2Skok);
        TextView txtIgrac3Skok = findViewById(R.id.txtIgrac3Skok);
        TextView txtIgrac4Skok = findViewById(R.id.txtIgrac4Skok);
        TextView txtIgrac5Skok = findViewById(R.id.txtIgrac5Skok);
        TextView txtIgrac6Skok = findViewById(R.id.txtIgrac6Skok);

        TextView txtIgaraciSkok[] = {txtIgrac1Skok, txtIgrac2Skok, txtIgrac3Skok, txtIgrac4Skok, txtIgrac5Skok,txtIgrac6Skok};

        TextView txtIgrac1Poeni = findViewById(R.id.txtIgrac1Poeni);
        TextView txtIgrac2Poeni = findViewById(R.id.txtIgrac2Poeni);
        TextView txtIgrac3Poeni = findViewById(R.id.txtIgrac3Poeni);
        TextView txtIgrac4Poeni = findViewById(R.id.txtIgrac4Poeni);
        TextView txtIgrac5Poeni = findViewById(R.id.txtIgrac5Poeni);
        TextView txtIgrac6Poeni = findViewById(R.id.txtIgrac6Poeni);

        TextView txtIGraciPoeni[] = {txtIgrac1Poeni, txtIgrac2Poeni, txtIgrac3Poeni, txtIgrac4Poeni, txtIgrac5Poeni, txtIgrac6Poeni};

        // UPIS PODATAKA
        upisiIgrace(txtImena, igraci);
        upisiSutZa1(txtIgraciSutZa1, igraci);
        upisiSutZa2(txtIgraciSutZa2, igraci);
        upisiAsist(txtIgraciAsist, igraci);
        upisiSkok(txtIgaraciSkok, igraci);
        upisiPoene(txtIGraciPoeni, igraci);

        Button btn = findViewById(R.id.btnVratiNaPocetak);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity3.this, MainActivity.class));
            }
        });


    }
}