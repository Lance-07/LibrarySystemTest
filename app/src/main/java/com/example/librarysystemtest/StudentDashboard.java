package com.example.librarysystemtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class StudentDashboard extends AppCompatActivity {
    ArrayList<BookListModel> bookListModels = new ArrayList<>();
    int[] bookCover = {
            R.drawable.to_kill_a_mocking_bird, R.drawable.the_cather_in_the_rye,
            R.drawable.pride_and_prejudice, R.drawable.george_orwell_book,
            R.drawable.the_great_gatsby, R.drawable.java_101};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);

        setUpBookListModel();

        recyclerView = findViewById(R.id.mRecyclerView);
        BookList_RecycleViewAdapter adapter = new BookList_RecycleViewAdapter(this, bookListModels);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpBookListModel () {
        String[] bookNames = getResources().getStringArray(R.array.book_names);
        String[] bookAuthors = getResources().getStringArray(R.array.book_authors);
        String[] bookCategories = getResources().getStringArray(R.array.book_categories);

        for (int i=0; i<bookNames.length; i++) {
            bookListModels.add(new BookListModel(
                    bookNames[i], bookAuthors[i], bookCategories[i], bookCover[i]
            ));
        }
    }
}