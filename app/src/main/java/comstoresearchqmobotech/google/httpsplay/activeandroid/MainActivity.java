package comstoresearchqmobotech.google.httpsplay.activeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import comstoresearchqmobotech.google.httpsplay.activeandroid.database.Category;
import comstoresearchqmobotech.google.httpsplay.activeandroid.database.Item;
import comstoresearchqmobotech.google.httpsplay.activeandroid.log.MyLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Category restaurant = new Category();
        restaurant.name = "CategoryName1";
        restaurant.save();
        MyLog.showLog("category name saved");

        Item item = new Item();
        item.category = restaurant;
        item.name = "restaurantName 1";
        item.save();

        item = new Item();
        item.category = restaurant;
        item.name = "Olive Garden";
        item.save();
        MyLog.showLog("Restaurants name saved");


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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
