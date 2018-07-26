package com.gdgistanbul.projectx.android.common.inject.component

import android.app.Application
import com.dialogmaster.android.common.inject.module.ActivityBuilderModule
import com.dialogmaster.android.common.inject.module.DataModule
import com.dialogmaster.android.common.inject.module.ViewModelModule
import com.gdgistanbul.projectx.android.ProjectXApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    DataModule::class,
    ViewModelModule::class,
    ActivityBuilderModule::class])
interface AppComponent : AndroidInjector<ProjectXApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<ProjectXApplication>() {
        @BindsInstance
        abstract fun app(application: Application): Builder
    }
}