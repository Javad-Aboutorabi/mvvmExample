package com.example.mvvmexample.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/example/mvvmexample/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "lst", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/example/mvvmexample/models/NicePlace;", "getLst", "()Landroidx/lifecycle/MutableLiveData;", "setLst", "(Landroidx/lifecycle/MutableLiveData;)V", "newlist", "getNewlist", "()Ljava/util/ArrayList;", "setNewlist", "(Ljava/util/ArrayList;)V", "add", "", "blog", "remove", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.mvvmexample.models.NicePlace>> lst;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.mvvmexample.models.NicePlace> newlist;
    
    public MainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.mvvmexample.models.NicePlace>> getLst() {
        return null;
    }
    
    public final void setLst(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.mvvmexample.models.NicePlace>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.mvvmexample.models.NicePlace> getNewlist() {
        return null;
    }
    
    public final void setNewlist(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.mvvmexample.models.NicePlace> p0) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    com.example.mvvmexample.models.NicePlace blog) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    com.example.mvvmexample.models.NicePlace blog) {
    }
}