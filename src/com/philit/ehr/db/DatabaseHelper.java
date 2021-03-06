package com.philit.ehr.db;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

	private static final String DATABASE_NAME = "newWeek.sqlite";
	private static final int DATABASE_VERSION = 1;

	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
		try {
			TableUtils.createTable(connectionSource, PeriodicalData.class);
			TableUtils.createTable(connectionSource, ArticleData.class);
			TableUtils.createTable(connectionSource, ResourceData.class);
			TableUtils.createTable(connectionSource, ImageData.class);
			TableUtils.createTable(connectionSource, DocumentData.class);
			TableUtils.createTable(connectionSource, AnnouncementData.class);
			TableUtils.createTable(connectionSource, EducationData.class);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource,
			int oldVersion, int newVersion) {
		
	}
}
