package com.example.mvvmexample.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/mvvmexample/adapters/RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/mvvmexample/adapters/RecyclerAdapter$NotesViewHolder;", "viewModel", "Lcom/example/mvvmexample/viewmodels/MainViewModel;", "arrayList", "Ljava/util/ArrayList;", "Lcom/example/mvvmexample/models/NicePlace;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Lcom/example/mvvmexample/viewmodels/MainViewModel;Ljava/util/ArrayList;Landroid/content/Context;)V", "getArrayList", "()Ljava/util/ArrayList;", "getViewModel", "()Lcom/example/mvvmexample/viewmodels/MainViewModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NotesViewHolder", "app_debug"})
public final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.mvvmexample.adapters.RecyclerAdapter.NotesViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.mvvmexample.viewmodels.MainViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.example.mvvmexample.models.NicePlace> arrayList = null;
    private final android.content.Context context = null;
    
    public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.example.mvvmexample.viewmodels.MainViewModel viewModel, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.mvvmexample.models.NicePlace> arrayList, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mvvmexample.viewmodels.MainViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.mvvmexample.models.NicePlace> getArrayList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.mvvmexample.adapters.RecyclerAdapter.NotesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mvvmexample.adapters.RecyclerAdapter.NotesViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/mvvmexample/adapters/RecyclerAdapter$NotesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroid/view/View;", "(Lcom/example/mvvmexample/adapters/RecyclerAdapter;Landroid/view/View;)V", "bind", "", "blog", "Lcom/example/mvvmexample/models/NicePlace;", "app_debug"})
    public final class NotesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.view.View binding = null;
        
        public NotesViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.mvvmexample.models.NicePlace blog) {
        }
    }
}