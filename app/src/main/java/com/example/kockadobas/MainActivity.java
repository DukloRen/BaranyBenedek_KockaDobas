package com.example.kockadobas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayout;
    private ImageButton dice1Image;
    private ImageButton dice2Image;
    private Button first_diceButton;
    private Button second_diceButton;
    private Button throwButton;
    private Button resetButton;
    private TextView textText;
    private int score;
    private int score2;
    private AlertDialog.Builder alertDialog;
    private Button dicepokerButton;
    private int dicepoker=0;
    private Button normal_game_Button;
    private int diceChoices=1;
    private int diceChoices2=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Random r=new Random();
        first_diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dice2Image.setVisibility(View.GONE);
            }
        });
        second_diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dice2Image.setVisibility(View.VISIBLE);
            }
        });
        throwButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dicepoker == 0) {
                    if (dice2Image.getVisibility() == View.VISIBLE) {

                        score = r.nextInt(7);
                        score2 = r.nextInt(7);
                        if (score == 0) {
                            score++;
                        }
                        if (score2 == 0) {
                            score2++;
                        }
                        textText.append("\n" + (score + score2) + "(" + score + "+" + score2 + ")");
                        Toast.makeText(MainActivity.this, "Dobás eredménye: " + (score + score2), Toast.LENGTH_SHORT).show();
                        switch (score) {
                            case 1:
                                dice1Image.setImageResource(R.drawable.kocka1);
                                break;
                            case 2:
                                dice1Image.setImageResource(R.drawable.kocka2);
                                break;
                            case 3:
                                dice1Image.setImageResource(R.drawable.kocka3);
                                break;
                            case 4:
                                dice1Image.setImageResource(R.drawable.kocka4);
                                break;
                            case 5:
                                dice1Image.setImageResource(R.drawable.kocka5);
                                break;
                            case 6:
                                dice1Image.setImageResource(R.drawable.kocka6);
                                break;

                        }
                        switch (score2) {
                            case 1:
                                dice2Image.setImageResource(R.drawable.kocka1);
                                break;
                            case 2:
                                dice2Image.setImageResource(R.drawable.kocka2);
                                break;
                            case 3:
                                dice2Image.setImageResource(R.drawable.kocka3);
                                break;
                            case 4:
                                dice2Image.setImageResource(R.drawable.kocka4);
                                break;
                            case 5:
                                dice2Image.setImageResource(R.drawable.kocka5);
                                break;
                            case 6:
                                dice2Image.setImageResource(R.drawable.kocka6);
                                break;

                        }
                    }
                    if (dice2Image.getVisibility() == View.GONE) {
                        score = r.nextInt(7);
                        if (score == 0) {
                            score++;
                        }
                        textText.append("\n" + score);
                        Toast.makeText(MainActivity.this, "Dobás eredménye: " + score, Toast.LENGTH_SHORT).show();
                        switch (score) {
                            case 1:
                                dice1Image.setImageResource(R.drawable.kocka1);
                                break;
                            case 2:
                                dice1Image.setImageResource(R.drawable.kocka2);
                                break;
                            case 3:
                                dice1Image.setImageResource(R.drawable.kocka3);
                                break;
                            case 4:
                                dice1Image.setImageResource(R.drawable.kocka4);
                                break;
                            case 5:
                                dice1Image.setImageResource(R.drawable.kocka5);
                                break;
                            case 6:
                                dice1Image.setImageResource(R.drawable.kocka6);
                                break;
                        }
                    }
                }
                else{
                    if (diceChoices==1&&diceChoices2==1){
                        score = r.nextInt(7);
                        score2 = r.nextInt(7);
                        if (score == 0) {
                            score++;
                        }
                        if (score2 == 0) {
                            score2++;
                        }
                        textText.append("\n" + (score + score2) + "(" + score + "+" + score2 + ")");
                        Toast.makeText(MainActivity.this, "Dobás eredménye: " + (score + score2)+" (Játékos)", Toast.LENGTH_SHORT).show();
                        switch (score) {
                            case 1:
                                dice1Image.setImageResource(R.drawable.kocka1);
                                break;
                            case 2:
                                dice1Image.setImageResource(R.drawable.kocka2);
                                break;
                            case 3:
                                dice1Image.setImageResource(R.drawable.kocka3);
                                break;
                            case 4:
                                dice1Image.setImageResource(R.drawable.kocka4);
                                break;
                            case 5:
                                dice1Image.setImageResource(R.drawable.kocka5);
                                break;
                            case 6:
                                dice1Image.setImageResource(R.drawable.kocka6);
                                break;

                        }
                        switch (score2) {
                            case 1:
                                dice2Image.setImageResource(R.drawable.kocka1);
                                break;
                            case 2:
                                dice2Image.setImageResource(R.drawable.kocka2);
                                break;
                            case 3:
                                dice2Image.setImageResource(R.drawable.kocka3);
                                break;
                            case 4:
                                dice2Image.setImageResource(R.drawable.kocka4);
                                break;
                            case 5:
                                dice2Image.setImageResource(R.drawable.kocka5);
                                break;
                            case 6:
                                dice2Image.setImageResource(R.drawable.kocka6);
                                break;

                        }
                        Toast.makeText(MainActivity.this, "Melyik kockát szeretné újra dobni? Kiválasztás után nyomjon a dobásra!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        if (diceChoices%2==0&&diceChoices2%2==0){
                            score = r.nextInt(7);
                            score2 = r.nextInt(7);
                            if (score == 0) {
                                score++;
                            }
                            if (score2 == 0) {
                                score2++;
                            }
                            textText.append("\n" + (score + score2) + "(" + score + "+" + score2 + ")");
                            Toast.makeText(MainActivity.this, "Dobás eredménye: " + (score + score2)+" (Játékos)", Toast.LENGTH_SHORT).show();
                            switch (score) {
                                case 1:
                                    dice1Image.setImageResource(R.drawable.kocka1);
                                    break;
                                case 2:
                                    dice1Image.setImageResource(R.drawable.kocka2);
                                    break;
                                case 3:
                                    dice1Image.setImageResource(R.drawable.kocka3);
                                    break;
                                case 4:
                                    dice1Image.setImageResource(R.drawable.kocka4);
                                    break;
                                case 5:
                                    dice1Image.setImageResource(R.drawable.kocka5);
                                    break;
                                case 6:
                                    dice1Image.setImageResource(R.drawable.kocka6);
                                    break;

                            }
                            switch (score2) {
                                case 1:
                                    dice2Image.setImageResource(R.drawable.kocka1);
                                    break;
                                case 2:
                                    dice2Image.setImageResource(R.drawable.kocka2);
                                    break;
                                case 3:
                                    dice2Image.setImageResource(R.drawable.kocka3);
                                    break;
                                case 4:
                                    dice2Image.setImageResource(R.drawable.kocka4);
                                    break;
                                case 5:
                                    dice2Image.setImageResource(R.drawable.kocka5);
                                    break;
                                case 6:
                                    dice2Image.setImageResource(R.drawable.kocka6);
                                    break;

                            }
                        }
                        else if (diceChoices%2==0){
                            score = r.nextInt(7);
                            if (score == 0) {
                                score++;
                            }
                            textText.append("\n" + score);
                            Toast.makeText(MainActivity.this, "Dobás eredménye: " + (score + score2)+" (Játékos)", Toast.LENGTH_SHORT).show();
                            switch (score) {
                                case 1:
                                    dice1Image.setImageResource(R.drawable.kocka1);
                                    break;
                                case 2:
                                    dice1Image.setImageResource(R.drawable.kocka2);
                                    break;
                                case 3:
                                    dice1Image.setImageResource(R.drawable.kocka3);
                                    break;
                                case 4:
                                    dice1Image.setImageResource(R.drawable.kocka4);
                                    break;
                                case 5:
                                    dice1Image.setImageResource(R.drawable.kocka5);
                                    break;
                                case 6:
                                    dice1Image.setImageResource(R.drawable.kocka6);
                                    break;
                            }
                        }
                        if (diceChoices2%2==0){
                            if (score2 == 0) {
                                score2++;
                            }
                            Toast.makeText(MainActivity.this, "Dobás eredménye: " + (score + score2)+" (Játékos)", Toast.LENGTH_SHORT).show();
                            switch (score2) {
                                case 1:
                                    dice2Image.setImageResource(R.drawable.kocka1);
                                    break;
                                case 2:
                                    dice2Image.setImageResource(R.drawable.kocka2);
                                    break;
                                case 3:
                                    dice2Image.setImageResource(R.drawable.kocka3);
                                    break;
                                case 4:
                                    dice2Image.setImageResource(R.drawable.kocka4);
                                    break;
                                case 5:
                                    dice2Image.setImageResource(R.drawable.kocka5);
                                    break;
                                case 6:
                                    dice2Image.setImageResource(R.drawable.kocka6);
                                    break;

                            }
                        }
                    }
                }
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.show();
            }
        });
        dicepokerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetButton.setVisibility(View.GONE);
                first_diceButton.setVisibility(View.GONE);
                second_diceButton.setVisibility(View.GONE);
                dicepokerButton.setVisibility(View.GONE);
                normal_game_Button.setVisibility(View.VISIBLE);
                dicepoker=1;
                textText.setText("");
                Toast.makeText(MainActivity.this,"Kérem dobjon!",Toast.LENGTH_SHORT).show();

            }
        });
        normal_game_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetButton.setVisibility(View.VISIBLE);
                first_diceButton.setVisibility(View.VISIBLE);
                second_diceButton.setVisibility(View.VISIBLE);
                dicepokerButton.setVisibility(View.VISIBLE);
                normal_game_Button.setVisibility(View.GONE);
                dicepoker=0;
                textText.setText("");
            }
        });
        dice1Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diceChoices++;
            }
        });
        dice2Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diceChoices2++;
            }
        });
    }
    private void init(){
        linearLayout=findViewById(R.id.linearLayout);
        dice1Image=findViewById(R.id.dice1Image);
        dice2Image=findViewById(R.id.dice2Image);
        first_diceButton=findViewById(R.id.first_diceButton);
        second_diceButton=findViewById(R.id.second_diceButton);
        throwButton=findViewById(R.id.throwButton);
        resetButton=findViewById(R.id.resetButton);
        dicepokerButton=findViewById(R.id.dicepokerButton);
        normal_game_Button=findViewById(R.id.normal_game_Button);
        normal_game_Button.setVisibility(View.GONE);
        textText=findViewById(R.id.textText);
        textText.setMovementMethod(new ScrollingMovementMethod());
        alertDialog=new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Reset").create();
        alertDialog.setMessage("Biztos, hogy törölni szeretné az eddigi dobásokat?")
                .setNegativeButton("Igen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        newGame();
                    }
                })
                .setPositiveButton("Nem", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setCancelable(false)
                .create();
    }
    private void newGame(){
        textText.setText("");
    }
}