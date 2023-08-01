package com.jaya.bootcamp.instagram.ui.splash

import androidx.lifecycle.MutableLiveData
import com.jaya.bootcamp.instagram.data.repository.UserRepository
import com.jaya.bootcamp.instagram.ui.base.BaseViewModel
import com.jaya.bootcamp.instagram.utils.common.Event
import com.jaya.bootcamp.instagram.utils.network.NetworkHelper
import com.jaya.bootcamp.instagram.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable


class SplashViewModel(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper,
    val userRepository: UserRepository
) : BaseViewModel(schedulerProvider, compositeDisposable, networkHelper) {

    // Event is used by the view model to tell the activity to launch another Activity
    // view model also provided the Bundle in the event that is needed for the Activity
    val launchDummy: MutableLiveData<Event<Map<String, String>>> = MutableLiveData()
    val launchLogin: MutableLiveData<Event<Map<String, String>>> = MutableLiveData()

    override fun onCreate() {
        // Empty map of key and serialized value is passed to Activity in Event that is needed by the other Activity
        if (userRepository.getCurrentUser() != null)
            launchDummy.postValue(Event(emptyMap()))
        else
            launchLogin.postValue(Event(emptyMap()))
    }
}