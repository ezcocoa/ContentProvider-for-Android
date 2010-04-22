package com.ezcocoa.contentprovider;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts.People;
import android.provider.Contacts.PeopleColumns;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class Main extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        Cursor c = getContentResolver().query(People.CONTENT_URI, null, null, null, null);
        ListAdapter adapter = new SimpleCursorAdapter(this, 
        		android.R.layout.simple_list_item_1,
        		c,
        		new String[] {PeopleColumns.NAME},
        		new int[] {android.R.id.text1});
        setListAdapter(adapter);
    }
}