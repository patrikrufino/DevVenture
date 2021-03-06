package com.example.whatdoilearn.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/whatdoilearn/view/LearnedItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/whatdoilearn/view/LearnedItemAdapter$LearnedItemViewHolder;", "()V", "value", "", "Lcom/example/whatdoilearn/entities/LearnedItem;", "learnedItems", "getLearnedItems", "()Ljava/util/List;", "setLearnedItems", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "LearnedItemViewHolder", "app_debug"})
public final class LearnedItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.whatdoilearn.view.LearnedItemAdapter.LearnedItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.whatdoilearn.entities.LearnedItem> learnedItems;
    
    public LearnedItemAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.whatdoilearn.entities.LearnedItem> getLearnedItems() {
        return null;
    }
    
    public final void setLearnedItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.whatdoilearn.entities.LearnedItem> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.whatdoilearn.view.LearnedItemAdapter.LearnedItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.whatdoilearn.view.LearnedItemAdapter.LearnedItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/whatdoilearn/view/LearnedItemAdapter$LearnedItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/whatdoilearn/view/LearnedItemAdapter;Landroid/view/View;)V", "desciptionContainer", "Landroid/widget/TextView;", "level", "titleContainer", "bind", "", "learnedItem", "Lcom/example/whatdoilearn/entities/LearnedItem;", "app_debug"})
    public final class LearnedItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView titleContainer = null;
        private final android.widget.TextView desciptionContainer = null;
        private final android.view.View level = null;
        
        public LearnedItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.whatdoilearn.entities.LearnedItem learnedItem) {
        }
    }
}