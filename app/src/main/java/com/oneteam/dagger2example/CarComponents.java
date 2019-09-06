package com.oneteam.dagger2example;

import dagger.Component;

@Component
public interface CarComponents {


    void inject(MainActivity mainActivity);
}
