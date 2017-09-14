package com.dagger.example.presenter;


import javax.inject.Inject;

public class MainPresenter {

    @Inject
    public MainPresenter(){
      init();
    }

    private void init() {
        System.out.println("init() called !!! ");
    }

    public void onClick(){
        System.out.println("onClick() called !!! ");
    }
}
