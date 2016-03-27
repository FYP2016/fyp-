     package mmc.demo.monitormychlid;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Browser;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class browsing_history extends AppCompatActivity {
    private Context context;
    private Cursor mCursor;
    public Uri BOOKMARKS_URI = null;
    private String[] HISTORY_PROJECTION = null;
    private static final int HISTORY_PROJECTION_TITLE_INDEX = 0;
    private static final int HISTORY_PROJECTION_URL_INDEX = 0;
        ListView listView;
        ArrayAdapter<String> adapter;
        String[] internet_url= {"URL","URL","URL","URL","URL","URL"};


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_browsing_history);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

            toolbar.setNavigationIcon(R.drawable.ic_home);

            listView= (ListView)findViewById(R.id.list_view);
            adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,internet_url);
            listView.setAdapter(adapter);

            toolbar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent call_intent = new Intent(browsing_history.this, MainActivity.class);
                    startActivity(call_intent);


                 /*   Cursor mCur =context.getContentResolver(Browser.BOOKMARKS_URI,
                            Browser.HISTORY_PROJECTION, null, null, null);
                    mCur.moveToFirst();
                    if (mCur.moveToFirst() && mCur.getCount() > 0) {
                        while (!mCur.isAfterLast()) {
                            Log.v("titleIdx", mCur
                                    .getString(Browser.HISTORY_PROJECTION_TITLE_INDEX));
                            Log.v("urlIdx", mCur
                                    .getString(Browser.HISTORY_PROJECTION_URL_INDEX));
                            mCur.moveToNext();
                        }
                    } */


                    }
            });

        }

    }