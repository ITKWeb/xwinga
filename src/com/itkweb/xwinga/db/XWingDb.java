package com.itkweb.xwinga.db;

import java.util.HashSet;
import java.util.Set;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.itkweb.xwinga.model.Box;

public class XWingDb {

	private XWingDbTables xwingDb;
	private SQLiteDatabase readableDb;

	public XWingDb(Context context) {
		// On créer la BDD et sa table
		xwingDb = new XWingDbTables(context);
	}

	public void open() {
		// on ouvre la BDD en écriture
		readableDb = xwingDb.getReadableDatabase();
	}

	public void close() {
		// on ferme l'accès à la BDD
		readableDb.close();
	}

	public SQLiteDatabase getBDD() {
		return readableDb;
	}

	public Set<Box> getAllBoxes() {

		Set<Box> resultBoxList = new HashSet<Box>();
		Cursor c = readableDb.query(XWingDbTables.TABLE_BOX, new String[] {XWingDbTables.COL_ID, XWingDbTables.COL_NAME, XWingDbTables.COL_PICTURE}, "", null, null, null, null);

		//si aucun élément n'a été retourné dans la requête, on renvoie null
		if (c.getCount() == 0)
			return null;
 
		//Sinon on se place sur le premier élément
		if(c.moveToFirst()) {
			do {
				Box box = new Box();
				box.setId(c.getInt(0));
				box.setName(c.getString(1));
				box.setPicture(c.getString(2));
				resultBoxList.add(box);
			} while (c.moveToNext());
			
		}
		
		//On ferme le cursor
		c.close();
 
		//On retourne le livre
		return resultBoxList;
	}
}
