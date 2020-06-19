package net.mikaelzero.app

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import net.mikaelzero.mojito.Mojito
import net.mikaelzero.mojito.loader.glide.GlideImageLoader
import net.mikaelzero.mojito.view.sketch.SketchContentViewImplFactory
import net.mikaelzero.mojito.view.sketch.SketchImageViewLoadFactory


class App : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
    override fun onCreate() {
        super.onCreate()
        Mojito.initialize(
            GlideImageLoader.with(this),
            SketchContentViewImplFactory(),
            SketchImageViewLoadFactory()
        )
    }
}