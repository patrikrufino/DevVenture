package com.example.whatdoilearn.data.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/whatdoilearn/data/database/Converters;", "", "()V", "intToLevel", "Lcom/example/whatdoilearn/entities/UnderstandingLevel;", "int", "", "levelToInt", "level", "app_debug"})
public final class Converters {
    
    public Converters() {
        super();
    }
    
    @androidx.room.TypeConverter()
    public final int levelToInt(@org.jetbrains.annotations.NotNull()
    com.example.whatdoilearn.entities.UnderstandingLevel level) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.example.whatdoilearn.entities.UnderstandingLevel intToLevel(int p0_52215) {
        return null;
    }
}