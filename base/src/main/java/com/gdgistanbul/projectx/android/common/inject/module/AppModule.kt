import android.content.Context
import com.gdgistanbul.projectx.android.ProjectXApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module()
class AppModule {

    @Provides
    @Singleton
    fun provideContext(eslMasterApplication: ProjectXApplication): Context {
        return eslMasterApplication.applicationContext
    }
}