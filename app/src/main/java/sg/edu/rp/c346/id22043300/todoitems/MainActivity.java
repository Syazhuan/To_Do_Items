package sg.edu.rp.c346.id22043300.todoitems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> alToDo;
    ArrayAdapter<ToDoItem> aaToDo;
    //ArrayAdapter<AndroidVersion> aaAndroidVersions;

    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDo);
        alToDo = new ArrayList<>();

        ToDoItem item1 = new ToDoItem("Go for movie", Calendar.getInstance());
        item1.getDate().set(Calendar.YEAR, 2020);
        item1.getDate().set(Calendar.MONTH, Calendar.AUGUST);
        item1.getDate().set(Calendar.DAY_OF_MONTH, 1);

        ToDoItem item2 = new ToDoItem("Go for haircut", Calendar.getInstance());
        item2.getDate().set(Calendar.YEAR, 2020);
        item2.getDate().set(Calendar.MONTH, Calendar.AUGUST);
        item2.getDate().set(Calendar.DAY_OF_MONTH, 2);


        alToDo.add(item1);
        alToDo.add(item2);

        adapter = new CustomAdapter(this, R.layout.row, alToDo);
        lvToDo.setAdapter(adapter);
    }
}