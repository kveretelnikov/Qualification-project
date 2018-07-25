package com.leventime.qualificationproject.base.di.app;

import com.leventime.qualificationproject.base.di.features.login.LoginComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * App component
 */
@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent{

    LoginComponent.Builder loginComponentBuilder();
}