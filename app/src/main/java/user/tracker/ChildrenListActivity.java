package user.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ChildrenListActivity extends AppCompatActivity {

    private RecyclerView listOfChildren;
    private TextView textView_YourChildrenWillAppearHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView_YourChildrenWillAppearHere = findViewById(R.id.textView_YourChildrenWillAppearHere);

        listOfChildren = findViewById(R.id.listOfChildren);
        listOfChildren.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        // fetch list of children

        // show the list and hide textView_YourChildrenWillAppearHere
        // listOfChildren.setAdapter();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();

                // open add child activity.
                Intent intentToOpenAddAChildActivity = new Intent(ChildrenListActivity.this, AddAChildActivity.class);
                startActivity(intentToOpenAddAChildActivity);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_add_a_child) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
