package com.itkweb.xwinga.db;

import com.itkweb.xwinga.model.Box.BoxSet;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class XWingDbTables extends SQLiteOpenHelper {

	private static final int DATABASE_VERSION = 5;

	public static final String TABLE_BOX = "box";
	public static final String COL_ID = "ID";
	public static final String COL_NAME = "Name";
	public static final String COL_PICTURE = "Picture";

	private static final String CREATE_BDD = "CREATE TABLE " + TABLE_BOX + " ("
			+ COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_NAME
			+ " TEXT NOT NULL, "+ COL_PICTURE
			+ " TEXT NOT NULL);";

	public XWingDbTables(Context context) {
		super(context, TABLE_BOX, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// on cr�e la table � partir de la requ�te �crite dans la variable
		// CREATE_BDD
		db.execSQL(CREATE_BDD);
		init();
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// On peut faire ce qu'on veut ici moi j'ai d�cid� de supprimer la table
		// et de la recr�er
		// comme �a lorsque je change la version les id repartent de 0
		db.execSQL("DROP TABLE " + TABLE_BOX + ";");
		onCreate(db);
	}

	public void init() {
		SQLiteDatabase db = getWritableDatabase();
		
		// Cr�ation d'un ContentValues (fonctionne comme une HashMap)
		ContentValues values = new ContentValues();
		// on lui ajoute une valeur associ� � une cl� (qui est le nom de la
		// colonne dans laquelle on veut mettre la valeur)

		for (BoxSet box : BoxSet.values()) {
			values.put(COL_NAME, box.getName());
			values.put(COL_PICTURE, box.getPicture());
		}

		// on ins�re l'objet dans la BDD via le ContentValues
		db.insert(TABLE_BOX, null, values);

		db.close();
	}

	
	
}
