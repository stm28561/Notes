package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewNotes;
    public static final ArrayList<Note> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewNotes = findViewById(R.id.recyclerViewNotes);
        if (notes.isEmpty()) {
            notes.add(new Note("Jog", "running", "Monday", 1));
            notes.add(new Note("Diploma", "call the Anatoly Pavlovich", "Monday", 3));
            notes.add(new Note("Leave the job", "hvatit eto terpet'", "Firday", 2));
            notes.add(new Note("Tinder Date", "go on tinder date", "Sunday", 2));
            notes.add(new Note("Buy a microwave", "i want microwave", "Monday", 1));
            notes.add(new Note("Football", "go play football", "Monday", 1));
            notes.add(new Note("Courses", "do three tasks", "Saturday", 3));
            notes.add(new Note("Win Rocket League", "go win Rocket League game", "Saturday", 1));
        }
        NotesAdapter adapter = new NotesAdapter(notes);
        recyclerViewNotes.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewNotes.setAdapter(adapter);
        adapter.setOnNoteClickListener(new NotesAdapter.OnNoteClickListener() {
            @Override
            public void onNoteClick(int position) {
                Toast.makeText(MainActivity.this, "Номер позиции " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClickAddNote(View view) {
        Intent intent = new Intent(this, AddNoteActivity.class);
        startActivity(intent);
    }
}