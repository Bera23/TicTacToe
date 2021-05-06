package com.example.matematickavezbalica;

import android.annotation.SuppressLint;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> nizOdgovora = new ArrayList<Integer>();

    int lokacijaTacnogOdgovora;
    int brojRezultat = 0;
    int brojPitanja = 0;

    boolean clicked = false;

    Button izaberiSabiranje;
    Button izaberiOduzimanje;
    Button vratiSeNazad;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button restart;

    TextView tekstLabelaTN;  //tacno netacno
    TextView tekstRezultat;
    TextView brojeviZaRacunanje;
    TextView tajmer;
    TextView naslov;
    TextView tekstA;
    TextView tekstPlus;
    TextView tekstB;


    ConstraintLayout prozorZaIgru;

    CountDownTimer tajmerStartStop;

    public void sabiranje(View view) {
        izaberiOduzimanje.setVisibility(View.INVISIBLE);
        izaberiSabiranje.setVisibility(View.INVISIBLE);
        prozorZaIgru.setVisibility(View.VISIBLE);
        naslov.setVisibility(View.INVISIBLE);
        restart(findViewById(R.id.tajmer));
        novoPitanjeSabiranje();
        clicked = false;
    }

    public void oduzimanje(View view) {
        izaberiOduzimanje.setVisibility(View.INVISIBLE);
        izaberiSabiranje.setVisibility(View.INVISIBLE);
        prozorZaIgru.setVisibility(View.VISIBLE);
        naslov.setVisibility(View.INVISIBLE);
        restart(findViewById(R.id.tajmer));
        novoPitanjeOduzimanje();
        clicked = true;
    }

    public void izaberiMeni(View view) {
        prozorZaIgru.setVisibility(View.INVISIBLE);
        izaberiOduzimanje.setVisibility(View.VISIBLE);
        izaberiSabiranje.setVisibility(View.VISIBLE);
        naslov.setVisibility(View.VISIBLE);
        tajmerStartStop.cancel();  //zaustavalja tajmer
    }

    @SuppressLint("SetTextI18n")
    public void izaberiOdgovor(View view) {

        if (Integer.toString(lokacijaTacnogOdgovora).equals(view.getTag().toString())) {
            tekstLabelaTN.setText("TAČNO :)");
            brojRezultat++;
        } else {
            tekstLabelaTN.setText("NETAČNO :(");
        }
        brojPitanja++;
        tekstRezultat.setText(Integer.toString(brojRezultat) + "/" + Integer.toString(brojPitanja));
        if (clicked == true) {
            novoPitanjeOduzimanje();
        } else {
            novoPitanjeSabiranje();
        }
    }

    @SuppressLint("SetTextI18n")
    public void novoPitanjeSabiranje() {

        Random random = new Random();

        int a = random.nextInt(31); //random ide od 0 do 31
        int b = random.nextInt(31);

       // brojeviZaRacunanje.setText(Integer.toString(a) + " + " + Integer.toString(b)); //brojevi na labeli
        tekstA.setText(Integer.toString(a));
        tekstB.setText(Integer.toString(b));
        tekstPlus.setText("+");

        lokacijaTacnogOdgovora = random.nextInt(4); //1 od 4 dugmeta ima tacan odg

        nizOdgovora.clear();

        for (int i = 0; i < 4; i++) {
            if (i == lokacijaTacnogOdgovora) { //proverava koje dugme ima tacan odg
                nizOdgovora.add(a + b);
            } else {

                int wrongAnswer = random.nextInt(51); //ukoliko jos jedno dugme ima tacan odg, kroz while petlju pravi novi odg
                while (wrongAnswer == a + b) {
                    wrongAnswer = random.nextInt(51);
                }
                nizOdgovora.add(wrongAnswer);
            }

        }
        button0.setText(Integer.toString(nizOdgovora.get(0))); //na svako drugme postavlja po jedan broj iz niza
        button1.setText(Integer.toString(nizOdgovora.get(1)));
        button2.setText(Integer.toString(nizOdgovora.get(2)));
        button3.setText(Integer.toString(nizOdgovora.get(3)));
    }

    @SuppressLint("SetTextI18n")
    public void novoPitanjeOduzimanje() {

        Random random = new Random();

        int a = random.nextInt(31) + 1; //random ide od 0 do 31
        int b = random.nextInt(a);

        tekstA.setText(Integer.toString(a));
        tekstB.setText(Integer.toString(b));
        tekstPlus.setText("-");

        // brojeviZaRacunanje.setText(Integer.toString(a) + " - " + Integer.toString(b)); //brojevi na labeli

        lokacijaTacnogOdgovora = random.nextInt(4); //1 od 4 dugmeta ima tacan odg

        nizOdgovora.clear();

        for (int i = 0; i < 4; i++) {
            if (i == lokacijaTacnogOdgovora) { //proverava koje dugme ima tacan odg
                nizOdgovora.add(a - b);
            } else {

                int wrongAnswer = random.nextInt(51); //ukoliko jos jedno dugme ima tacan odg, kroz while petlju pravi novi odg
                while (wrongAnswer == a - b) {
                    wrongAnswer = random.nextInt(51);
                }
                nizOdgovora.add(wrongAnswer);
            }

        }
        button0.setText(Integer.toString(nizOdgovora.get(0))); //na svako drugme postavlja po jedan broj iz niza
        button1.setText(Integer.toString(nizOdgovora.get(1)));
        button2.setText(Integer.toString(nizOdgovora.get(2)));
        button3.setText(Integer.toString(nizOdgovora.get(3)));
    }

    public void tajmerVreme(){


         tajmerStartStop =   new CountDownTimer(30100, 1000) {

            @SuppressLint("SetTextI18n")
            @Override
            public void onTick(long l) {

                tajmer.setText(String.valueOf(l / 1000) + "s");
            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onFinish() {
                tekstLabelaTN.setText("KRAJ!");
                restart.setVisibility(View.VISIBLE);
                button0.setEnabled(false);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
            }
        }.start();
    }

    @SuppressLint("SetTextI18n")
    public void restart(View view) {

        brojRezultat = 0;
        brojPitanja = 0;
        tajmer.setText("30s");

        tekstRezultat.setText(Integer.toString(brojRezultat) + "/" + Integer.toString(brojPitanja));

        if (clicked == true) {
            novoPitanjeOduzimanje();
        } else {
            novoPitanjeSabiranje();
        }

        restart.setVisibility(View.INVISIBLE);
        tekstLabelaTN.setText("");

        tajmerVreme();

        button0.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        nizOdgovora.clear();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prozorZaIgru = findViewById(R.id.prozorZaIgru);
        prozorZaIgru.setVisibility(View.INVISIBLE);

        naslov = findViewById(R.id.naslovMatematika);
       //brojeviZaRacunanje = findViewById(R.id.brojeviZaRacunanje);
        tekstA = findViewById(R.id.tekstA);
        tekstB = findViewById(R.id.tekstB);
        tekstPlus = findViewById(R.id.tekstPlus);
        tekstLabelaTN = findViewById(R.id.tekstLabelaTN);
        tekstRezultat = findViewById(R.id.tekstRezultat);
        tajmer = findViewById(R.id.tajmer);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        izaberiSabiranje = findViewById(R.id.sabiranje);
        izaberiSabiranje.setVisibility(View.VISIBLE);
        izaberiOduzimanje = findViewById(R.id.oduzimanje);
        izaberiOduzimanje.setVisibility(View.VISIBLE);

        vratiSeNazad = findViewById(R.id.vratiSeNazad);
        vratiSeNazad.setVisibility(View.VISIBLE);
        restart = findViewById(R.id.restart);
    }
}