package com.jsupport.listviewimages;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ListViewImagesActivity extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        View header = getLayoutInflater().inflate(R.layout.item_details_view2, null);      
        ArrayList<ItemDetails> image_details = GetSearchResults();
        
        final ListView lv1 = (ListView) findViewById(R.id.listV_main);
        lv1.addHeaderView(header);
        lv1.setAdapter(new ItemListBaseAdapter(this, image_details));
                        
        lv1.setOnItemClickListener(new OnItemClickListener() {
        	
        	public void onItemClick(AdapterView<?> a, View v, int position, long id) { 
        		Object o = lv1.getItemAtPosition(position);
            	ItemDetails obj_itemDetails = (ItemDetails)o;
        		Toast.makeText(ListViewImagesActivity.this, "You have chosen : " + " " + obj_itemDetails.getName(), Toast.LENGTH_LONG).show();
        	}  
        });
    }
    
    private ArrayList<ItemDetails> GetSearchResults(){
    	ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();
    	
    	ItemDetails item_details = new ItemDetails();
    	item_details.setName("Mock task 1");
    	item_details.setItemDescription("Mock task 1"); 
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 2");
    	item_details.setItemDescription("Mock task 2"); 
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 3");
    	item_details.setItemDescription("Mock task 3"); 
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 4");
    	item_details.setItemDescription("Mock task 4"); 
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 5");
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 6");
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 7");
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 8");
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 9");
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 10");
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 11");
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 12");
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 13");
    	results.add(item_details);
    	
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 14");
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mock task 15");
    	results.add(item_details);
    	
    	return results;
    	
    	
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_task_list, menu);
        return true;
    }
    
    /** Called when the user clicks the Add button */
    public void addMessage(View view) {
    	Intent intent = new Intent(this, TaskListActivity.class);
    	startActivity(intent);
    }
   
}