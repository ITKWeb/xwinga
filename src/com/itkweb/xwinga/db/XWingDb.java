package com.itkweb.xwinga.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class XWingDb {

	
	private XWingDbTables xwingDb;
	private SQLiteDatabase readableDb;

	public XWingDb(Context context){
		//On cr�er la BDD et sa table
		xwingDb = new XWingDbTables(context);
	}

	
	public void open(){
		//on ouvre la BDD en �criture
		readableDb = xwingDb.getReadableDatabase();
	}
 
	public void close(){
		//on ferme l'acc�s � la BDD
		readableDb.close();
	}
 
	public SQLiteDatabase getBDD(){
		return readableDb;
	}	
	
	
	
}
