package com.example.quran;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import com.example.quran.QuranData.QDH;

import java.util.HashMap;

public class RandomVerse extends AppCompatActivity {
    TextView randomVerse;
    TextView verseAddress;
    QDH qdh = new QDH();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_verse);
        Toolbar myChildToolbar = (Toolbar) findViewById(R.id.toolbar_random_verse);
        setSupportActionBar(myChildToolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        HashMap<String, String > verse = qdh.getRandomVerse();
        randomVerse = findViewById(R.id.randomVerse);
        verseAddress = findViewById(R.id.verseAddress);
        randomVerse.setText(verse.get("verse"));
        verseAddress.setText(String.format("%s :%s", verse.get("surah"), verse.get("verseNo")));
    }
}