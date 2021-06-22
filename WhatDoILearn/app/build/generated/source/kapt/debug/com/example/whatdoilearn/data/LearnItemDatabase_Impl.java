package com.example.whatdoilearn.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LearnItemDatabase_Impl extends LearnItemDatabase {
  private volatile LearnedItemDao _learnedItemDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `learned_item` (`item_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `item_name` TEXT NOT NULL, `item_description` TEXT NOT NULL, `item_level` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8a2a135ef0b46921533752b0628b5421')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `learned_item`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsLearnedItem = new HashMap<String, TableInfo.Column>(4);
        _columnsLearnedItem.put("item_id", new TableInfo.Column("item_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLearnedItem.put("item_name", new TableInfo.Column("item_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLearnedItem.put("item_description", new TableInfo.Column("item_description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLearnedItem.put("item_level", new TableInfo.Column("item_level", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLearnedItem = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLearnedItem = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLearnedItem = new TableInfo("learned_item", _columnsLearnedItem, _foreignKeysLearnedItem, _indicesLearnedItem);
        final TableInfo _existingLearnedItem = TableInfo.read(_db, "learned_item");
        if (! _infoLearnedItem.equals(_existingLearnedItem)) {
          return new RoomOpenHelper.ValidationResult(false, "learned_item(com.example.whatdoilearn.data.LearnedItem).\n"
                  + " Expected:\n" + _infoLearnedItem + "\n"
                  + " Found:\n" + _existingLearnedItem);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "8a2a135ef0b46921533752b0628b5421", "7056ed0139823ae35f6200358f52b68a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "learned_item");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `learned_item`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public LearnedItemDao learnedItemDao() {
    if (_learnedItemDao != null) {
      return _learnedItemDao;
    } else {
      synchronized(this) {
        if(_learnedItemDao == null) {
          _learnedItemDao = new LearnedItemDao_Impl(this);
        }
        return _learnedItemDao;
      }
    }
  }
}
