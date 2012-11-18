package com.jsupport.listviewimages;

import java.util.ArrayList;

public class SingelDB {
	
	private static SingelDB singelDB =null;
	private static ArrayList<ItemDetails> array = new ArrayList<ItemDetails>();
	
	private SingelDB(){}
	
	
	static SingelDB getDB(){
		if(singelDB==null){
			
			singelDB=new SingelDB();
			
		}
		return singelDB;
	}
	public static ArrayList<ItemDetails> getArray() {
		return array;
	}
	public static boolean addArray(String name,String description) {
		ItemDetails item_details = new ItemDetails();
		item_details.setName(name);
		item_details.setItemDescription(description); 
	 return	SingelDB.array.add(item_details);
	
	}
	public static boolean delArray(int position) {
		ItemDetails item_details = SingelDB.array.remove(position);
		 if(item_details==null)
			 return false;
		 return true;
		 
	}

}
