package com.nipun.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    String[] booksArray = {"calculus","Cormen","Learn python the hard way","Rich dad poor dad",
            "Psychology of money","Famous five","Quantum Break","Harry Potter","Lord of Rings"};

    ArrayList<BookModel> books = new ArrayList<BookModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        String passedContent = intent.getExtras().getString("text");
        Toast.makeText(this, passedContent, Toast.LENGTH_SHORT).show();

//
//        ArrayAdapter adapter = new ArrayAdapter<String>(this,
//                R.layout.basic_list_view, booksArray);
//
//        BooksAdapter booksAdapter = new BooksAdapter(books,this);
//
//        books.add(new BookModel("calculus","Me"));
//        books.add(new BookModel("Cormen","you"));
//
//        ListView listView = (ListView) findViewById(R.id.booksListView);
//        listView.setAdapter(booksAdapter);

    }
}