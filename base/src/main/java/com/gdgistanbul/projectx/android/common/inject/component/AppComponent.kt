package com.gdgistanbul.projectx.android.common.inject.component

import android.app.Application
import com.gdgistanbul.projectx.android.ProjectXApplication
import com.gdgistanbul.projectx.android.common.inject.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    DataModule::class,
    ViewModelModule::class,
    ActivityBuilderModule::class,
    FragmentBuilderModule::class])
interface AppComponent : AndroidInjector<ProjectXApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<ProjectXApplication>() {
        @BindsInstance
        abstract fun app(application: Application): Builder
    }
}