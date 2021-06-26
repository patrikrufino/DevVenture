package com.example.whatdoilearn.data.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.whatdoilearn.entities.LearnedItem;
import com.example.whatdoilearn.entities.UnderstandingLevel;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LearnedItemDao_Impl implements LearnedItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LearnedItem> __insertionAdapterOfLearnedItem;

  private final Converters __converters = new Converters();

  public LearnedItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLearnedItem = new EntityInsertionAdapter<LearnedItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `learned_item` (`item_id`,`item_name`,`item_description`,`item_level`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LearnedItem value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        final int _tmp;
        _tmp = __converters.levelToInt(value.getUnderstandingLevel());
        stmt.bindLong(4, _tmp);
      }
    };
  }

  @Override
  public Object insert(final LearnedItem item, final Continuation<? super Unit> p1) {
    __db.assertNotSuspendingTransaction();
  }

  @Override
  public Object insert(final List<LearnedItem> item, final Continuation<? super Unit> p1) {
    __db.assertNotSuspendingTransaction();
  }

  @Override
  public LiveData<List<LearnedItem>> getAll() {
    final String _sql = "SELECT * FROM learned_item ORDER BY item_level ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"learned_item"}, false, new Callable<List<LearnedItem>>() {
      @Override
      public List<LearnedItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "item_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "item_name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "item_description");
          final int _cursorIndexOfUnderstandingLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "item_level");
          final List<LearnedItem> _result = new ArrayList<LearnedItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final LearnedItem _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final UnderstandingLevel _tmpUnderstandingLevel;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfUnderstandingLevel);
            _tmpUnderstandingLevel = __converters.intToLevel(_tmp);
            _item = new LearnedItem(_tmpId,_tmpName,_tmpDescription,_tmpUnderstandingLevel);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
