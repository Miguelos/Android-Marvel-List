package me.miguelos.sample.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import me.miguelos.sample.common.TwoWaysMapper
import me.miguelos.sample.presentation.model.MarvelCharacter
import me.miguelos.sample.presentation.model.mappers.MarvelCharacterMapper
import me.miguelos.sample.util.imageloader.GlideImageLoader
import me.miguelos.sample.util.imageloader.ImageLoader
import javax.inject.Singleton
import me.miguelos.sample.domain.model.MarvelCharacter as DomainMarvelCharacter


@Module
@InstallIn(ApplicationComponent::class)
object PresentationModule {

    @Provides
    @Singleton
    fun provideMarvelCharacterMapper(): TwoWaysMapper<DomainMarvelCharacter, MarvelCharacter> =
        MarvelCharacterMapper()

    @Provides
    @Singleton
    fun provideImageLoader(context: Context): ImageLoader =
        GlideImageLoader(context)
}
