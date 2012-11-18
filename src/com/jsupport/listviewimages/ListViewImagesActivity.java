package com.jsupport.listviewimages;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ListViewImagesActivity extends Activity {
	
	final SingelDB dB1=SingelDB.getDB(); 
	
	/** Called when the activity is first created. */
    
	@SuppressWarnings("static-access")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
     	
    	
        // Get the message from intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(TaskListActivity.EXTRA_MESSAGE);
        if((message!=null)&&(message.isEmpty()==false)){
        dB1.addArray(message,message);
        intent.removeExtra(TaskListActivity.EXTRA_MESSAGE);
        }
       
        View header = getLayoutInflater().inflate(R.layout.item_details_view2, null);      
      //  ArrayList<ItemDetails> image_details = GetSearchResults();
        
        final ListView lv1 = (ListView) findViewById(R.id.listV_main);
        lv1.addHeaderView(header);
        ArrayList<ItemDetails> image_details=SingelDB.getArray();
        lv1.setAdapter(new ItemListBaseAdapter(ListViewImagesActivity.this, image_details));
        
         lv1.setOnItemClickListener(new OnItemClickListener() {
        	        	
        	public void onItemClick(AdapterView<?> a, View v, int position, long id) { 
        		Object o = lv1.getItemAtPosition(position);
            	ItemDetails obj_itemDetails = (ItemDetails)o;
            	//Toast.makeText(ListViewImagesActivity.this, "You have chosen : " + " " , Toast.LENGTH_LONG).show();
        		Toast.makeText(ListViewImagesActivity.this, "You have chosen : " + " " + obj_itemDetails.getName()+" position: "+position, Toast.LENGTH_LONG).show();
        		
        	}  
        });
         
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