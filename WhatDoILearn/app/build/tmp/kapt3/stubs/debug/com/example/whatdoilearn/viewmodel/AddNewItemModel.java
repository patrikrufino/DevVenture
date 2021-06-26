package com.example.whatdoilearn.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/example/whatdoilearn/viewmodel/AddNewItemModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/whatdoilearn/data/LearnedItemRepository;", "(Lcom/example/whatdoilearn/data/LearnedItemRepository;)V", "showError", "Landroidx/lifecycle/MutableLiveData;", "", "getShowError", "()Landroidx/lifecycle/MutableLiveData;", "insert", "Lkotlinx/coroutines/Job;", "item", "Lcom/example/whatdoilearn/entities/LearnedItem;", "app_debug"})
public final class AddNewItemModel extends androidx.lifecycle.ViewModel {
    private final com.example.whatdoilearn.data.LearnedItemRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showError = null;
    
    public AddNewItemModel(@org.jetbrains.annotations.NotNull()
    com.example.whatdoilearn.data.LearnedItemRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    com.example.whatdoilearn.entities.LearnedItem item) {
        return null;
    }
}