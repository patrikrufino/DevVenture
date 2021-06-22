package com.example.whatdoilearn.data;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.whatdoilearn.data.Converters.class})
@androidx.room.Database(entities = {com.example.whatdoilearn.data.LearnedItem.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/whatdoilearn/data/LearnItemDatabase;", "Landroidx/room/RoomDatabase;", "()V", "learnedItemDao", "Lcom/example/whatdoilearn/data/LearnedItemDao;", "Companion", "app_debug"})
public abstract class LearnItemDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.whatdoilearn.data.LearnItemDatabase.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static volatile com.example.whatdoilearn.data.LearnItemDatabase INSTANCE;
    
    public LearnItemDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.whatdoilearn.data.LearnedItemDao learnedItemDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/whatdoilearn/data/LearnItemDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/whatdoilearn/data/LearnItemDatabase;", "getINSTANCE", "()Lcom/example/whatdoilearn/data/LearnItemDatabase;", "setINSTANCE", "(Lcom/example/whatdoilearn/data/LearnItemDatabase;)V", "getAll", "", "Lcom/example/whatdoilearn/data/LearnedItem;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.whatdoilearn.data.LearnItemDatabase getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.Nullable()
        com.example.whatdoilearn.data.LearnItemDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.whatdoilearn.data.LearnItemDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.whatdoilearn.data.LearnedItem> getAll() {
            return null;
        }
    }
}