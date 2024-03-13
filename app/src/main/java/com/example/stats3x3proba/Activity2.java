package com.example.stats3x3proba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;

public class Activity2 extends AppCompatActivity {


    // PREKIDAČI ZA IGRAČE
        boolean[] aktivanIgrac = {false, false, false, false, false, false};

        int poeniPrvogTima = 0;
        int poeniDrugogTima = 0;

    public void porukaNeaktivniIgraci () {
        Toast.makeText(this, "Klikni na igrača", Toast.LENGTH_SHORT);
    }

    public void dodajPoene (Igrac igrac, int koliko) {
        igrac.setPoeni(igrac.getPoeni() + koliko);
    }

    public void dodajPromasaj  (Igrac igrac, int sutZa) {
        if (sutZa == 1) {
            igrac.setPromasio1(igrac.getPromasio1() + 1);
            Toast.makeText(this, igrac.getIme() + " promasio za 1", Toast.LENGTH_SHORT).show();
        }
        else {
            igrac.setPromasio2(igrac.getPromasio2() + 1);
            Toast.makeText(this, igrac.getIme() + " promasio za 2", Toast.LENGTH_SHORT).show();
        }
    }

    public void dodajPogodak  (Igrac igrac, int sutZa) {
        if (sutZa == 1) {
            igrac.setPogodio1(igrac.getPogodio1() + 1);
            Toast.makeText(this, igrac.getIme() + " pogodio za 1", Toast.LENGTH_SHORT).show();
        }
        else {
            igrac.setPogodio2(igrac.getPromasio2() + 1);
            Toast.makeText(this, igrac.getIme() + " pogodio za 2", Toast.LENGTH_SHORT).show();
        }
    }
    public void dodajAsist (Igrac igrac) {
        igrac.setAsistencije(igrac.getAsistencije() + 1);
        Toast.makeText(this, igrac.getIme() + " upisao asistenciju", Toast.LENGTH_SHORT).show();
    }

    public void dodajSkok (Igrac igrac) {
        igrac.setSkokovi(igrac.getAsistencije() + 1);
        Toast.makeText(this, igrac.getIme() + " upisao skok", Toast.LENGTH_SHORT).show();
    }

    public void dodajPoeneTimu (int tim, int brojPoena, TextView txtPoeniTima) {
        if (tim == 1) {
            if (brojPoena == 1) {
                poeniPrvogTima += 1;
            } else {
                poeniPrvogTima += 2;
            }
            txtPoeniTima.setText("" +poeniPrvogTima);
        } else {
            if (brojPoena == 1) {
                poeniDrugogTima += 1;
            } else {
                poeniDrugogTima += 2;
            }
            txtPoeniTima.setText("" + poeniDrugogTima);
        }

    }

    public void aktivirajIgraca (int brojIgraca, TextView[] txtImena) {
       for (int i = 0; i < aktivanIgrac.length; i++) {
           if (i == brojIgraca - 1) {
               aktivanIgrac[i] = true;
               txtImena[i].setTextColor(Color.BLUE);
           } else {
               aktivanIgrac[i] = false;
               txtImena[i].setTextColor(Color.BLACK);
           }
       }
    }


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_2);

            Intent intent = getIntent();

            // prenos vrijednosti iz prve aktivnosti
            String ime1 = intent.getStringExtra(MainActivity.EXTRA_IME1);
            String ime2 = intent.getStringExtra(MainActivity.EXTRA_IME2);
            String ime3 = intent.getStringExtra(MainActivity.EXTRA_IME3);
            String ime4 = intent.getStringExtra(MainActivity.EXTRA_IME4);
            String ime5 = intent.getStringExtra(MainActivity.EXTRA_IME5);
            String ime6 = intent.getStringExtra(MainActivity.EXTRA_IME6);

            TextView txtIme1 = findViewById(R.id.txtIme1);
            TextView txtIme2 = findViewById(R.id.txtIme2);
            TextView txtIme3 = findViewById(R.id.txtIme3);
            TextView txtIme4 = findViewById(R.id.txtIme4);
            TextView txtIme5 = findViewById(R.id.txtIme5);
            TextView txtIme6 = findViewById(R.id.txtIme6);

            TextView txtImena[] = {txtIme1, txtIme2, txtIme3, txtIme4, txtIme5, txtIme6};

            txtIme1.setText(ime1);
            txtIme2.setText(ime2);
            txtIme3.setText(ime3);
            txtIme4.setText(ime4);
            txtIme5.setText(ime5);
            txtIme6.setText(ime6);

            // BUTTONI INIT

            Button btnPromasajZa1 = findViewById(R.id.btnPromasajZa1);
            Button btnPogodakZa1 = findViewById(R.id.btnPogodakZa1);
            Button btnPromasajZa2 = findViewById(R.id.btnPromasajZa2);
            Button btnPogodakZa2 = findViewById(R.id.btnPogodakZa2);
            Button btnAsist = findViewById(R.id.btnAsist);
            Button btnSkok = findViewById(R.id.btnRebound);

            Button btnZavrsiBasket = findViewById(R.id.btnZavrsi);


            TextView txtPoeniTima1 = findViewById(R.id.txtPoeniTima1);
            TextView txtPoeniTima2 = findViewById(R.id.txtPoeniTima2);


            // OBJEKTI IGRACI

           Igrac igrac1 = new Igrac(ime1, 0, 0, 0, 0, 0, 0, 0);
           Igrac igrac2 = new Igrac(ime2, 0, 0, 0, 0, 0, 0, 0);
           Igrac igrac3 = new Igrac(ime3, 0, 0, 0, 0, 0, 0, 0);
           Igrac igrac4 = new Igrac(ime4, 0, 0, 0, 0, 0, 0, 0);
           Igrac igrac5 = new Igrac(ime5, 0, 0, 0, 0, 0, 0, 0);
           Igrac igrac6 = new Igrac(ime6, 0, 0, 0, 0, 0, 0, 0);

            // BUTTONI

            txtIme1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    aktivirajIgraca(1, txtImena);

                }
            });

            txtIme2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    aktivirajIgraca(2, txtImena);

                }
            });
            txtIme3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    aktivirajIgraca(3, txtImena);

                }
            });
            txtIme4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    aktivirajIgraca(4, txtImena);

                }
            });
            txtIme5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    aktivirajIgraca(5, txtImena);

                }
            });
            txtIme6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    aktivirajIgraca(6, txtImena);

                }
            });

            btnPogodakZa1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (aktivanIgrac[0]) {
                        dodajPogodak(igrac1, 1);
                        dodajPoene(igrac1, 1);
                        dodajPoeneTimu(1, 1, txtPoeniTima1);
                    }
                    else if (aktivanIgrac[1]) {
                        dodajPogodak(igrac2, 1);
                        dodajPoene(igrac2, 1);
                        dodajPoeneTimu(1, 1, txtPoeniTima1);
                    }
                    else if (aktivanIgrac[2]) {
                        dodajPogodak(igrac3, 1);
                        dodajPoene(igrac3, 1);
                        dodajPoeneTimu(1, 1, txtPoeniTima1);
                    }
                    else if (aktivanIgrac[3]) {
                        dodajPogodak(igrac4, 1);
                        dodajPoene(igrac4, 1);
                        dodajPoeneTimu(2, 1, txtPoeniTima2);
                    }
                    else if (aktivanIgrac[4]) {
                        dodajPogodak(igrac5, 1);
                        dodajPoene(igrac5, 1);
                        dodajPoeneTimu(2, 1, txtPoeniTima2);
                    }
                    else if (aktivanIgrac[5]) {
                        dodajPogodak(igrac6, 1);
                        dodajPoene(igrac6, 1);
                        dodajPoeneTimu(2, 1, txtPoeniTima2);
                    }
                    else {
                        porukaNeaktivniIgraci();
                    }
                }
            });
            btnPogodakZa2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (aktivanIgrac[0]) {
                        dodajPogodak(igrac1, 2);
                        dodajPoene(igrac1, 2);
                        dodajPoeneTimu(1, 2, txtPoeniTima1);
                    }
                    else if (aktivanIgrac[1]) {
                        dodajPogodak(igrac2, 2);
                        dodajPoene(igrac2, 2);
                        dodajPoeneTimu(1, 2, txtPoeniTima1);
                    }
                    else if (aktivanIgrac[2]) {
                        dodajPogodak(igrac3, 2);
                        dodajPoene(igrac3, 2);
                        dodajPoeneTimu(1, 2, txtPoeniTima1);
                    }
                    else if (aktivanIgrac[3]) {
                        dodajPogodak(igrac4, 2);
                        dodajPoene(igrac4, 2);
                        dodajPoeneTimu(2, 2, txtPoeniTima2);
                    }
                    else if (aktivanIgrac[4]) {
                        dodajPogodak(igrac5, 2);
                        dodajPoene(igrac5, 2);
                        dodajPoeneTimu(2, 2, txtPoeniTima2);
                    }
                    else if (aktivanIgrac[5]) {
                        dodajPogodak(igrac6, 2);
                        dodajPoene(igrac6, 2);
                        dodajPoeneTimu(2, 2, txtPoeniTima2);
                    }
                    else {
                        porukaNeaktivniIgraci();
                    }
                }
            });
            btnPromasajZa1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (aktivanIgrac[0]) {
                        dodajPromasaj(igrac1, 1);
                    }
                    else if (aktivanIgrac[1]) {
                        dodajPromasaj(igrac2, 1);
                    }
                    else if (aktivanIgrac[2]) {
                        dodajPromasaj(igrac3, 1);
                    }
                    else if (aktivanIgrac[3]) {
                        dodajPromasaj(igrac4, 1);
                    }
                    else if (aktivanIgrac[4]) {
                        dodajPromasaj(igrac5, 1);
                    }
                    else if (aktivanIgrac[5]) {
                        dodajPromasaj(igrac6, 1);
                    }
                    else {
                        porukaNeaktivniIgraci();
                    }
                }
            });
            btnPromasajZa2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (aktivanIgrac[0]) {
                        dodajPromasaj(igrac1, 2);
                    }
                    else if (aktivanIgrac[1]) {
                        dodajPromasaj(igrac2, 2);
                    }
                    else if (aktivanIgrac[2]) {
                        dodajPromasaj(igrac3, 2);
                    }
                    else if (aktivanIgrac[3]) {
                        dodajPromasaj(igrac4, 2);
                    }
                    else if (aktivanIgrac[4]) {
                        dodajPromasaj(igrac5, 2);
                    }
                    else if (aktivanIgrac[5]) {
                        dodajPromasaj(igrac6, 2);
                    }
                    else {
                        porukaNeaktivniIgraci();
                    }
                }
            });

            btnAsist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (aktivanIgrac[0]) {
                        dodajAsist(igrac1);
                    }
                    else if (aktivanIgrac[1]) {
                        dodajAsist(igrac2);
                    }
                    else if (aktivanIgrac[2]) {
                        dodajAsist(igrac3);
                    }
                    else if (aktivanIgrac[3]) {
                        dodajAsist(igrac4);
                    }
                    else if (aktivanIgrac[4]) {
                        dodajAsist(igrac5);
                    }
                    else if (aktivanIgrac[5]) {
                        dodajAsist(igrac6);
                    }
                    else {
                        porukaNeaktivniIgraci();
                    }
                }
            });
            btnSkok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (aktivanIgrac[0]) {
                        dodajSkok(igrac1);
                    }
                    else if (aktivanIgrac[1]) {
                        dodajSkok(igrac2);
                    }
                    else if (aktivanIgrac[2]) {
                        dodajSkok(igrac3);
                    }
                    else if (aktivanIgrac[3]) {
                        dodajSkok(igrac4);
                    }
                    else if (aktivanIgrac[4]) {
                        dodajSkok(igrac5);
                    }
                    else if (aktivanIgrac[5]) {
                        dodajSkok(igrac6);
                    }
                    else {
                        porukaNeaktivniIgraci();
                    }
                }
            });

            btnZavrsiBasket.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent2 = new Intent(Activity2.this, Activity3.class);
                    intent2.putExtra("igrac1", igrac1);
                    intent2.putExtra("igrac2", igrac2);
                    intent2.putExtra("igrac3", igrac3);
                    intent2.putExtra("igrac4", igrac4);
                    intent2.putExtra("igrac5", igrac5);
                    intent2.putExtra("igrac6", igrac6);

                    startActivity(intent2);
                }
            });
        }
}