package com.example.whatdoilearn.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/whatdoilearn/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/whatdoilearn/data/LearnedItemRepository;", "(Lcom/example/whatdoilearn/data/LearnedItemRepository;)V", "learnedItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/whatdoilearn/entities/LearnedItem;", "getLearnedItems", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.whatdoilearn.data.LearnedItemRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.whatdoilearn.entities.LearnedItem>> learnedItems = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.whatdoilearn.data.LearnedItemRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.whatdoilearn.entities.LearnedItem>> getLearnedItems() {
        return null;
    }
}